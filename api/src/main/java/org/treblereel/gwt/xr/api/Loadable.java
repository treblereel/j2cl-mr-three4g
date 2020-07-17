package org.treblereel.gwt.xr.api;

import jsinterop.annotations.JsMethod;
import jsinterop.annotations.JsType;

/**
 * @author Dmitrii Tikhomirov
 * Created by treblereel 7/16/20
 */
@JsType
public abstract class Loadable {

    @JsMethod
    public native void register(Context context);

    @JsMethod
    public native void start();
}
