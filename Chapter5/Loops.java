package Chapter5;
import java.util.Scanner;

public class Loops {
    public static void main(String[] args) {
        // -> While loop
        // int i = 1;

        // while (i <= 5){
        //     System.out.println(i);
        //     i++;
        // }

        // --> do while loop
        // int i = 1;

        // do{
        //     System.out.println(i);
        //     i++;
        // } while (i <= 10);

        // --> for loop
        int n;
        Scanner in = new Scanner(System.in);

        n = in.nextInt();
        in.close();

        for (int i = 1; i <= n; i++){
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }
}
