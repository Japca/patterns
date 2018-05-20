package cz.japca.patterns.SimplefactoryMethod;

/**
 * Created by Jakub krhovják on 3/5/18.
 */
public interface Shape {

	void draw();

	enum ShapeType {
		CIRCLE,
		RECTANGLE,
		SQUARE
	}

	static Shape of(ShapeType shapeType) {
		switch (shapeType) {
			case CIRCLE:
				return new Circle();
			case SQUARE:
				return new Square();
			case RECTANGLE:
				return new Rectangle();
			default:
				throw new IllegalArgumentException("Unknown shape " + shapeType);
		}
	}
}
