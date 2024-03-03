package DSA;

/* 
class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
*/

public class SinglyLinkedList {
    private ListNode head;

    private static class ListNode {
        private int data;
        private ListNode next;

        ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static void printSLL(ListNode head) {
        ListNode curr = head;
        System.out.print("head --> ");
        while (curr != null) {
            System.out.print(curr.data + " --> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    static int lengthOfSLL(ListNode head) {
        int l = 0;
    
        ListNode curr = head;
        while (curr != null) {
            l++;
            curr = curr.next;
        }
        
        return l;
    }

    static ListNode insertAtStart(ListNode head, int data) {
        if (head == null) {
            ListNode newNode = new ListNode(data);
            head = newNode;
            return head;
        } else {
            ListNode newNode = new ListNode(data);
            newNode.next = head;
            head = newNode;
            return head;
        }
    }

    public static void main(String[] args) {
        // Creation of singly linked list
        /* */
        SinglyLinkedList sll = new SinglyLinkedList();
        sll.head = new ListNode(10);
        ListNode secondNode = new ListNode(18);
        ListNode thirdNode = new ListNode(21);
        ListNode fourthNode = new ListNode(25);

        sll.head.next = secondNode;
        secondNode.next = thirdNode;
        thirdNode.next = fourthNode;
        // head --> 10 --> 18 --> 21 --> 25 --> null
        
        // Printing the elements of a linked list
        /* 
        */
        printSLL(sll.head);

        // Length of a SLL
        System.out.println("Length: " + lengthOfSLL(sll.head));

        // Insertion of nodes
        //  * Insertion at the beginning
        ListNode head = insertAtStart(sll.head, 30);
        printSLL(head);

    }
}
