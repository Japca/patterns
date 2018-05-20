package cz.japca.patterns.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 5/20/18.
 */
@Slf4j
public class InnerClassSingleton {

	private InnerClassSingleton() {
		log.info("InnerClassSingleton created");
	}
	public static InnerClassSingleton getInstance() {
		return Instance.INSTANCE;
	}

	private static class Instance {
		private static final InnerClassSingleton INSTANCE = new InnerClassSingleton();
	}



	//------------ Test -----------------------
	public static void test() {
		log.info("Testing InnerClassSingleton creation");
	}
}
