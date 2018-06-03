package cz.japca.patterns.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Jakub Krhovják on 6/3/18.
 */
@Data
@AllArgsConstructor
public class Point extends Component{

	private final int x;
	private final int y;

	@Override
	public String toString() {
		return ".\n";
	}
}
