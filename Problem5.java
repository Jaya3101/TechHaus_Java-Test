package TechHausTestProblem;
import java.util.Scanner;

/* Problem 5
Write a program that computes the income tax for a person having specified income */

public class Problem5 {

	public static void main(String[] args) {
		double tax=0;
		double it;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter income ");
		it=sc.nextDouble();
		if(it<=250000)
			tax=0;
		else if(it<=500000)
			tax=0.1*(it-250000);
		else if(it<=1000000)
			tax=0.1*(500000-250000)+0.2*(it-500000);
		else
			tax=0.1*(500000-250000)+0.2*(1000000-500000)+0.3*(it-1000000);
		System.out.println("Income tax amount is "+tax);
		
	}

}
