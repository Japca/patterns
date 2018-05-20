package cz.japca.patterns.singleton;


import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub krhovják on 3/5/18.
 */
@Slf4j
public final class Singleton {

	private static final Singleton SINGLETON = new Singleton();

	private Singleton() {
		log.info("Singleton created");
	}

	public static Singleton getInstance() {
		return SINGLETON;
	}



	//--------------- Test -----------------

	public static void test() {
		log.info("Testing singleton creation");
	}
}
