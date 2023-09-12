public class SpyNumber {

	public static boolean isSpy(int n) {

		int sum = 0;
		int pro = 1;

		while (n > 0) {
			int lastdigit = n % 10;
			sum = sum + lastdigit;
			pro = pro * lastdigit;
			n = n / 10;
		}
		if (sum == pro) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println(isSpy(123));
	}

}
