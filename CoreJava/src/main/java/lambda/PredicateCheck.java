package lambda;

import java.util.function.Predicate;

public class PredicateCheck {
	public static void main(String[] args) {

		// Creating predicate
		Predicate<Integer> lesserthan = i -> (i <= 10);

		// Calling Predicate method
		System.out.println(lesserthan.test(8));

		System.out.println(checkCondition(8).test(10));
	}

	private static Predicate<Integer> checkCondition(int value) {
		return (val) -> value <= 10;
	}
}