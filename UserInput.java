import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Scanner inp = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        byte n1 = inp.nextByte();
        System.out.print("Enter the second number: ");
        byte n2 = inp.nextByte();

        inp.close();

        int sum = n1 + n2;

        System.out.print("The sum is:");
        System.out.print(sum);
    }
}
