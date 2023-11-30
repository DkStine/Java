package Miscellaneous;

public class Q1 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        double q = a / b;
        double r = a % b;

        System.out.println("Quotient: " + q);
        System.out.println("Remainder: " + r);
    }
}
