import java.util.Scanner;

public class Reverse {

	public static int reverseNumber(int n) {
		int rev = 0;
		while (n > 0) {
			int last_digit = n % 10;
			rev = rev * 10 + last_digit;
			n = n / 10;
		}
		return rev;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:");
		int n = sc.nextInt();
		System.out.println(reverseNumber(n));
	}
}
