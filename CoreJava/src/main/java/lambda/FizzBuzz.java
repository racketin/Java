package lambda;

import java.util.Optional;

/* Problem: For a given natural number greater than zero return:
    “Fizz” if the number is dividable by 3
    “Buzz” if the number is dividable by 5
    “FizzBuzz” if the number is dividable by 15
     Same number if the number is neither divisible by 3 nor 5.

Read more: https://javarevisited.blogspot.com/2015/04/fizzbuzz-solution-in-java-8.html#ixzz77rlKiplN
*/
public class FizzBuzz {
	public static void main(String[] args) {
		System.out.println(print(5));
	}

	private static String print(int number) {
		return Optional.of(number).map(key -> (key % 3 == 0? "Fizz":"") + (key % 5 == 0 ? "Buzz":"")).get();
	}
}
