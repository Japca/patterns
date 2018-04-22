package cz.japca.patterns.singleton;


/**
 * Created by Jakub krhovják on 3/5/18.
 */
public final class Singleton {

	private static final Singleton SINGLETON = new Singleton();

	private Singleton() {
	}

	public static Singleton getInstance() {
		return SINGLETON;
	}
}
