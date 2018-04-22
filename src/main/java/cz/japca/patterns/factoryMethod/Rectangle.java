package cz.japca.patterns.factoryMethod;

/**
 * Created by Jakub krhovják on 3/5/18.
 */
public class Rectangle implements Shape {
	@Override
	public void draw() {
		System.err.println("Inside Circle::draw() method.");
	}
}
