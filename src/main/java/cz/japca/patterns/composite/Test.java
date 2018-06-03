package cz.japca.patterns.composite;

/**
 * Created by Jakub Krhovják on 6/3/18.
 */
public class Test {

	public static void main(String[] args) {
		Point point1 = new Point(0,0);
		Line line1 = new Line(new Point(1, 5), new Point(5, 2));
		Line line2 = new Line(new Point(3, 5), new Point(10, 2));
		Point point2 = new Point(3,0);

		Component component = new Component();
		component.add(point1);
		component.add(line1);
		component.add(line2);
		component.add(point2);
		System.out.println(component);


	}
}
