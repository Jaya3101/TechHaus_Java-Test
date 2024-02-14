package TechHausTestProblem;
import java.util.Scanner;

/* Problem 7
Write a program that accepts the rate of retail inflation and number of years, and prints the compounded inflation at the end of the specified number of years. For example, if the retail inflation rate is specified as 20% and number of years as 5, the compounded retail inflation at the end of 5 years will be 1.25 = 2.49 = 149%. */

public class Problem7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the rate of retail inflation (in percentage): ");
        double inflationRate = sc.nextDouble() / 100;

        System.out.print("Enter the number of years: ");
        int numofYears = sc.nextInt();

        double compoundedInflation = Math.pow(1 + inflationRate, numofYears);
        double compoundedInflationPercentage = (compoundedInflation - 1) * 100;

        System.out.println("The compounded retail inflation at the end of " + numofYears + " years will be " + compoundedInflationPercentage + "%");
		
	}

}
