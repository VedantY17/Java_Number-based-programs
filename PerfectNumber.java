import java.util.Scanner;

public class PerfectNumber {

	public static boolean isPerfect(int n) {

		int sum = 0;

		// to find factors
		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				sum = sum + i;
			}
		}
		if (sum == n) {
			return true;
		} else {
			return false;
		}

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		int n = sc.nextInt();
		System.out.println(isPerfect(n));
	}

}
