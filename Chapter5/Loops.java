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
        
        // for (int i = 0; i <= n; i++){
            //     System.out.println(2*i + 1);
            //     }
            
            int n;
            Scanner in = new Scanner(System.in);
            
            System.out.println("Start");
            n = in.nextInt();
            in.close();

            for(int i = n; i != 0; i--){
                System.out.print(i + " ");
            }
            
        }
    }
