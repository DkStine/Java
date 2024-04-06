package DSA;

class Node {
    int data;
    Node prev;
    Node next;

    public Node(int data) {
        this.data = data;
        this.prev = null;
        this.next = null;
    }
}

public class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void printDllFwd() {
        Node currNode = this.head;
        System.out.print("Head --> ");
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    public void printDllBkd() {
        Node currNode = this.tail;
        System.out.print("Tail --> ");
        while (currNode != null) {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.prev;
        }
        System.out.println("NULL");
    }

    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
    }

    public void deleteAtStart() {
        if (head == null) System.out.println("Linked list is empty, can't delete!");
        else {
            head = head.next;
            head.prev = null;
        }
    }

    public void deleteAtEnd() {
        if (tail == null) System.out.println("List is empty!");
        else {
            
        }
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertAtEnd(1);
        dll.insertAtEnd(2);
        dll.insertAtEnd(3);
        dll.insertAtStart(0);
        dll.printDllFwd();
        dll.deleteAtStart();
        dll.printDllFwd();
        dll.printDllBkd();
    }
}
