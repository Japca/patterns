package cz.japca.patterns.lamdaPatterns;

import java.util.function.Function;


public class FunctionAndThen {

	public static void make(String value, Function<String, String> function) {
		System.out.println(function.apply(value));
	}

	public static void main(String[] args) {
		Function<String, String> add = e -> e + " added";
		Function<String, String> twice = e -> e + e;

		make("Twice", twice);

		make("Twice", add.andThen(twice));
	}


}
