import java.util.Scanner;

public class Lab01 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // P1
        /* 
        System.out.println("Hello World");
        
        // P2
        System.out.print("Enter the first number: ");
        int first = in.nextInt();
        System.out.print("Enter the second number: ");
        int second = in.nextInt();
        int sum = first + second;
        System.out.printf("The sum of %d and %d is %d\n", first, second, sum);
        int diff = first - second;
        System.out.printf("The difference of %d and %d is %d\n", first, second, diff);
        int prod = first * second;
        System.out.printf("The product of %d and %d is %d\n", first, second, prod);

        in.close();

        // P3
        System.out.print("Enter a number: ");
        int x = in.nextInt();
        if (x > 0) System.out.println("Positive");
        else if (x < 0) System.out.println("Negative");
        else System.out.println("Zero");
        */
        // P4
        System.out.println("Enter a number: ");
        int x = in.nextInt();
        int fact = 1;
        for (int i = x; i > 1; i--) {
            fact *= i;
        }
        System.out.println("The factorial is: " + fact);
        
        // P5
        int a, b, c, d;
        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();
        d = in.nextInt();

        if (a == b && a == c && a == d) System.out.println("All four are equal!");
        else System.out.println("Not equal");

        // P6
        // HCF
        int num1=in.nextInt();
        int num2=in.nextInt();
        int HCF=0;
        for (int i = 1; i <= num1 || i<=num2; i++) {
            if (num1%i==0 && num2%i==0) {
                HCF=i;
            }
        }
        System.out.println(HCF);
    }
}
