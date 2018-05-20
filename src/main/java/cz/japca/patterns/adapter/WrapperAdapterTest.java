package cz.japca.patterns.adapter;

/**
 * Created by Jakub Krhovják on 5/20/18.
 */
public class WrapperAdapterTest {

	public static void main(String[] args) {
		Movable movable = new CarAdapter(new Car());
		movable.move(new Point(2, 3));
	}
}
