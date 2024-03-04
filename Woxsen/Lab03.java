import java.util.Scanner;

public class Lab03 {
    static int[][] transposeMatrix(int[][] mat, int rows, int cols) {
        int[][] transMatrix = new int[cols][rows];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                transMatrix[j][i] = mat[i][j];
            }
        }

        return transMatrix;
    }
    static void printMatrix(int[][] mat) {
        int rows = mat.length, cols = mat[0].length;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Q1 -> WAP to find the largest element in a given array
        int[] arr = {1, 2, 4, 8, 27, 7, 10};
        int max = arr[0];
        for (int i : arr) {
            if (i > max) max = i;
        }

        System.out.println("The max element is: " + max);

        // Q2 -> WAP to print an array after changing the rows and columns of a 2D array
        int[][] matrix = {{1, 2, 3, 4},
                        {5, 6, 7, 8}, 
                        {9, 1, 6, 8}};

        int[][] transMatrix = transposeMatrix(matrix, matrix.length, matrix[0].length);

        printMatrix(transMatrix);


        // Q3 -> WAP that prints an integer b/w 0 to 1000 and adds all the digits in the integer
        int num = 984, sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        System.out.println("The sum of the digits is: " + sum);

        // Q4 -> WAP to print a right angled triangle and a left angled triangle
        System.out.println("Right angled triangle: ");
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        Scanner in = new Scanner(System.in);
        System.out.print("Enter no. of rows of Left angled triangle: ");
        int rows = in.nextInt();
        in.close();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows - i; j++) System.out.print("  ");
            for (int k = 1; k <= i; k++) System.out.print("* ");
            System.out.println();
        }

    }
}
