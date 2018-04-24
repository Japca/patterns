package cz.japca.patterns.builder;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

/**
 * Created by Jakub Krhovják on 4/24/18.
 */
@Builder
@ToString
@Getter
public class TaskLombock {

	private final long id;
	private final String taskName;
	private final  boolean set;

	public static TaskLombockBuilder builder(long id){
		return new TaskLombockBuilder().id(id);
	}


}
