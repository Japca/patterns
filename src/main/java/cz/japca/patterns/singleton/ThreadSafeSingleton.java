package cz.japca.patterns.singleton;

/**
 * Created by Jakub krhovják on 3/5/18.
 */
public final class ThreadSafeSingleton {

	private static ThreadSafeSingleton SINGLETON = null;

	private ThreadSafeSingleton() {
	}

	public static synchronized ThreadSafeSingleton getInstance() {
		if (SINGLETON == null) {
			SINGLETON = new ThreadSafeSingleton();
		}
		return SINGLETON;
	}
}
