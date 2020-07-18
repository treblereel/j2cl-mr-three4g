package org.treblereel;

import elemental2.dom.DomGlobal;
import elemental2.dom.Event;
import elemental2.dom.XMLHttpRequest;
import jsinterop.annotations.JsMethod;
import org.gwtproject.core.client.ScriptInjector;
import org.treblereel.gwt.three4g.THREE;
import org.treblereel.gwt.xr.api.Context;
import org.treblereel.gwt.xr.api.Loadable;

public class Starter {

    public void onModuleLoad() {
        DomGlobal.console.log(THREE.RGB_ETC1_Format);

        XMLHttpRequest req = new XMLHttpRequest();
        req.onreadystatechange = new XMLHttpRequest.OnreadystatechangeFn() {
            boolean receivingMsg;

            @Override
            public Object onInvoke(Event p0) {
                XMLHttpRequest xhr = req;
                if (xhr.readyState == 3 && !receivingMsg) {
                    receivingMsg = true;
                } else if (xhr.readyState == 4) {
                    if (xhr.status != 200) {
                        DomGlobal.console.log(" status: " +
                                                      xhr.status + "/" + xhr.statusText + "\n");
                    } else {
                        String response = xhr.responseText;
                        DomGlobal.console.log(response);
                        DomGlobal.console.log("*****************************");
                        ScriptInjector.fromString(response).inject();

                        Loadable loadable = newInstance("application");
                        loadable.register(new Context());
                        loadable.start();
                    }
                }
                return null;
            }
        };

        req.open("GET", "application.js", true);
        req.send();

        DomGlobal.console.log("?");
    }

    @JsMethod
    public native static Loadable newInstance(String name);
}
