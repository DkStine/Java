package Chapter5;
// import java.util.Scanner;

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
            
            
        // --> Q1

        // Scanner in = new Scanner(System.in);
        // System.out.print("Start: ");

        // int rowCount = in.nextInt();
        // in.close();

        // for (int i = rowCount; i >= 1; i--){
        //     for(int j = i; j != 0; j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // --> Q2;

        // Scanner in = new Scanner(System.in);

        // int n = in.nextInt();
        // in.close();
        
        // int count = 1, sum = 0;
        
        // while(count <= n){
            //     sum += count * 2;
            //     count++;
            // }
            
            // System.out.println(sum);
            
        // --> Q3
        // Scanner in = new Scanner(System.in);
        
        // System.out.print("Start: ");
        // int n = 10;
        // in.close();
        // Scanner in = new Scanner(System.in);
        
        // System.out.print("Start: ");
        // int n = 10;
        // in.close();
        
        // for(int i = n; i != 0; i--){
        //     System.out.println(n + " X " + i + " = " + n * i);
        // }
        
        // --> Q4
        // Scanner in = new Scanner(System.in);
        
        // System.out.print("Start: ");
        // int n = in.nextInt();
        // in.close();
        
        // int factorial = 1;

        // // for(int i = n; i != 0; i--){
        // //     factorial *= i;
        // // }

        // // System.out.println(factorial);

        // // --> Q5
        // while(n != 0){
        //     factorial *= n;
        //     n--;
        // }

        // System.out.println(factorial);

        // --> Q9
        int n = 8, sum = 0;

        for (int i = 1; i <= 3; i++){
            sum += n * i;
        }

        System.out.println(sum);

        

        }
    }
