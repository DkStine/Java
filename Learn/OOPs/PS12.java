import java.util.Scanner;

// Q1
class Calculator {
    Calculator(int x, int y) {
        System.out.println("The sum is: " + (x + y));
    }
}
class SciCalculator {
    SciCalculator(int x, int y) {
        System.out.println("Result: " + Math.sin(x) + Math.sin(y));
    }
}
class HybCalculator {
    HybCalculator(int x, int y) {
        System.out.println("Result: " + Math.sin(x));
        System.out.println("Result: " + (y * y));
    }
}

// Q2
class Display {
    private String st;
    
    Display() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter: ");
        this.st = sc.nextLine();
        sc.close();
    }
    public void show() {
        System.out.printf("The input is: %s", st);
    }
    
}

public class PS12 {
    protected int pixels = 1080;
    int size = 6;
    public static void main(String[] args) {
        // System.out.println("I am the main function...");
        /*Q1 
        Display dis = new Display();
        dis.show();
        */


    }
}
