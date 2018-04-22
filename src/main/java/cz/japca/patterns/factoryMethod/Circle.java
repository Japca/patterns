package cz.japca.patterns.factoryMethod;

/**
 * Created by Jakub krhovják on 3/5/18.
 */
public class Circle implements Shape {
	@Override
	public void draw() {
		System.err.println("Inside Square::draw() method.");
	}
}
