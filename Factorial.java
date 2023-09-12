import java.util.Scanner;

public class Factorial {

	public static int factorial(int n) {
		int fact = 1;

		// using while loop
		// while(n>0) {
		// fact = fact*n;
		// n--;
		// }

		// using for loop
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = sc.nextInt();
		System.out.println(factorial(n));

	}

}
