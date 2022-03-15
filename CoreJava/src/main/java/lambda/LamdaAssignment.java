package lambda;

import java.util.function.Consumer;
import java.util.function.Supplier;

/**
 * Use Supplier if it takes nothing, but returns something.
 * 
 * Use Consumer if it takes something, but returns nothing.
 * 
 * Use Callable if it returns a result and might throw (most akin to Thunk in
 * general CS terms).
 * 
 * Use Runnable if it does neither and cannot throw.
 * 
 * @author RachitChawla
 *
 */
public class LamdaAssignment {
	public static void main(String[] args) {
		Runnable fun = () -> System.out.println("Hello Lamda!");
		fun.run();
		Consumer<Integer> consumer = (i) -> System.out.println("I am i->" + i);
		consumer.accept(9);
		Supplier<Integer> supply = () -> 9;
		System.out.println("I got ->" + supply.get());
		
	}

}
