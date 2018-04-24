package cz.japca.patterns.builder;

/**
 * Created by Jakub krhovják on 3/5/18.
 */
public class Task {

	private final long id;
	private final String taskName;
	private final boolean parallel;

	private Task(Builder builder) {
		this.id = builder.id;
		this.taskName = builder.taskName;
		this.parallel = builder.set;
	}

	public long getId() {
		return id;
	}

	public String getTaskName() {
		return taskName;
	}

	public boolean isParallel() {
		return parallel;
	}

	@Override
	public String toString() {
		return "Task{" + "id=" + id + ", taskName='" + taskName + '\'' + ", parallel=" + parallel + '}';
	}

	public static class Builder {
		private long id;
		private String taskName;
		private boolean set;

		public Builder(long id) {
			this.id = id;
		}

		public Builder setId(long id) {
			this.id = id;
			return this;
		}

		public Builder setTaskName(String taskName) {
			this.taskName = taskName;
			return this;
		}

		public Builder setSet(boolean set) {
			this.set = set;
			return this;
		}

		public Task build() {
			return new Task(this);
		}

	}
}
