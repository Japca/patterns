package cz.japca.patterns.factoryMethod;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

/**
 * Created by Jakub Krhovják on 4/25/18.
 */
public class FactoryMethodTest {
	@Test
	public void factoryMethodTest() {
		Shape circle = Shape.of(Shape.ShapeType.CIRCLE);
		assertThat(circle).isInstanceOf(Circle.class);
	}
}
