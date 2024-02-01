package DSA;
import java.util.Scanner;

public class MultiDimensionalArray {
    static int[][] createMatrix(int rows, int columns) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[rows][columns];

        System.out.println("Enter " + rows * columns + " elements");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        sc.close();

        return arr;
    }
    static void printMatrix(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
    static int[][] addMatrix(int[][] m1, int r1, int c1, int [][] m2, int r2, int c2) {
        int[][] sumMatrix = new int[r1][c1];
        if (r1 == r2 && c1 == c2) {
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c1; j++) {
                    sumMatrix[i][j] = m1[i][j] + m2[i][j];
                }
            }
        } else {
            System.out.println("Only matrices with same dimensions can be added!");
        }
        return sumMatrix;
    }
    static int[][] multiplyMatrix(int[][] m1, int r1, int c1, int [][] m2, int r2, int c2) {
        int[][] productMatrix = new int[r1][c2];
        if (c1 != r2) {
            System.out.println("Multiplication not possible!");   
        } else {
            for (int i = 0; i < r1; i++) {
                for (int j = 0; j < c2; j++) {
                    for (int k = 0; k < c1; k++) {
                        productMatrix[i][j] += (m1[i][k] * m2[k][j]);
                    }
                }
            }
        }
        return productMatrix;
    }
    public static void main(String[] args) {
        // 2D Arrays
        // Matrix addition
        /* 
        int[][] matrix1 = createMatrix(2, 3);
        int[][] matrix2 = {{7, 8, 9}, {10, 11, 12}};
        int[][] matrixSum = addMatrix(matrix1, 2, 3, matrix2, 2, 3);
        printMatrix(matrixSum);
        */
        
        // Matrix multiplication
        /* 
        int[][] matrix1 = createMatrix(2, 3);
        int[][] matrix2 = {{1, 0, 1}, {0, 1, 0}, {0, 0, 1}};

        int[][] resultMatrix = multiplyMatrix(matrix1, 2, 3, matrix2, 3, 3);
        printMatrix(resultMatrix);
        */

    }
}
