package TechHausTestProblem;
import java.util.Scanner;

/* Problem 8
Write a program that accepts the number of seconds and returns its time equivalent in days, hours, minutes and seconds. For example, given “21893872” (without quotes), the program must return “253 Day(s) 9 Hour(s) 37 Minute(s) 52 Second(s)” (without quotes). */

public class Problem8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of seconds: ");
        long totalSeconds = sc.nextLong();

        long days = totalSeconds / (24 * 3600);
        totalSeconds %= (24 * 3600);
        long hours = totalSeconds / 3600;
        totalSeconds %= 3600;
        long minutes = totalSeconds / 60;
        long seconds = totalSeconds % 60;

        System.out.println(totalSeconds + " seconds is equivalent to " + days + " Day(s) "
                + hours + " Hour(s) " + minutes + " Minute(s) " + seconds + " Second(s)");
		
	}

}
