package cz.japca.patterns.lamdaPatterns;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Counting {
	public static int totalValues(List<Integer> numbers, Predicate<Integer> selector) {
//	    int total = 0;

//	    for(int number : numbers) {
//			if(selector.test(number)) {
//				total += number;
//			}
//	    }

//		  return numbers.stream()
//				  .filter(selector)
//				  .mapToInt(number -> number)
//				  .sum();

		return numbers.stream()
				.filter(selector)
				.reduce(0, Integer::sum);
	}


	public static void main(String[] args) {

		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		System.out.println(totalValues(numbers, number -> true));
		System.out.println(totalValues(numbers, number -> number % 2 == 0));
		System.out.println(totalValues(numbers, number -> number % 2 != 0));
	}

}
