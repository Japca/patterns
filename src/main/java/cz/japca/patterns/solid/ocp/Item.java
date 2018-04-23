package cz.japca.patterns.solid.ocp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.ToString;

/**
 * Created by Jakub Krhovják on 4/23/18.
 */
@Data
@AllArgsConstructor
@ToString
public class Item {

	private String name;
	private Color color;
	private Size size;


}
