package DSA;
import java.util.Scanner;
import java.util.Arrays;

public class Array {
    static int[] createArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        System.out.println("Enter the elements: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();

        return arr;
    }
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
    static int tripletSum(int[] arr, int target) {
        int tripletCount = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                for (int k = j + 1; k < arr.length; k++) {
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum == target) {
                        tripletCount++;
                    }
                    sum = 0;
                }
            }
        }
        return tripletCount;

    }
    static int uniqueArrayElement(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    arr[i] = arr[j] = -1;
                }
            }
        }

        int ans = 0;
        for (int k : arr) {
            if (k != -1) {
                ans = k;
            }
        }
        return ans;
    }
    static int maxElement(int[] arr) {
        int max = Integer.MIN_VALUE;

        for (int i : arr) {
            if (i > max) max = i;
        }
        return max;
    }
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    static void reverseArray(int[] arr) {
        int n = arr.length;
        // Using new array
        /* 
        int[] revArr = new int[n];
        int j = 0;

        for (int i = n - 1; i >= 0; i--) {
            // revArr[n - 1 - i] = arr[i]; //--> Aam zindagi
            revArr[j++] = arr[i]; //--> Mentos zindagi
        }
        return revArr;
        */
        // In place
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }
    static void reverseArray(int[] arr, int st, int end) {
        while (st < end) {
            swap(arr, st, end);
            st++;
            end--;
        }
    }
    static void rotateArray(int[] arr, int k) {
        // Extra Space
        /* 
        int n = arr.length;
        k %= n;
        int j = 0;
        int[] rotatedArr = new int[n];

        for (int i = n - k; i < n; i++) {
            rotatedArr[j++] = arr[i];
        }
        for (int l = 0; l < n - k; l++) {
            rotatedArr[j++] = arr[l];
        }

        return rotatedArr;
       */
        // In place
        /* */
        int n = arr.length;
        k %= n;
        reverseArray(arr, 0, n - k - 1);
        reverseArray(arr, n - k, n - 1);
        reverseArray(arr);
    }
    static int[] createFrequencyArray(int[] arr) {
        int [] frequencyArray = new int[100001];
        for (int i = 0; i < arr.length; i++) {
            if (frequencyArray[arr[i]] >= 0) {
                frequencyArray[arr[i]]++;
            } else {
                frequencyArray[arr[i]] = 0;
            }
            
        }
        return frequencyArray;
    }
    static void sortZerosAndOnes(int[] arr) {
        int n = arr.length;
        int leftPointer = 0;
        int rightPointer = --n;

        while (leftPointer < rightPointer) {
            if (arr[leftPointer] == 1 && arr[rightPointer] == 0) {
                swap(arr, leftPointer, rightPointer);
                leftPointer++;
                rightPointer--;
            }
            if (arr[leftPointer] == 0) {
                leftPointer++;
            }
            if (arr[rightPointer] == 1) {
                rightPointer--;
            }
        }
    }
    static boolean checkEven(int x) {
        if (x % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    static void sortEvensAndOdds(int[] arr) {
        int n = arr.length;
        int leftPointer = 0, rightPointer = --n;

        while (leftPointer < rightPointer) {
            if (!checkEven(arr[leftPointer]) && checkEven(arr[rightPointer])) {
                swap(arr, leftPointer, rightPointer);
                leftPointer++;
                rightPointer--;
            }
            if (checkEven(arr[leftPointer])) leftPointer++;
            if (!checkEven(arr[rightPointer])) rightPointer--;
        }
    }
    static int[] sortSquares(int[] arr) {
        int len = arr.length;
        int[] sortedArr = new int[len];
        int leftPointer = 0, rightPointer = --len, k = 0;

        while (leftPointer < rightPointer) {
            if (Math.abs(arr[leftPointer]) > Math.abs(arr[rightPointer])) {
                sortedArr[k++] = arr[leftPointer] * arr[leftPointer];
                leftPointer++;
            } else {
                sortedArr[k++] = arr[rightPointer] * arr[rightPointer];
                rightPointer--;
            }
        }

        reverseArray(sortedArr);

        return sortedArr;
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
        // pairSum
        /* 
        int[] arr = {4, 6, 3, 5, 8, 2};
        Scanner sc = new Scanner(System.in);
        System.out.println("Input no.: ");
        int x = sc.nextInt();
        sc.close();
        int ansCount = 0;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int sum = arr[i] + arr[j];
                if (sum == x) {
                    ansCount++;
                }
                sum = 0;
            }
        }
        
        System.out.println(ansCount);
        */
        
        // Triplet Sum
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        System.out.println("Enter sum: ");
        int x = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        System.out.println(tripletSum(arr, x));
        */
        
        // Array Manipulation
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        System.out.println(uniqueArrayElement(arr));
        */
        
        /* 
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        
        int x = maxElement(arr);
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] == x) arr[j] = Integer.MIN_VALUE;
        }

        int secondMax = maxElement(arr);
        System.out.println(secondMax);
        */

        /* 
        int[] arr = createArray();
        int flag = 0;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    System.out.println(arr[i]);
                    flag = 1;
                    break;
                }
            }
            if (flag == 1) break;
        }
        */

        // Lecture 17
        // Swap two variables
        /* 
        int a = 3, b = 9;
        int temp = a; 
        a = b;
        b = temp;

        System.out.println("a is " + a + " b is " + b);
        */
        
        /* 
        int a = 3, b = 9;
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("a: " + a);
        System.out.println("b: " + b);
        */

        // Reverse array
        /*
        int[] arr = createArray();
        reverseArray(arr);
        System.out.println("Reversed array:");
        printArray(arr);
        */

        // Rotating arrays
        /* Extra Space
        int[] arr = createArray();
        int k = 3;

        int[] rotatedArr = rotateArray(arr, k);

        printArray(rotatedArr);
        */

        // In place
        /* 
        int[] arr = createArray();
        rotateArray(arr, 101);
        System.out.println("The reversed array: ");
        printArray(arr);
        */

        // Finding the presence of an element
        /* 
        Scanner sc = new Scanner(System.in);
        
        int[] arr = createArray();
        int q = 5;
        createFrequencyArray(arr);
        
        int[] freqArray = createFrequencyArray(arr);
        while (q > 0) {
            System.out.print("Enter element to be searched: ");
            int x = sc.nextInt();
            if (freqArray[x] > 0) {
                System.out.println("Present!");
            } else {
                System.out.println("Absent");
            }
            q--;
        }
        sc.close();
        */

        // LECTURE 18
        // Sort 0s and 1s in an array
        /* --> Normal approach 
        int[] arr = {1, 0, 1, 0, 1, 0, 1, 0};
        int zeroCount = 0;
        
        printArray(arr);
        for (int i : arr) {
            if (i == 0) {
                zeroCount++;
            }
        }

        for (int j = 0; j < zeroCount; j++) {
            arr[j] = 0;
        }
        for (int k = zeroCount; k < arr.length; k++) {
            arr[k] = 1;
        }
        
        printArray(arr);
        */

        /* --> Two pointer approach
        int[] inputArr = createArray();
        System.out.println("Original");
        printArray(inputArr);
        sortZerosAndOnes(inputArr);
        System.out.println("Sorted array");
        printArray(inputArr);
        */

        // Sort even and odd in an array
        /* 
        int[] arr = createArray();
        System.out.println("Original array");
        printArray(arr);
        sortEvensAndOdds(arr);
        System.out.println("Sorted array");
        printArray(arr);
        */

        // Array of squares in non - decreasing order
        /* 
        int[] arr = createArray();
        System.out.println("Original array");
        printArray(arr);
        int[] sortedArr = sortSquares(arr);
        System.out.println("Sorted Array");
        printArray(sortedArr);
        */
    }
}
