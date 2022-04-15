package lambda;

public class MainFunctionalInterface {
	public static void main(String[] args) {
		CustomFunctionInterface cust = new CustomFunctionInterface() {

			@Override
			public void apply() {
				System.out.println("I am custom");
			}
		};
		cust.apply();
		CustomFunctionInterface custLamda = () -> System.out.println("I am custom lamda");
		custLamda.apply();
		CustomFunctionInterface custLamdaStatic = MainFunctionalInterface::staticMethod;
		custLamdaStatic.apply();
		
	}
	
	static void staticMethod( ) {
		System.out.println("I am static");
	}
}
