package DSA;
import java.util.Scanner;
import java.util.Arrays;

public class Array {
    static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    static int[] smallestAndLargestElement(int[] arr) {
        Arrays.sort(arr);
        int[] finalArr = {arr[0], arr[arr.length - 1]};
        return finalArr;
    }
    public static void main(String[] args) {
        // Arrays_1
        // Q1
        // int [] array = {1, 5, 3};
        // int sum = 0;

        // for (int i : array) {
        //     sum += i;
        // }
        // System.out.println(sum);

        // Q2
        /* 
        int max = array[0];
        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
        */

        // Arrays_2
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the length of array: ");
        // int n = sc.nextInt();
        
        // int [] numArr = new int[n];
        
        // System.out.println("Enter the elements: ");
        // for (int i = 0; i < numArr.length; i++) {
        //     numArr[i] = sc.nextInt();
        // }
        // printArray(numArr);
        // sc.close();

        // Cloning and Referencing
        // Shallow copy --> Referencing(Stack and Heap memory concepts)
        // int[] arr1 = {1, 2, 72};
        // int[] arr2 = arr1;
        
        // System.out.println("Arr1");
        // printArray(arr1);
        
        // arr2[2] = 4;
        // System.out.println("Arr2");
        // printArray(arr2);
        
        // System.out.println("Arr1");
        // printArray(arr1);
        
        // Deep copy --> Cloning
        // int[] arr2 = arr1.clone();
        // int[] arr2 = Arrays.copyOf(arr1, arr1.length);
        // int[] arr3 = Arrays.copyOfRange(arr1, 1, 4);

        // arr2[2] = 21;

        // System.out.println("Arr1");
        // printArray(arr1);
        // System.out.println("Arr2");
        // printArray(arr2);
        
        // int[] arr = {4, 3, 8, 1};
        // int[] ansArr = smallestAndLargestElement(arr);

        // printArray(ansArr);


    }
}
