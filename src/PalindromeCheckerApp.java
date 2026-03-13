// Version 5.0
// UC5: Stack-Based Palindrome Checker

import java.util.Stack;

public class PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String word = "radar";

        // Initialize stack
        Stack<Character> stack = new Stack<>();

        // Push all characters into stack
        for (int i = 0; i < word.length(); i++) {
            stack.push(word.charAt(i));
        }

        // Pop characters and build reversed string
        String reversed = "";
        while (!stack.isEmpty()) {
            reversed += stack.pop();
        }

        // Display original and reversed string
        System.out.println("Original String: " + word);
        System.out.println("Reversed String: " + reversed);

        // Check palindrome
        if (word.equals(reversed)) {
            System.out.println("Result: The string is a Palindrome.");
        } else {
            System.out.println("Result: The string is NOT a Palindrome.");
        }
    }
}