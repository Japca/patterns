package cz.japca.patterns.solid.ocp;

import lombok.AllArgsConstructor;
import lombok.ToString;

/**
 * Created by Jakub Krhovják on 4/23/18.
 */
//@Data
@AllArgsConstructor
@ToString
public class Item {

	private String name;
	private Color color;
	private Size size;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}

	public Size getSize() {
		return size;
	}

	public void setSize(Size size) {
		this.size = size;
	}
}
