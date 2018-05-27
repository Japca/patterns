package cz.japca.patterns.bridge.painter;

import cz.japca.patterns.bridge.renderer.Renderer;

/**
 * Created by Jakub Krhovják on 5/27/18.
 */
public interface Painter {

	void paint(int length);

	void setRenderer(Renderer renderer);
}
