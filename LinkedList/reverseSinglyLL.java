package LinkedList;

public class reverseSinglyLL {
    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /**
     * Iteratively reverse a singly linked list.
     * @param head head of the list
     * @return new head after reversal
     */
    public static ListNode reverseLL(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr != null) {
            ListNode next = curr.next; // store next
            curr.next = prev; // reverse link
            prev = curr;      // advance prev
            curr = next;      // advance curr
        }
        return prev; // new head
    }

    /**
     * Recursively reverse a singly linked list.
     */
    public static ListNode reverseLLRecursive(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode newHead = reverseLLRecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void printLL(ListNode head) {
        ListNode curr = head;
        StringBuilder sb = new StringBuilder();
        while (curr != null) {
            sb.append(curr.data).append(" -> ");
            curr = curr.next;
        }
        sb.append("null");
        System.out.println(sb.toString());
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.println("Original Linked List:");
        printLL(head);

        head = reverseLL(head);
        System.out.println("Reversed Linked List (iterative):");
        printLL(head);

        head = reverseLLRecursive(head);
        System.out.println("Reversed Linked List (back to original via recursive):");
        printLL(head);
    }
}