package cz.japca.patterns.builder;

import org.junit.Test;

/**
 * Created by Jakub Krhovják on 4/24/18.
 */
public class BuilderTest {


	@Test
	public void builderTest() {
		Task task = new Task.Builder(3)
				.setTaskName("tak name")
				.setSet(true)
				.build();

		TaskLombock taskLombock = TaskLombock.builder(36).
				taskName("Lombock task name")
				.parallel(false)
				.build();


	}
}
