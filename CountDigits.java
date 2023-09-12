import java.util.Scanner;

public class CountDigits {

	public static int digits(int n) {
		int count = 0;

		// using while loop
		while (n > 0) { 
			n = n / 10; 
			count++; 
		}

		// using for loop
		// for(;n>0;n=n/10) {
		// count++;
		// }
		return count;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.println(digits(n));
		sc.close();
	}

}
