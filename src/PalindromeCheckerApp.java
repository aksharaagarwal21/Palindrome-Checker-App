// Version 7.0
// UC7: Deque-Based Optimized Palindrome Checker

import java.util.Deque;
import java.util.LinkedList;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String word = "noon";

        // Initialize deque
        Deque<Character> deque = new LinkedList<>();

        // Insert all characters into deque
        for (int i = 0; i < word.length(); i++) {
            deque.addLast(word.charAt(i)); // add to rear
        }

        // Compare front and rear until deque is empty or mismatch found
        boolean isPalindrome = true;
        while (deque.size() > 1) {
            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Display results
        System.out.println("Input String: " + word);
        if (isPalindrome) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
    }
}