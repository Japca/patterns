package cz.japca.patterns.composite;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Jakub Krhovják on 6/3/18.
 */
@Data
@AllArgsConstructor
public class Line extends Component{

	private final Point a;
	private final Point b;


	@Override
	public String toString() {
		int length = Math.abs(a.getX() - b.getX());
		 String line = ".";
		for(int i = 0; i < length; i++) {
			if(i > 0) {
				line += ".";
			}
		}

		line += "\n";
		return line;
	}
}
