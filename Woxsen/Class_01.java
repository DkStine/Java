public class Class_01 {
    static String reverseString(String str) {
        char[] charArr = str.toCharArray();
        int n = charArr.length;

        for (int i = 0; i < n / 2; i++) {
            char temp = charArr[i];
            charArr[i] = charArr[n - i - 1];
            charArr[n - i - 1] = temp;
        }

        return new String(charArr);
    }
    static int checkVowel(String str, char ch) {
        char[] charArr = str.toCharArray();
        int count = 0;

        for (int i : charArr) {
            if (i == ch) count++;
        }

        return count;
    }


    public static void main(String[] args) {
        // WAP to find sum of all elements in array
        int[] arr = {1, 2, 3, 4, 5};
        int sum = 0;

        for (int i : arr) sum += i;

        System.out.println("Sum: " + sum);

        System.out.println("Length: " + arr.length); // Length

        // WAP to calculate the avg of the values of an array
        System.out.println("Average: " + sum / arr.length);

        // WAP to create a java method to reverse a string
        String st = "hand";
        String revStr = reverseString(st);
        System.out.println("Reverse is: " + revStr);
        if (st.equals(revStr)) System.out.println("palindrome");
        else System.out.println("Not palindrome");

        // WAP to check if the given string contains a vowel 'e', if 'e' is present then how many times
        char ch = 'e';
        int vowelCount = checkVowel("Deepak", ch);
        if (vowelCount > 0) System.out.printf("The frequency of %c is: %d", ch, vowelCount);
        else System.out.println("Not present");
        
        // Assignment
        // WAP to find the k smallest elements in a given array
        // WAP to print a numerical right angled triangle
        // WAP to print Floyd's Triangle
        // WAP to reverse a number in Java
        // WAP to create a Java method to add two string values
        // WAP to calculate the fibonacci series
        // WAP to create left right angled triangle

    }
}
