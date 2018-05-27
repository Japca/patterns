package cz.japca.patterns.bridge;

import cz.japca.patterns.bridge.painter.BluePainter;
import cz.japca.patterns.bridge.painter.GreenPainter;
import cz.japca.patterns.bridge.painter.Painter;
import cz.japca.patterns.bridge.renderer.DashRenderer;
import cz.japca.patterns.bridge.renderer.DotRenderer;
import cz.japca.patterns.bridge.renderer.Renderer;

/**
 * Created by Jakub Krhovják on 5/27/18.
 */
public class BridgeTest {

	public static void main(String[] args) {
		Renderer dotRenderer = new DotRenderer();
		Renderer dashRenderer = new DashRenderer();

		Painter bluePainter = new BluePainter(dotRenderer);
		bluePainter.paint(30);

		Painter greenPainter = new GreenPainter(dashRenderer);
		greenPainter.paint(40);

		bluePainter.setRenderer(dashRenderer);
		bluePainter.paint(90);
	}
}
