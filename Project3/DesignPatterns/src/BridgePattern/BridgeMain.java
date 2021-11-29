package BridgePattern;

public class BridgeMain {

	
	public static void main(String [] args) {
		Operation add = new Addition();
		Operation mul = new Multiplication();
		Operation div = new Division();
		Operation sub = new Subtraction();
		
		System.out.println(add.doOperation(3, 4));
		System.out.println(mul.doOperation(5, 6));
		System.out.println(div.doOperation(24, 3));
		System.out.println(sub.doOperation(8, 4));
	}
}
