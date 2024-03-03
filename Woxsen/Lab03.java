import java.util.Scanner;

public class Lab03 {
    static int[][] transposeMatrix(int[][] matrix, int rows, int columns) {
        int[][] transMatrix = new int[columns][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                transMatrix[j][i] = matrix[i][j];
            }
        }

        return transMatrix;

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Q1
        /* */
        int r1 = (101 + 0) / 3;

        double r2 = 3.0e-6 * 10000000.1;

        boolean r3 = true && true;
        boolean r4 = false && true;

        boolean r5 = (false && false) || (true && true);

        System.out.println("(101 + 1 / 3) --> " + r1);
        System.out.println("3.0e-6 * 10000000.1 --> " + r2);
        System.out.println("true && true --> " + r3);
        System.out.println("false && true --> " + r4);
        System.out.println("(false && false) || (true && true) --> " + r5);
        

        // Q2
        /* 
        System.out.println("Enter the numbers separated by spaces: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();

        if (a == b && a == c && a == d) System.out.println(true);
        else System.out.println(false);
        */

        // Q3
        /* 
        boolean[][] arr = {{true, false}, {false, false, true}, {true, true, false}};

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        */

        // Q4
        /* 
        System.out.print("Enter the number of rows: ");
        int rows = in.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = in.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = in.nextInt();
            }
        }
        
        int[][] transMatrix = transposeMatrix(matrix, rows, columns);
        
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(transMatrix[i][j] + " ");
            }
            System.out.println();
        }
        */

        // Creation of array
        /* 
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(arr[7]);

        // Swapping two variables
        int a = 15, b = 74, temp;
        System.out.printf("a = %d, b = %d\n", a, b);
        temp = a;
        a = b;
        b = temp;
        System.out.printf("a = %d, b = %d", a, b);
        */
        
        // Finding the maximum element in a array
        /* 
        int[] arr = {10, 20, 50, 30, 70, 100};

        int largestNumber = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > largestNumber) largestNumber = arr[i];
        }

        System.out.println("The largest number is: " + largestNumber);
        */
    }
}