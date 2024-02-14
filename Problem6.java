package TechHausTestProblem;
import java.util.Scanner;

/* Problem 6
Write a program that finds the string having the most number of vowels from an array of strings. For example, given the array “Sunshine” (3 vowels), “Umbrella” (3 vowels), “Major” (2 vowels), “Resourceful” (5 vowels), the program must return the string “Resourceful”. */

public class Problem6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of strings: ");
        int numofStrings; 
        numofStrings = sc.nextInt();
        sc.nextLine();

        String mostVowelsString = "";
        int maxVowels = 0;

        for (int i = 0; i < numofStrings; i++) {
            System.out.print("Enter string " + (i + 1) + ": ");
            String str;
            str = sc.nextLine();
            int vowelsCount = countVowels(str);
            if (vowelsCount > maxVowels) {
                maxVowels = vowelsCount;
                mostVowelsString = str;
            }
        }

        System.out.println("String with the most vowels: " + mostVowelsString);
    }

    public static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (int i = 0; i < str.length(); i++) {
            if (vowels.indexOf(str.charAt(i)) != -1) {
                count++;
            }
        }
        return count;
		
	}

}
