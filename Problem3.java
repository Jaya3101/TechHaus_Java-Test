package TechHausTestProblem;
import java.util.Scanner;

/* Problem 3
Write a program that accepts two numbers and returns the larger of the two. */

public class Problem3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		System.out.println("Enter First Number: ");
		num1 = sc.nextInt();
		int num2;
		System.out.println("Enter Second Number: ");
		num2 = sc.nextInt();
		
		if(num1>num2) {
			System.out.println("Larger Number is First number:- " +num1);
		}
		if(num1<num2) {
			System.out.println("Larger Number is First number:- " +num2);
		}
		else {
			System.out.println("Both Numbers are Equal");
		}
	}

}
