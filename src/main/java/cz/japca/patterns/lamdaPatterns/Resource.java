package cz.japca.patterns.lamdaPatterns;

import java.util.function.Consumer;

class Resource {
	private Resource() {
		System.out.println("Instance created");
	}

	public void op1() {
		System.out.println("op1 called....");
	}

	public void op2() {
		System.out.println("op2 called...");
	}

	private void close() {
		System.out.println("do any cleanup here...");
	}

	public static void use(Consumer<Resource> consume) {
		Resource resource = new Resource();
		try {
			consume.accept(resource);
		} finally {
			resource.close();
		}
	}

	public static void main(String[] args) {
		Resource.use(resource -> {
			resource.op1();
			resource.op2();
		});
	}
}

