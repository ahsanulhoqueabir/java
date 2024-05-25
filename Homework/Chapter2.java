
import java.util.Scanner;

public class Chapter2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input strings S1 and S2
        System.out.print("Enter string S1: ");
        String S1 = scanner.nextLine();
        System.out.print("Enter string S2: ");
        String S2 = scanner.nextLine();

        // Print the length of each string
        System.out.println("Length of S1: " + S1.length());
        System.out.println("Length of S2: " + S2.length());

        // Replace all spaces in S1 with underscore
        String replacedS1 = S1.replace(' ', '_');
        System.out.println("S1 with spaces replaced by underscore: " + replacedS1);

        // Print the first character of S1
        System.out.println("First character of S1: " + S1.charAt(0));

        // Compare S1 and S2
        if (S1.equals(S2)) {
            System.out.println("Strings S1 and S2 are equal.");
        } else {
            System.out.println("Strings S1 and S2 are not equal.");
        }

        // Find the first occurrence of character 'a' in S1 and print its position
        int indexOfA = S1.indexOf('a');
        if (indexOfA != -1) {
            System.out.println("Position of 'a' in S1: " + indexOfA);
        } else {
            System.out.println("Character 'a' not found in S1.");
        }

        // Check if S1 is a substring of S2 or vice versa
        if (S1.contains(S2) || S2.contains(S1)) {
            System.out.println("One string is a substring of the other.");
        } else {
            System.out.println("Neither string is a substring of the other.");
        }

        // Convert S1 to lowercase and S2 to uppercase
        String lowerS1 = S1.toLowerCase();
        String upperS2 = S2.toUpperCase();
        System.out.println("S1 in lowercase: " + lowerS1);
        System.out.println("S2 in uppercase: " + upperS2);

        // Save S1 to a character array
        char[] charArray = S1.toCharArray();
        System.out.print("Character array of S1: ");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Close the scanner
        scanner.close();
    }
}
