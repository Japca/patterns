package cz.japca.patterns.bridge.renderer;

import com.diogonunes.jcdp.color.api.Ansi;

/**
 * Created by Jakub Krhovják on 5/27/18.
 */
public interface Renderer {

	void render(int length, Ansi.FColor color);
}
