package com.java.letcode;

class ListNode {
    int val;
    ListNode next;
    ListNode(int val) { this.val = val; }
}

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;

            if (l1 != null) l1 = l1.next;
            if (l2 != null) l2 = l2.next;
        }

        return dummy.next;
    }

    // Helper method to create a linked list from an array of integers
    public ListNode createLinkedList(int[] numbers) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int number : numbers) {
            current.next = new ListNode(number);
            current = current.next;
        }
        return dummy.next;
    }

    // Helper method to print a linked list
    public void printLinkedList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " -> ");
            node = node.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        AddTwoNumbers solution = new AddTwoNumbers();

        int[] nums1 = {2, 4, 3};
        int[] nums2 = {5, 6, 4};

        ListNode l1 = solution.createLinkedList(nums1);
        ListNode l2 = solution.createLinkedList(nums2);

        ListNode result = solution.addTwoNumbers(l1, l2);
        solution.printLinkedList(result);  // Output: 7 -> 0 -> 8 -> null
    }
}
