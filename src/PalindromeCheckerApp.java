// Version 6.0
// UC6: Queue + Stack Based Palindrome Check

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class UseCase6PalindromeCheckerApp {

    public static void main(String[] args) {

        // Input string
        String word = "deed";

        // Initialize Queue (FIFO) and Stack (LIFO)
        Queue<Character> queue = new LinkedList<>();
        Stack<Character> stack = new Stack<>();

        // Enqueue and push each character
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            queue.add(ch);   // enqueue
            stack.push(ch);  // push
        }

        // Compare dequeue vs pop
        boolean isPalindrome = true;
        while (!queue.isEmpty() && !stack.isEmpty()) {
            char qChar = queue.poll();  // dequeue
            char sChar = stack.pop();   // pop

            if (qChar != sChar) {
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