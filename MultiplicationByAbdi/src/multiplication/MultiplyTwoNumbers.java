package multiplication;
import java.util.Scanner;
public class MultiplyTwoNumbers {

	public static void main(String[] args) {
	
		int num1, num2, multiplication;
		Scanner scanner = new Scanner(System.in);
	System.out.print("enter First number ");
	num1 = scanner.nextInt();
	System.out.print("Enter Second Number ");
	num2 = scanner.nextInt();
	scanner.close();
	multiplication =num1 * num2 ;
	System.out.println("The diffrence is "+ multiplication);
	
	
	

	}

}
