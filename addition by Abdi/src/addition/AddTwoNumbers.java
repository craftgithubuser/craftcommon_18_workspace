package addition;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		int num1, num2, sum ;
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter first number");
		num1 = scanner.nextInt();
		System.out.print("Enter second number");
		num2 = scanner.nextInt();
		scanner.close();
		sum = num1 + num2;
		System.out.println("the sum is "+ sum);
		
	}

}
