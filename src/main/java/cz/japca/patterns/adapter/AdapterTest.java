package cz.japca.patterns.adapter;

/**
 * Created by Jakub Krhovják on 5/20/18.
 */
public class AdapterTest {

	enum AdapterType {WRAPPER, CHILD}

	public static void main(String[] args) {
		//-------- Wrapper Adapter ----------------
		Movable movable = getMovable(AdapterType.WRAPPER);
		movable.move(new Point(2, 3));


		//-------- Child Adapter -------------------
		movable = getMovable(AdapterType.CHILD);
		movable.move(new Point(5, 7));


	}

	private static Movable getMovable(AdapterType adapterType) {
		switch (adapterType) {
			case WRAPPER:
				return new WrapperAdapter(new Car());
			case CHILD:
				return new ChildAdapter();
			default:
				throw new IllegalArgumentException("Unexpected adapters type : " + adapterType);
		}
	}
}
