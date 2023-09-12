import java.util.Scanner;

public class NeonNumber { 

	public static boolean isNeon(int n) {
		int sum= 0;
		int sq=n*n;
		while(sq>0) {
			int lastdigit=sq%10;
			sum= sum+lastdigit; 
			sq=sq/10;
		}
		if(sum==n) {
			return true;
		}
		else { 
			return false;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: "); 
		int n = sc.nextInt();
		System.out.println(isNeon(n));

	}

}
