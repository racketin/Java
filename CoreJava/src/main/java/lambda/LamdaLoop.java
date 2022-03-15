package lambda;

public class LamdaLoop {
	public static void main(String[] args) {
		// Just a function
		Lamda j = () -> {
			for (int i = 0; i < 10; i++)
				System.out.println(i);
		};

		// execute the function
		j.run();
	}
}

interface Lamda {
	void run();
}