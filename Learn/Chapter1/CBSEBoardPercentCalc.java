
import java.util.Scanner;

public class CBSEBoardPercentCalc {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the total marks per subject: ");
        int total = in.nextInt();
        System.out.print("Enter the total marks in physics: ");
        int p = in.nextInt();
        System.out.print("Enter the total marks in chemistry: ");
        int c = in.nextInt();
        System.out.print("Enter the total marks in maths: ");
        int m = in.nextInt();
        System.out.print("Enter the total marks in CSE: ");
        int CSE = in.nextInt();
        System.out.print("Enter the total marks in english: ");
        int e = in.nextInt();

        in.close();

        float percent = (p + c + m + CSE + e) * 100 / (total * 5);
        System.out.println("The percentage scored by the child is: ");
        System.out.print(percent);
        System.out.print("%");
    }
}
