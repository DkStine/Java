package DSA;

import java.util.List;
import java.util.Scanner;

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
        System.out.print("head -> ");
        while (curr != null) {
            System.out.print(curr.data + " -> ");
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

    static void insertAtEnd(ListNode head, int data) {
        ListNode newNode = new ListNode(data);

        if (head == null) {
            head = newNode;
            return;
            // return head;
        } 
        ListNode currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newNode;
        // return head;
    }

    static void insertAtPosition(ListNode head, int pos, int data) {
        if (pos == 1) {
            insertAtStart(head, data);
            return;
        }
        ListNode newNode = new ListNode(data);
        int count = 1;
        ListNode currNode = head;
        while (count < pos - 1) {
            currNode = currNode.next;
            count++;
        }
        newNode.next = currNode.next;
        currNode.next = newNode;
        return;
        
    }
    
    static ListNode deleteAtStart(ListNode head) {
        if (head == null) System.out.println("Linked list is empty already!");
        head = head.next;
        return head;
    }
    
    static void deleteAtLast(ListNode head) {
        if (head == null) System.out.println("Linked list is empty already!");
        ListNode curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;

    }
    
    static void deleteAtPosition(ListNode head, int pos) {
        if (pos == 1) deleteAtStart(head);
        int count = 1;
        ListNode currNode = head;
        while (count < pos - 1) {
            currNode = currNode.next;
            count++;
        }
        currNode.next = currNode.next.next;
    }

    static void searchLinkedList(ListNode head, int key) {
        if (head == null) {
            System.out.println("Linked list is empty, unable to search");
            return;
        } 

        ListNode currNode = head;
        while (currNode != null) {
            if (currNode.data == key) {
                System.out.println("Element found");
                return;
            }  
            currNode = currNode.next;
        }
        System.out.println("Element not found");
    }

    static ListNode reverseSLL(ListNode head) {
        ListNode currNode = head;
        ListNode prevNode = null;
        ListNode nextNode = null;

        while (currNode != null) {
            nextNode = currNode.next;
            currNode.next = prevNode;
            prevNode = currNode;
            currNode = nextNode;
        }
        return prevNode;
    }

    static void findNthNodeFromEnd(ListNode head, int n) {
        int indexFromStart = lengthOfSLL(head) - n;

        int i = 0;
        ListNode currNode = head;
        while (i < indexFromStart) {
            currNode = currNode.next;
            i++;
        }
        System.out.println("The required node is: " + currNode.data + " --> ");
    }
    
    static void removeDuplicates(ListNode head) {
        ListNode currNode = head;
        while (currNode != null && currNode.next != null) {
            if (currNode.data == currNode.next.data) currNode.next = currNode.next.next;
            else currNode = currNode.next;
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
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
        /* printSLL(sll.head);
        */
        

        // Length of a SLL
        // System.out.println("Length: " + lengthOfSLL(sll.head));

        // Insertion of nodes
        //  * Insertion at the beginning
        // ListNode head = insertAtStart(sll.head, 30);
        // printSLL(head);
        
        //  * Insertion at the end
        /* 
        int[] insertArr = {1, 2, 3, 4, 50};
        for (int data : insertArr) insertAtEnd(sll.head, data);
        
        insertAtEnd(sll.head, 31);
        printSLL(sll.head);
        */

        //  * Insertion at given position
        insertAtPosition(sll.head, 3, 100);
        insertAtPosition(sll.head, 5, 104);
        insertAtPosition(sll.head, 7, 50);
        printSLL(sll.head);

        // Deletion of nodes
        //  * Deletion of first node
        // ListNode newHead = deleteAtStart(sll.head);
        // printSLL(newHead);
        
        //  * Deletion of last node
        // deleteAtLast(sll.head);
        // printSLL(sll.head);
        
        //  * Deletion of given position node
        deleteAtPosition(sll.head, 3);
        printSLL(sll.head);

        // Searching a given element
        /* 
        System.out.print("Enter element to be searched: ");
        int keyElement = in.nextInt();
        searchLinkedList(sll.head, keyElement);
        */

        // Reversing a SLL
        /* 
        ListNode reversedHead = reverseSLL(sll.head);
        printSLL(reversedHead);
        */

        // Finding nth node from the end --> that is, finding (length - n)th node from the start where indexing starts from 0
        /* 
        System.out.print("Enter the term no. from the end: ");
        int n = in.nextInt();
        findNthNodeFromEnd(sll.head, n);
        */

        // Removing Duplicate Elements from sorted LL
        // * Making sorted LL(hardcoding)
        SinglyLinkedList sortedLL = new SinglyLinkedList();
        sortedLL.head = new ListNode(1);
        int[] sortedLLElements = {2, 3, 4, 4, 5, 6, 7, 8, 9, 10};

        for (int i : sortedLLElements) insertAtEnd(sortedLL.head, i);
        System.out.println("Sorted LL");
        printSLL(sortedLL.head);
        // * Removing duplicate(s)
        removeDuplicates(sortedLL.head);
        printSLL(sortedLL.head);

        in.close();
    }
}
