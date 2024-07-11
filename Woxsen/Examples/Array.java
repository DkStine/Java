package Examples;
import java.util.Arrays;

public class Array {
    static int[] takeArr(int[] arr) {
        System.out.println("I am a method");

        int[] returnArr = { 1, 2, 3 };
        return returnArr;
    }

    public static void main(String[] args) {

        int[] arr0 = { 5, 2, 7, 10, 1, 3 };
        takeArr(arr0);

        // 1D arrays
        /*
         * int[] arr = new int[10];
         * for (int i = 0; i < 10; i++) {
         * arr[i] = i + 1;
         * }
         */

        // for (int i: arr2) {
        // System.out.println(i);
        // }

        // takeArr(arr2);

        // 2d arrays
        /*
         * for (int i = 0; i < 3; i++) {
         * for (int j = 0; j < 3; j++) {
         * System.out.print(arr3[i][j] + " ");
         * }
         * System.out.println();
         * }
         */

        int[] arr = { 5, 2, 7, 10, 1, 3 };

        int[] arrAcceptor = takeArr(arr);
        for (int i : arrAcceptor)
            System.out.print(i + " ");
        System.out.println();

        int sum = 0;
        for (int i : arr)
            sum += i;
        System.out.println("Sum is: " + sum);

        int[][] arr2D = { { 1, 3, 4 }, { 2, 4, 5 }, { 8, 9, 10 } };
        int row = arr2D.length, col = arr2D[0].length;

        int[][] transposeArr = new int[col][row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transposeArr[i][j] = arr2D[j][i];
            }
        }



        // To print transpose array
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transposeArr[i][j] + " ");
            }
            System.out.println();
        }

        Arrays.sort(arr);
        for (int i = 0; i < 3; i++) {
            System.out.println(arr[i]);
        }

    }
}
