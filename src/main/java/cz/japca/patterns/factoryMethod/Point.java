package cz.japca.patterns.factoryMethod;

import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/**
 * Created by Jakub Krhovják on 4/25/18.
 */
public class Point {

	private int x, y;

	private Point(int x, int y) {

	}

public static 	class MyFactory implements ThreadFactory {

		@Override
		public Thread newThread(Runnable r) {
			Thread thread = new Thread(r,"ahoj");
			return thread;
		}
	}

	@Slf4j
	public static class Task implements Runnable {

		@Override
		public void run() {
			log.info("fafdsafsd");
			try {
				Thread.currentThread().sleep(200);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			log.info("fafdsafsd");
		}
	}

//	public static Point newPoint(Function<Integer, Point> supplier) {
//		return supplier.apply(new Point(25, 25));
//	}

	public static void main(String[] args) throws InterruptedException {
		ExecutorService service = Executors.newCachedThreadPool(new MyFactory());
		service.execute(new Task());
		Thread.sleep(2000);
	}
}

//enum CoordinateSystem
//{
//	CARTESIAN,
//	POLAR
//}
//
//class Point
//{
//	private double x, y;
//
//	protected Point(double x, double y)
//	{
//		this.x = x;
//		this.y = y;
//	}
//
//	public Point(double a,
//				 double b, // names do not communicate intent
//				 CoordinateSystem cs)
//	{
//		switch (cs)
//		{
//			case CARTESIAN:
//				this.x = a;
//				this.y = b;
//				break;
//			case POLAR:
//				this.x = a * Math.cos(b);
//				this.y = a * Math.sin(b);
//				break;
//		}
//	}
//
//	// steps to add a new system
//	// 1. augment CoordinateSystem
//	// 2. change ctor
//
//	// singleton field
//	public static final Point ORIGIN = new Point(0,0);
//
//	// factory method
//	public static Point newCartesianPoint(double x, double y)
//	{
//		return new Point(x,y);
//	}
//
//	public static Point newPolarPoint(double rho, double theta)
//	{
//		return new Point(rho*Math.cos(theta), rho*Math.sin(theta));
//	}
//
//	public static class Factory
//	{
//		public static Point newCartesianPoint(double x, double y)
//		{
//			return new Point(x,y);
//		}
//	}
//}
//
//class PointFactory
//{
//	public static Point newCartesianPoint(double x, double y)
//	{
//		return new Point(x,y);
//	}
//}
//
//class FactoryDemo
//{
//	public static void main(String[] args)
//	{
//		Point point = new Point(2, 3, CoordinateSystem.CARTESIAN);
//		Point origin = Point.ORIGIN;
//
//		Point point1 = Point.Factory.newCartesianPoint(1, 2);
//	}
//}
