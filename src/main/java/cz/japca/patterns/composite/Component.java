package cz.japca.patterns.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jakub Krhovják on 6/3/18.
 */

public class Component {

	private List<Component> components = new ArrayList<>();

	public void add(Component component) {
		components.add(component);
	}

	@Override
	public String toString() {
		String result = "Container\n";
		for(Component component : components) {
			result += component.toString();
		}
		return result;
	}
}
