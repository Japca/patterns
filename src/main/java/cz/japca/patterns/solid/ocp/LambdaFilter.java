package cz.japca.patterns.solid.ocp;


import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

/**
 * Created by Jakub Krhovják on 4/23/18.
 */
public class LambdaFilter {

	public Stream<Item> filter(List<Item> items, Predicate<Item> selector) {
		return items.stream().filter(selector);
	}
}
