package TechHausTestProblem;
import java.util.Scanner;

/* Problem 10
Write a program that finds the second largest number from an array of unsorted numbers. */

public class Problem10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            int num = sc.nextInt();
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }

        System.out.println("The second largest number in the array is: " + secondLargest);
    }
}

