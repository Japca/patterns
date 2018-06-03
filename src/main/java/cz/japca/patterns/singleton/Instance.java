package cz.japca.patterns.singleton;

import lombok.extern.slf4j.Slf4j;

/**
 * Created by Jakub Krhovják on 5/20/18.
 */
@Slf4j
public class Instance {

	private Instance() {
		log.info("Instance created");
	}
	public static Instance getInstance() {
		return InnerInstance.INSTANCE;
	}

	private static class InnerInstance {
		private static final Instance INSTANCE = new Instance();
	}



	//------------ Test -----------------------
	public static void test() {
		log.info("Testing Instance creation");
	}
}
