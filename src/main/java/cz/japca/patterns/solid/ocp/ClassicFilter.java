package cz.japca.patterns.solid.ocp;

import java.util.List;
import java.util.stream.Stream;

/**
 * Created by Jakub Krhovják on 4/23/18.
 */
public class ClassicFilter {

	public Stream<Item> filterByColor(List<Item> items, Color color) {
		return items.stream().filter(p -> p.getColor() == color);
	}

	public Stream<Item> filterBySize(List<Item> items, Size size) {
		return items.stream().filter(p -> p.getSize() == size);
	}

	public Stream<Item> filterBySizeAndColor(List<Item> items, Size size, Color color) {
		return items.stream().filter(p -> p.getSize() == size && p.getColor() == color);
	}
}
