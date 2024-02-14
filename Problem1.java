package TechHausTestProblem;
import java.util.Scanner;

/* Problem 1
Write a program that prints the number of digits in an integer. For example, given the integer “34” (without quotes) as the input, the program must print “2” (without quotes) as the output, given “-7291” (without quotes), the program must print “4” (without quotes), and so on. */

public class Problem1 {
	

	public static void main(String[] args) {
		
		System.out.println("Enter the Integer");
		Scanner sc = new Scanner(System.in);
		int count = 0;
		int n;
		n = sc.nextInt();
		
		while(n>0) {
			n = n/10;
			count++;
		}
		System.out.println("Number of digits in  an integer are:- " +count);
	}

}
