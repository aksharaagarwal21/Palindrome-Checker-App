// Version 3.0
// UC3: Palindrome Check Using String Reverse

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Original string
        String original = "racecar";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using a for loop
        for (int i = original.length() - 1; i >= 0; i--) {
            reversed = reversed + original.charAt(i);
        }

        // Display reversed string
        System.out.println("Original String: " + original);
        System.out.println("Reversed String: " + reversed);

        // Compare original and reversed string
        if (original.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
    }
}