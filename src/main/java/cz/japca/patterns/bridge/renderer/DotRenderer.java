package cz.japca.patterns.bridge.renderer;

import com.diogonunes.jcdp.color.ColoredPrinter;
import com.diogonunes.jcdp.color.api.Ansi;

import java.util.stream.IntStream;

/**
 * Created by Jakub Krhovják on 5/27/18.
 */
public class DotRenderer implements Renderer {

	ColoredPrinter cp = new ColoredPrinter.Builder(1, false)	.build();

	@Override
	public void render(int length, Ansi.FColor color) {
		IntStream.rangeClosed(0, length).forEach(i -> cp.
				print(".", Ansi.Attribute.NONE, color, Ansi.BColor.NONE));
		System.out.println();
	}
}
