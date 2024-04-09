package DSA;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class CircularSLL {
    Node tail;

    public void addToEmpty(int data) {
        Node newNode = new Node(data);
        tail = newNode;
        tail.next = newNode;
    }

    public void addToStart(int data) {
        if (tail == null) {
            addToEmpty(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = tail.next;
        tail.next = newNode;
    }

    public void addToEnd(int data) {
        if (tail == null) {
            addToEmpty(data);
            return;
        }

        Node newNode = new Node(data);
        newNode.next = tail.next;
        tail.next = newNode;
        tail = newNode;
    }

    public void removeAtStart() {
        if (tail == null) {
            System.out.println("List is empty, no element to remove!");
            return;
        }

        tail.next = tail.next.next;
    }

    public void display() {
        if (tail == null) {
            System.out.println("List is empty.");
            return;
        }

        Node currNode = tail.next;
        do {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        } while (currNode != tail.next);
        System.out.println();
    }


    public static void main(String[] args) {
        CircularSLL list = new CircularSLL();

        list.addToEnd(1);
        list.addToEnd(2);
        list.addToEnd(3);
        list.addToStart(4);
        list.display();
        list.removeAtStart();
        list.display();
    }
}
