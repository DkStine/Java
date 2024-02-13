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
    static int[][] tranposeOfMatrix(int[][] matrix) {
        int rows = matrix.length, columns = matrix[0].length;
        int[][] trans = new int[columns][rows];
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                trans[i][j] = matrix[j][i];
            }
        }

        return trans;
    }
    static void tranposeOfMatrixInPlace(int[][] matrix) {
        int c = matrix.length;
        int r = matrix[0].length;
        for (int i = 0; i < c; i++) {
            for (int j = i; j < r; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
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

        // Transpose matrix
        /* 
        int[][] m = createMatrix(3, 4);
        int[][] trans = tranposeOfMatrix(m);
        printMatrix(m);
        printMatrix(trans);
        */
        
        // Transpose in Place
        int[][] m = createMatrix(5, 5);
        tranposeOfMatrixInPlace(m);
        System.out.println("The transpose matrix");
        printMatrix(m);
        
    }
}
