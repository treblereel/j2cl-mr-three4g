package org.treblereel;

import elemental2.dom.DomGlobal;
import elemental2.dom.Event;
import elemental2.dom.XMLHttpRequest;
import jsinterop.annotations.JsMethod;
import org.gwtproject.core.client.ScriptInjector;
import org.treblereel.gwt.three4g.THREE;
import org.treblereel.gwt.three4g.cameras.PerspectiveCamera;
import org.treblereel.gwt.three4g.geometries.BoxBufferGeometry;
import org.treblereel.gwt.three4g.loaders.TextureLoader;
import org.treblereel.gwt.three4g.materials.MeshBasicMaterial;
import org.treblereel.gwt.three4g.materials.parameters.MeshBasicMaterialParameters;
import org.treblereel.gwt.three4g.objects.Mesh;
import org.treblereel.gwt.three4g.renderers.WebGLRenderer;
import org.treblereel.gwt.three4g.renderers.parameters.WebGLRendererParameters;
import org.treblereel.gwt.three4g.scenes.Scene;
import org.treblereel.gwt.three4g.textures.Texture;
import org.treblereel.gwt.xr.api.Context;
import org.treblereel.gwt.xr.api.Loadable;

import static elemental2.dom.DomGlobal.window;

public class Starter {

    protected Scene scene;
    protected Mesh mesh;
    protected float aspect = new Float((getWidth() / getHeight()));
    private PerspectiveCamera camera;
    private WebGLRenderer renderer;

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

        WebGLRendererParameters rendererParameters = new WebGLRendererParameters();
        rendererParameters.antialias = true;
        renderer = new WebGLRenderer(rendererParameters);

        camera = new PerspectiveCamera(70, aspect, 1, 1000);
        camera.position.z = 400;

        scene = new Scene();
        Texture texture = new TextureLoader().load("https://threejs.org/examples/textures/crate.gif");

        BoxBufferGeometry geometry = new BoxBufferGeometry(200, 200, 200);
        MeshBasicMaterialParameters meshBasicMaterialParameters = new MeshBasicMaterialParameters();
        meshBasicMaterialParameters.map = texture;
        MeshBasicMaterial material = new MeshBasicMaterial(meshBasicMaterialParameters);

        mesh = new Mesh(geometry, material);
        scene.add(mesh);

        setupWebGLRenderer(renderer);
        DomGlobal.document.body.appendChild(renderer.domElement);

        animate();
    }

    @JsMethod
    public native static Loadable newInstance(String name);

    public void setupWebGLRenderer(WebGLRenderer webGLRenderer) {
        webGLRenderer.domElement.id = "viewer";
        webGLRenderer.setSize(getWidth(), getHeight());
    }

    public double getWidth() {
        return window.innerWidth * 0.8;
    }

    public double getHeight() {
        return window.innerHeight;
    }

    private void animate() {

        mesh.rotation.x += 0.005f;
        mesh.rotation.y += 0.01f;

        DomGlobal.requestAnimationFrame(timestamp -> {
            renderer.render(scene, camera);
            animate();
        });
    }
}
