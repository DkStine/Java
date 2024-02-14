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
    static void swap2D(int[][] matrix, int i, int j) {
        int n = matrix.length;
        int temp = matrix[i][j];
        matrix[i][j] = matrix[i][n - 1 - j];
        matrix[i][n - 1 - j] = temp;
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
    static void rotateMatrix90(int[][] matrix) {
        int n = matrix.length;
        tranposeOfMatrixInPlace(matrix);
        System.out.println("The transpose matrix:");
        printMatrix(matrix);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < matrix[i].length / 2; j++) {
                swap2D(matrix, i, j);
            }
        }
    }
    static void printPascalTriangle(int rows) {
        int[][] pascalTriangle = new int[rows][];
        for (int i = 0; i < rows; i++) {
            pascalTriangle[i] = new int[i + 1]; // Jagged array creation
            for (int j = 0; j <= i; j++) {
                if (j == 0 || i == j) pascalTriangle[i][j] = 1;
                else pascalTriangle[i][j] = pascalTriangle[i - 1][j - 1] + pascalTriangle[i - 1][j];
            }
        }
        printMatrix(pascalTriangle);
    }
    static void spiralOrder(int[][] matrix, int rows, int columns) {
        int lc = 0, rc = columns - 1, tr = 0, br = rows - 1;
        int count = 0;

        System.out.println("The elements in spiral order: ");
        while (count < rows * columns) {
            // print top row
            for (int i = lc; i <= rc; i++) {
                System.out.print(matrix[tr][i] + " ");
                count++;
            }
            tr++;
            
            // print right column
            for (int j = tr; j <= br; j++) {
                System.out.print(matrix[j][rc] + " ");
                count++;
            }
            rc--;
            
            // print bottom row
            for (int k = rc; k >= lc; k--) {
                System.out.print(matrix[br][k] + " ");
                count++;
            }
            br--;
            
            // print left column
            for (int l = br; l >= tr; l--) {
                System.out.print(matrix[l][lc] + " ");
                count++;
            }
            lc++;
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
        /* 
        int[][] m = createMatrix(3, 3);
        tranposeOfMatrixInPlace(m);
        System.out.println("The transpose matrix");
        printMatrix(m);
        */
        
        // Rotating a matrix 90 degress clockwise 
        // Algo: Transpose the matrix -> Reverse each row's elements
        /* 
        int[][] m = createMatrix(3, 3);
        rotateMatrix90(m);
        System.out.println("The rotated matrix");
        printMatrix(m);
        */
        
        // Pascal's Triangle
        // Algo: matrix[i][j] = matrix[i - 1][j - 1] + matrix[i - 1][j]
        /* 
        int rows = 5;
        printPascalTriangle(rows);
        */
        
        // Spiral Order Matrix 
        int[][] m = createMatrix(4, 4);
        spiralOrder(m, 4, 4);

        
    }
}
