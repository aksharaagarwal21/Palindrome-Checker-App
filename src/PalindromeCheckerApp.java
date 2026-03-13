class Node {
    char val;
    Node next;

    // Constructor to initialize the node
    Node(char val) {
        this.val = val;
        this.next = null;
    }
}

public class PalindromeCheckerApp {

    public static boolean isPalindromeLinkedList(String s) {
        // 1. Convert string to linked list
        if (s == null || s.length() == 0) {
            return true;
        }

        Node head = new Node(s.charAt(0));
        Node curr = head;
        for (int i = 1; i < s.length(); i++) {
            curr.next = new Node(s.charAt(i));
            curr = curr.next;
        }

        // 2. Find the middle using Fast and Slow pointers
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // 3. Reverse the second half in-place
        Node prev = null;
        curr = slow;
        Node nextNode;
        while (curr != null) {
            nextNode = curr.next; // Temporarily store the next node
            curr.next = prev;     // Reverse the current node's pointer
            prev = curr;          // Move prev forward
            curr = nextNode;      // Move curr forward
        }

        // 4. Compare both halves
        Node left = head;
        Node right = prev; // 'prev' is now the head of the reversed second half
        
        while (right != null) {
            if (left.val != right.val) {
                return false;
            }
            left = left.next;
            right = right.next;
        }

        return true;
    }

    // --- Testing the code ---
    public static void main(String[] args) {
        String testString = "racecar";
        boolean result = isPalindromeLinkedList(testString);
        System.out.println("Is \"" + testString + "\" a palindrome? " + result);
        
        String testString2 = "hello";
        boolean result2 = isPalindromeLinkedList(testString2);
        System.out.println("Is \"" + testString2 + "\" a palindrome? " + result2);
    }
}
