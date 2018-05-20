package cz.japca.patterns.adapter;

/**
 * Created by Jakub Krhovják on 5/20/18.
 */
public class ChildAdapter extends Car implements Movable {

	@Override
	public void move(Point point) {
		move(point.getX(), point.getY());
	}
}
