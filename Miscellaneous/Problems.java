public class Problems {
    static void checkAutomorphicNum(int num) {
        int sq = num * num;
        int div = 10, x, y;
        int flag = 1;

        while (num > 0) {
            x = num % div;
            y = sq % div;
            if (x != y) {
                flag = 0;
                System.out.println("Not automorphic");
                break;
            }
            num /= div;
            sq /= div;

        }

        if (flag == 1) System.out.println("Automorphic");
    }
    static int factorial(int num) {
        int fact = 1;

        for (int i = num; i > 1; i--) {
            fact *= i;
        }

        return fact;
    }
    static void checkPetersonNum(int num) {
        int temp = num;
        int factSum = 0;
        int div = 10;

        while (num > 0) {
            int x = num % div;
            factSum += factorial(x);
            num /= div;
        }   

        if (factSum == temp) System.out.println("Peterson number");
        else System.out.println("Not a peterson number");
    }
    static void checkSunnyNum(int num) {
        int nextNum = num + 1;
        double sqrt = Math.sqrt(nextNum);
        if (sqrt - Math.floor(sqrt) == 0) System.out.println("sunny number");
        else System.out.println("Not a sunny number");
    }
    static boolean checkNeonNumber(int num) {
        int sum = 0;
        int sq = num * num;

        while (sq > 0) {
            sum += (sq % 10);
            sq /= 10;
        }

        if (sum == num) return true;
        else return false;
    }
    static void printNeonNumbers(int start, int end) {
        while (start <= end) {
            if (checkNeonNumber(start)) System.out.print(start + " ");
            start++;
        }
    }
    static void checkSpyNum(int num) {
        int sum = 0;
        int prod = 1;

        while (num > 0) {
            int x = num % 10;
            sum += x;
            prod *= x;
            num /= 10;
        }

        if (sum == prod) {
            System.out.println("spy number");
        } else {
            System.out.println("not spy");
        }
    }
    static void reverseArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n / 2; i++) {
            int temp = arr[i];
            arr[i] = arr[n - 1 - i];
            arr[n - 1 - i] = temp;
        }
    }
    static void bubbleSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n-1; i++)
            for (int j = 0; j < n-i-1; j++)
                if (arr[j] > arr[j+1]) {
                    // swap temp and arr[i]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

        System.out.println("Sorted arr in ascending order:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
    static void occurenceFinder(int[] arr ,int target) {
        int count = 0;

        for (int value : arr) {
            if (value == target) {
                count++;
            }
        }

        System.out.println("The occurrence of " + target + " in the array is: " + count);

    }
    static void moveNegatives(int[] arr) {
        int n = arr.length;

        int j = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] < 0) {
                // swapping elements
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println("Array after moving negative elements to one side:");
        for (int value : arr) {
            System.out.print(value + " ");
        }
    }
    static void secondLargest(int[] arr) {
        int firstMax = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int value : arr) {
            if (value > firstMax) {
                secondMax = firstMax;
                firstMax = value;
            } else if (value > secondMax && value != firstMax) {
                secondMax = value;
            }
        }

        System.out.println("The second largest number in the array is: " + secondMax);
    }
    static void vowelConsonantCounter(String str) {
        str = str.toLowerCase();

        int vowels = 0, consonants = 0;

        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }

        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
    }
    static void removeWhiteSpaces(String str) {
        str = str.replaceAll("\\s", "");

        System.out.println("String after removing white spaces: " + str);
    }
    public static void main(String[] args) {
        /* */
        // Q1
        checkAutomorphicNum(35);
        // Q2
        checkPetersonNum(145);
        // Q3
        checkSunnyNum(9);
        // Q4
        printNeonNumbers(100, 800);
        // Q5
        checkSpyNum(154);
        // Q9
        int[] arr1 = {1, 2, 3, 4, 5};
        reverseArray(arr1);
        // Q10
        int[] arr2 = {1, 2, 3, 4, 5};
        bubbleSort(arr2);
        // Q11
        int[] arr3 = {1, 2, 3, 4, 5};
        occurenceFinder(arr3, 5);
        // Q12
        int[] arr4 = {-1, -2, 0, 1, -3, 4, -5};
        moveNegatives(arr4);
        // Q13
        int[] arr5 = {1, 2, 3, 4, 5};
        secondLargest(arr5);
        // Q14
        String s = "Hello World!";
        vowelConsonantCounter(s);
        // Q15
        String s2 = "    Hello    World!  ";
        removeWhiteSpaces(s2);
    }
}
