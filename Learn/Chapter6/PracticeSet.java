package Chapter6;

public class PracticeSet {
    public static void main(String[] args) {
        // Q1
        /* 
        float[] arr = {1.134f, 2.12f, 3.43f, 4.82f, 5.3f};

        float sum = 0;

        for (float element : arr) {
            sum += element;
        }
        System.out.println(sum);
        */

        // Q2
        /* 
        int[] search = {1, 3, 4, 5, 13, 10};

        int toBeSearched = 14;
        boolean flag = false;

        for (int i : search) {
            if (i == toBeSearched) {
                System.out.println("Found!");
                flag = true;
                break;
            }
        }

        if (flag == false) {
            System.out.println("Not found!");
        }
        */

        // Q3
        /* 
        int[] marks = {85, 72, 94, 56, 78, 61, 88, 95, 42, 67, 74, 89, 52, 83, 70, 96, 48, 76, 63, 91, 55, 80, 98, 44, 69, 81, 92, 60, 75, 46, 87, 50, 73, 99, 68, 53, 79, 59, 84, 47, 71, 93, 58, 82, 97, 45, 66, 77, 86, 49};
        
        int sum = 0;
        float average;

        for (int i : marks) {
            sum += i;
        }

        average = sum / marks.length;

        System.out.println("The average is: " + average);
        */

        // Q4
        /* 
        int[][] matrix1 = {{5, 3, 7}, {8, 2, 9}};
        int[][] matrix2 = {{1, 6, 4}, {3, 8, 5}};
        int[][] resultMatrix = new int[2][3];

        for (int i = 0; i < resultMatrix.length; i++) {
            for (int j = 0; j < resultMatrix[i].length; j++) {
                resultMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
                System.out.print(resultMatrix[i][j] + " ");
            }
            System.out.println();
        }
        */

        // Q5
        /* --> Important Concept of reversing array
        int[] arr = {1, 2, 3, 4, 5};
        
        for (int i = 0; i < Math.floorDiv(arr.length, 2); i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        for (int i : arr) {
            System.out.print(i + " ");
        }
        */

        // Q6 & Q7
        /* 
        int[] arr = {1, 2, 5, -1, 3, 4};
        // int great = arr[0];
        int min = arr[0];

        for (int i : arr) {
            if (i < min) {
                min = i;
            }
        }

        System.out.println("The minimum integer is: " + min);
        */

        // Q8
        // --> Easy
    }
}
