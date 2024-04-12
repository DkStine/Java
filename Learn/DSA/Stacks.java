package DSA;

import java.util.Stack;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

public class Stacks {
    Node top;
    int length;

    public Stacks() {
        this.top = null;
        this.length = 0;
    }

    public void push(int data) {
        Node newNode = new Node(data);
        newNode.next = this.top;
        this.top = newNode;
        this.length++;
    }

    public void pop() {
        if (this.top == null) {
            System.out.println("Stack Underflow! Can't pop");
            return;
        }

        this.top = this.top.next;
        this.length--;
    }

    public boolean isEmpty() {
        return this.length == 0;
    }

    public void display() {
        if (this.top == null) {
            System.out.println("Stack Underflow!");
            return;
        }

        Node currNode = this.top;
        do {
            System.out.print(currNode.data + " --> ");
            currNode = currNode.next;
        } while (currNode != null);
        System.out.println("NULL");
    }

    static int[] nextGreaterElement(int[] arr) {
        int[] result = new int[arr.length];
        Stack<Integer> stk = new Stack<>();

        for (int i = arr.length - 1; i >= 0; i--) {
            if (!stk.isEmpty()) {
                while (!stk.isEmpty() && stk.peek() <= arr[i]) {
                    stk.pop();
                }
            }
            if (stk.isEmpty()) result[i] = -1;
            else result[i] = stk.peek();
            stk.push(arr[i]);
        }

        return result;
    }

    static boolean checkValidParentheses(String brackString) {
        Stack<Character> brackStk = new Stack<>();
        for (char c: brackString.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') brackStk.push(c);
            else {
                if (brackStk.isEmpty()) return false;
                char top = brackStk.peek();
                if ((top == '(' && c == ')') || (top == '{' && c == '}') || (top == '[' && c == ']')) brackStk.pop();
                else return false;
            }

        }

        return brackStk.isEmpty();
    }
    public static void main(String[] args) {
        /* 
        Stack<Integer> stk = new Stack<>();
        stk.push(1);
        stk.push(12);
        stk.push(123);
        System.out.println(stk.peek());
        

        Stacks stk = new Stacks();
        stk.push(1);
        stk.push(2);
        stk.push(3);
        System.out.println("Length: " + stk.length);
        stk.display();
        stk.pop();
        stk.pop();
        stk.pop();
        System.out.println(stk.isEmpty());
        System.out.println("Length: " + stk.length);
        stk.pop();
        System.out.println("Length: " + stk.length);
        stk.display();
        

        // To reverse a string using stack
        String st = "Elephant";
        char[] charArr = st.toCharArray();

        Stack<Character> charStk = new Stack<>();

        for (char c: charArr) charStk.push(c);
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = charStk.pop();
        }

        System.out.println("Reversed string: " + new String(charArr));
        

        // Next Greater Element
        int[] arr = {4, 7, 3, 4, 8, 1};
        int[] resultArr = nextGreaterElement(arr);

        for (int num: resultArr) System.out.print(num + " ");
        */

        // Valid Parentheses
        String brackets = "{([])}";
        System.out.println("Parenthese valid?: " + checkValidParentheses(brackets));
    }
}
