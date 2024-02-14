package TechHausTestProblem;
import java.util.Scanner;

/* Problem 9
Write a program that accepts an integer and determines if it is a two-digit special integer. */

public class Problem9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        boolean isSpecial = isTwoDigitSpecial(num);

        if (isSpecial) {
            System.out.println(num + " is a two-digit special integer.");
        } else {
            System.out.println(num + " is not a two-digit special integer.");
        }
    }

    public static boolean isTwoDigitSpecial(int num) {
        if (num >= 10 && num <= 99) {
            int tensDigit = num / 10;
            int onesDigit = num % 10;
            int sum = tensDigit + onesDigit + (tensDigit * onesDigit);
            return sum == num;
        } else {
            return false;
        }
		
	}

}
