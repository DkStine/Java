import java.util.Arrays;
import java.util.Scanner;

// Q7
class Vehicle {
    void drive(){}
}

class Car extends Vehicle {
    @Override
    void drive() {
        System.out.println("Repairing the car!");
    }
}

public class LabExam {
    static void printMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void transposeMatrix(int[][] matrix) {
        int rows = matrix.length, cols = matrix[0].length;
        int[][] transpose = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }
        System.out.println("Transpose Matrix");
        printMatrix(matrix);
    }

    static void kLargestElements(int[] arr, int k) {
        Arrays.sort(arr);
        int i = arr.length - 1, count = 0;
        while (count++ < 3) {
            System.out.print(arr[i--] + " ");
        }

    }

    static int[] copy(int[] arr) {
        int[] resArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resArr[i] = arr[i];
        }
        return resArr;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Q1
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        System.out.println("Original Matrix");
        printMatrix(matrix);
        transposeMatrix(matrix);

        // Q2 -> k largest elements
        int[] arr = {3, 4, 23, 7, 9, 10, 5};
        int k = 3;
        kLargestElements(arr, k);

        // Q3 -> Greatest of three
        /* */
        System.out.print("\nEnter the three numbers: ");
        int a = in.nextInt(); int b = in.nextInt(); int c = in.nextInt();
        
        if (a > b && a > c) System.out.println(a + " is the greatest.");
        else if (b > a && b > c) System.out.println(b + " is the greatest");
        else System.out.println(c + " is the greatest.");

        // Q4 -> Right angle triangle
        int rows = 5; 
        for (int i = 1; i < rows + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        // Q5
        int lines = 5;
        for (int i = 1; i < lines; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

        // Q6
        int[] givenArr = {1, 2, 3, 4, 5};
        int[] copyArr = copy(givenArr);
        System.out.println("Copied array: ");
        for (int ele: copyArr) System.out.print(ele + " ");

        // Q7 -> Above

        // Q8 -> Exception
        System.out.print("\nEnter the numerator and denominator: ");
        int num = in.nextInt();
        int den = in.nextInt();
        try {
            int q = num / den;
        } catch (ArithmeticException e) {
            System.out.println("Error occured: " + e);
        }
        
        // Q10
        int lRows = 5;
        for (int i = 1; i <= lRows; i++) {
            for (int j = 0; j < lRows - i; j++) System.out.print("  ");
            for (int lk = 0; lk < i; lk++) System.out.print("* ");
            System.out.println();
        }

        // Q11
        int rRows = 5; 
        for (int i = 1; i < rRows + 1; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}
