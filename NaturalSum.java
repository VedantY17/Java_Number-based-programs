//write a program to print the sum of given natural numbers.
public class NaturalSum {

	public static void main(String[] args) {

		int n = 10;
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}
