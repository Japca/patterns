package cz.japca.patterns.bridge.painter;

import com.diogonunes.jcdp.color.api.Ansi;
import cz.japca.patterns.bridge.renderer.Renderer;

/**
 * Created by Jakub Krhovják on 5/27/18.
 */
public class GreenPainter implements Painter {

	private Renderer renderer;

	public GreenPainter(Renderer renderer) {
		this.renderer = renderer;
	}

	@Override
	public void paint(int length) {
		renderer.render(length,  Ansi.FColor.GREEN);
	}


	public void setRenderer(Renderer renderer) {
		this.renderer = renderer;
	}
}
