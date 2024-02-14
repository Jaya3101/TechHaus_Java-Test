package TechHausTestProblem;
import java.util.Scanner;

/* Problem 4
Write a program that finds the median of a sorted array of numbers, where the median of an array is defined as the number exactly in the middle of the sorted array.
When the array contains an odd number of numbers, the median is the number exactly in the middle and when the array contains an even number of numbers, the median is the average of the two numbers exactly in the middle. */

public class Problem4 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a number"); 
		int n=sc.nextInt();
		double[] input=new double[n];
		System.out.println("enter "+n+" elements");
		double m=0;
		for(int i=0;i<n;i++) 
		{
			input[i]=sc.nextDouble();
			
		}
		if(n%2==1)
		{
			m=input[(n+1)/2-1];
		}
		else
		{
			m=(input[n/2-1]+input[n/2])/2;
		}
		
	       System.out.println("Median :"+m);  
	}

}
