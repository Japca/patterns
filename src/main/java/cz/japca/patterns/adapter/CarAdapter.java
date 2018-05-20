package cz.japca.patterns.adapter;

import lombok.AllArgsConstructor;

/**
 * Created by Jakub Krhovják on 5/20/18.
 */

@AllArgsConstructor
public class CarAdapter implements Movable {

	private Car car;

	@Override
	public void move(Point point) {
		car.move(point.getX(), point.getY());
	}
}
