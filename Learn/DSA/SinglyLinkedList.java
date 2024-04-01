package DSA;

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

    static ListNode insertNodeSortedLL(ListNode head, int data) {
        ListNode newNode = new ListNode(data);
        if (newNode.data < head.data) {
            ListNode modHead = insertAtStart(head, data);
            return modHead;
        }

        ListNode currNode = head;
        ListNode prevNode = null;

        while (currNode != null && currNode.data < newNode.data) {
            prevNode = currNode;
            currNode = currNode.next;
        }

        newNode.next = currNode;
        prevNode.next = newNode;

        return head;

    }

    static ListNode removeKey(ListNode head, int key) {
        if (key == head.data) {
            ListNode modHead = deleteAtStart(head);
            return modHead;
        }

        ListNode currNode = head;

        while (currNode != null && currNode.next.data != key) {
            currNode = currNode.next;
        }

        currNode.next = currNode.next.next;

        return head;
    }

    static boolean detectLoop(ListNode head) {
        ListNode slowPtr = head, fastPtr = head;

        while (fastPtr != null && fastPtr.next != null) {
            fastPtr = fastPtr.next.next;
            slowPtr = slowPtr.next;
            if (slowPtr == fastPtr) return true;
        }

        return false;
    }
    
    static ListNode removeLoop(ListNode head) {
        if (detectLoop(head)) {
            ListNode slowPtr = head, fastPtr = head, currPtr = head;

            while (fastPtr != null && fastPtr.next != null) {
                fastPtr = fastPtr.next.next;
                slowPtr = slowPtr.next;
                if (fastPtr == slowPtr) {
                    break;
                }
            }
            // System.out.println("after detection: " + slowPtr.data);
            
            while (currPtr.next != slowPtr.next) {
                currPtr = currPtr.next;
                slowPtr = slowPtr.next;
            }
            // System.out.println("After finding loop start: " + slowPtr.data);
            
            slowPtr.next = null;
            return head;
        }

        System.out.println("Loop not detected!");
        return head;
    }
    
    static ListNode mergeSortedLL(ListNode head1, ListNode head2) {
        ListNode dummyNode = new ListNode(0);
        ListNode dummyTail = dummyNode;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                dummyTail.next = head1;
                head1 = head1.next;
            } else {
                dummyTail.next = head2;
                head2 = head2.next;
            }
            dummyTail = dummyTail.next;
        }

        if (head1 == null) dummyTail.next = head2;
        if (head2 == null) dummyTail.next = head1;

        return dummyNode.next;
    }

    static ListNode addLinkedList(ListNode h1, ListNode h2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;
        int carry = 0;

        while (h1 != null || h2 != null) {
            int x = (h1 != null) ? h1.data : 0;
            int y = (h2 != null) ? h2.data : 0;
            int sum = x + y + carry;
            carry = sum / 10;
            tail.next = new ListNode(sum % 10);
            tail = tail.next;
            if (h1 != null) h1 = h1.next;
            if (h2 != null) h2 = h2.next;
        }
        if (carry > 0) {
            tail.next = new ListNode(carry);
        }

        return dummy.next;
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
        /* 
        SinglyLinkedList sortedLL = new SinglyLinkedList();
        sortedLL.head = new ListNode(5);
        int[] sortedLLElements = {8, 10, 14, 17, 20};

        for (int i : sortedLLElements) insertAtEnd(sortedLL.head, i);
        System.out.println("Sorted LL");
        printSLL(sortedLL.head);
        // * Removing duplicate(s)
        
        removeDuplicates(sortedLL.head);
        printSLL(sortedLL.head);
        
        // Insert node in sorted LL
        ListNode modHead = insertNodeSortedLL(sortedLL.head, 3);
        printSLL(modHead);
        */

        int keyData = 104;
        ListNode modHead = removeKey(sll.head, keyData);
        printSLL(modHead);

        // Loop logics in SLL
        /* 
        // SLL with a loop creation
        SinglyLinkedList loopSll = new SinglyLinkedList();
        loopSll.head = new ListNode(10);

        ListNode node2 = new ListNode(20);
        ListNode node3 = new ListNode(30);
        ListNode node4 = new ListNode(40);
        ListNode node5 = new ListNode(50);
        ListNode node6 = new ListNode(60);

        loopSll.head.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        node5.next = node6;
        node6.next = node3;

        // Loop Detection -> Floyd's Rabbit - Tortoise Algo
        System.out.println("Loop present: " + detectLoop(loopSll.head));
        
        // Loop removal
        ListNode loopRemHead = removeLoop(loopSll.head);
        printSLL(loopRemHead);
        System.out.println("Loop present: " + detectLoop(loopRemHead));
        */

        // Merging two sorted LLs
        /* 
        SinglyLinkedList sortedLL1 = new SinglyLinkedList();
        sortedLL1.head = new ListNode(1);
        for (int i = 3; i <= 11; i += 2) insertAtEnd(sortedLL1.head, i);
        System.out.println("List1");
        printSLL(sortedLL1.head);
        
        SinglyLinkedList sortedLL2 = new SinglyLinkedList();
        sortedLL2.head = new ListNode(2);
        for (int i = 4; i <= 12; i += 2) insertAtEnd(sortedLL2.head, i);
        System.out.println("List2");
        printSLL(sortedLL2.head);

        ListNode mergedHead = mergeSortedLL(sortedLL1.head, sortedLL2.head);
        System.out.println("Merged 1 and 2");
        printSLL(mergedHead);*/


        // Add two numbers in linked list
        SinglyLinkedList numSll1 = new SinglyLinkedList();
        numSll1.head = new ListNode(7);
        int[] arr1 = {4, 9};
        for (int i : arr1) insertAtEnd(numSll1.head, i);

        SinglyLinkedList numSll2 = new SinglyLinkedList();
        numSll2.head = new ListNode(5);
        insertAtEnd(numSll2.head, 6);

        ListNode sumHead = addLinkedList(numSll1.head, numSll2.head);
        printSLL(sumHead);

        in.close();
    }
    
}
