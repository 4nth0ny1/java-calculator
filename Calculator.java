import java.util.Scanner;
import java.util.Arrays;  


public class Calculator {
	// public static void main(String[] args) {

	// 	Scanner scan = new Scanner(System.in);
	// 	double fnum, snum, answer;
	// 	System.out.println("Enter first number: ");
	// 	fnum = scan.nextDouble();
	// 	System.out.println("Enter first number: ");
	// 	snum = scan.nextDouble();
	// 	answer = fnum + snum; 
	// 	System.out.println(answer);

	// }

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double firstN, secondN, answer, operation;
		
		System.out.println("Enter 1 for add");
		System.out.println("Enter 2 for subtract");
		System.out.println("Enter 3 for multiplication");
		System.out.println("Enter 4 for divide");
		operation = scan.nextDouble();

		System.out.println("Enter first number: ");
		firstN = scan.nextDouble();
			
		System.out.println("Enter second number: ");
		secondN = scan.nextDouble();
		
		if (operation == 1) {
			answer = firstN + secondN;
			System.out.println(answer);
		}

		if (operation == 2) {
			answer = firstN - secondN;
			System.out.println(answer);
		}

		if (operation == 3) {
			answer = firstN * secondN;
			System.out.println(answer);
		}

		if (operation == 4) {
			answer = firstN / secondN;
			System.out.println(answer);
		}
	}

}