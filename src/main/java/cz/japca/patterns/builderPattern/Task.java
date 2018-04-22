package cz.japca.patterns.builderPattern;

/**
 * Created by Jakub krhovják on 3/5/18.
 */
public class Task {

	private long id;
	private String taskName;
	private boolean set;

	private Task(Builder builder) {
		this.id = builder.id;
		this.taskName = builder.taskName;
		this.set = builder.set;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTaskName() {
		return taskName;
	}

	public void setTaskName(String taskName) {
		this.taskName = taskName;
	}

	public boolean isSet() {
		return set;
	}

	public void setSet(boolean set) {
		this.set = set;
	}

	@Override
	public String toString() {
		return "Task{" + "id=" + id + ", taskName='" + taskName + '\'' + ", set=" + set + '}';
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
