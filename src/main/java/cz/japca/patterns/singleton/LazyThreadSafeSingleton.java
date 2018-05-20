package cz.japca.patterns.singleton;

/**
 * Created by Jakub Krhovják on 5/20/18.
 */
public class LazyThreadSafeSingleton {


	private static LazyThreadSafeSingleton SINGLETON = null;

	private LazyThreadSafeSingleton() {
	}

	public static LazyThreadSafeSingleton getInstance() {
		if (SINGLETON == null) {
			synchronized (LazyThreadSafeSingleton.class) {
				if(SINGLETON == null) {
					SINGLETON = new LazyThreadSafeSingleton();
				}
			}
		}
		return SINGLETON;
	}
}
