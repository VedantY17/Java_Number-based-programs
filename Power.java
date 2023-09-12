import java.util.Scanner;

public class Power {

    public static int findPower(int number, int power) {

        int pro = 1;

        for (int i = 1; i <= power; i++) {
            pro = pro * number;
        }
        return pro;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = sc.nextInt();
        System.out.print("Enter the Power: ");
        int power = sc.nextInt();

        System.out.println("the final answer is: " + findPower(number, power));
    }

}
