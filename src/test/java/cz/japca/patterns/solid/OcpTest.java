package cz.japca.patterns.solid;

import cz.japca.patterns.solid.ocp.Color;
import cz.japca.patterns.solid.ocp.Item;
import cz.japca.patterns.solid.ocp.LambdaFilter;
import cz.japca.patterns.solid.ocp.Size;
import org.junit.Test;

import java.util.List;

import static java.util.stream.Collectors.toList;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Created by Jakub Krhovják on 4/23/18.
 */
public class OcpTest {

	@Test
	public void ocpTest() {
		Item apple = new Item("Apple", Color.GREEN, Size.SMALL);
		Item tree = new Item("Tree", Color.GREEN, Size.LARGE);
		Item house = new Item("House", Color.BLUE, Size.LARGE);

		List<Item> items = List.of(apple, tree, house);


		LambdaFilter lambdaFilter = new LambdaFilter();

		List<Item> itemsByColor = lambdaFilter.filter(items, item -> Color.GREEN == item.getColor()).collect(toList());
		assertThat(itemsByColor).asList().containsOnly(apple, tree);

		List<Item> itemsBySize = lambdaFilter.filter(items, item -> Size.LARGE == item.getSize()).collect(toList());
		assertThat(itemsBySize).asList().containsOnly(house, tree);

		List<Item> itemsByColorAndSize = lambdaFilter.filter(items, item ->
				Size.LARGE == item.getSize() &&
				Color.BLUE == item.getColor()
		).collect(toList());

		assertThat(itemsByColorAndSize).asList().containsOnly(house);

	}

}
