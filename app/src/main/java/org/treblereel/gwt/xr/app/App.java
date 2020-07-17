package org.treblereel.gwt.xr.app;

import elemental2.dom.DomGlobal;
import jsinterop.annotations.JsConstructor;
import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;
import org.treblereel.gwt.xr.api.Context;
import org.treblereel.gwt.xr.api.JSON;
import org.treblereel.gwt.xr.api.Loadable;

@JsType
public class App extends Loadable {

    private Context context;

    @JsConstructor
    public App() {
        DomGlobal.console.log("App JsConstructor");
    }

    @JsMethod
    public void register(Context context) {
        DomGlobal.console.log("before register ");

        DomGlobal.console.log(JSON.stringify(context));

        this.context = context;
        DomGlobal.console.log("register " + context.getClass().getSimpleName());
    }

    @JsMethod
    public void start() {
        DomGlobal.console.log("start " + context.getClass().getSimpleName());
    }
}
