package reCapDemo_classes;

public class Main {

	public static void main(String[] args) {
		
		MathOperations mathOperations = new MathOperations();
		int result = 0;
		result = mathOperations.addition(10, 5);
		System.out.println("addition:" + result);
		
		result = mathOperations.subtraction(10, 5);
		System.out.println("subtraction:" + result);
		
		result = mathOperations.multiplication(10, 5);
		System.out.println("multiplication:" + result);
		
		result = mathOperations.division(10, 5);
		System.out.println("division:" + result);
	}
}
