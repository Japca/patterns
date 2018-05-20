package cz.japca.patterns.adapter;

/**
 * Created by Jakub Krhovják on 5/20/18.
 */
public class WrapperAdapterTest {

	public static void main(String[] args) {
		Movable movable = getMovable();
		movable.move(new Point(2, 3));
	}

	private static Movable getMovable() {
		return new CarAdapter(new Car());
	}
}
