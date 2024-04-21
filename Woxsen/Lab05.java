import java.util.Scanner;

class ExcessiveVowel extends Exception {
    ExcessiveVowel(String msg) {
        super(msg);
    }
}

public class Lab05 {
    static void validatePositive(int num) {
        if (num < 0) {
            throw new ArithmeticException("Negative input");
        } else System.out.println("Correct input");
    }
    static void validateVowelCount(String word) throws ExcessiveVowel {
        int count = 0, i = 0;

        while (i < word.length()) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'e' || word.charAt(i) == 'i' || word.charAt(i) == 'o' || word.charAt(i) == 'u') {
                count++;
                i++;
            } else i++;
        }
        if (count > 3) throw new ExcessiveVowel("Vowel count exceeded!");
        else System.out.println("The count of vowels is perfect!");
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Exception Handling --> WAP to create a method that takes an integer as a parameter and throws and exception if the number is odd.
        System.out.print("Input number: ");
        int num = in.nextInt();
        try {
            validatePositive(num);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);
        }
        in.nextLine();


        // WAP to create a method that takes string as I/P and throw and exception if the no. of 
        // vowels is more than 3
        System.out.print("Enter string to be vowel checked: ");
        String st = in.nextLine();
        try {
            validateVowelCount(st);
        } catch (ExcessiveVowel e) {
            System.out.println("Exception occured: " + e);
        }

        in.close();
    }
}
