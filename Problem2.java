package TechHausTestProblem;
import java.util.Scanner;

/* Problem 2
Write a program that takes the net price of a product including taxes and the tax rate, and computes the gross price before taxes. */

public class Problem2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Net price of a product including taxes: ");
		double netpriceincludingtext;
		netpriceincludingtext = sc.nextDouble();
		System.out.println("Text Rate: ");
		double textrate;
		textrate = sc.nextDouble();
		
		double grosspricebeforetaxes;
		
		grosspricebeforetaxes = netpriceincludingtext/(1+textrate);
		
		System.out.println("The Gross Price before Taxes is:- " +grosspricebeforetaxes);
	}

}
