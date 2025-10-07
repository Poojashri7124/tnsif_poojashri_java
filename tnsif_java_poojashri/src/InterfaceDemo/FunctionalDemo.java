package InterfaceDemo;

public class FunctionalDemo {

	public static void main(String[] args) {
		GreetingDemo gd = () -> 
		System.out.println("Hello Everyone, Welcome to the Java Session");
		
		gd.greet();

	}

}
