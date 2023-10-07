package Chapter2;

// import java.util.Scanner;
public class PracticeSet {
    public static void main(String[] args) {
        // float a = 7 / 4 * 9 / 2;
        // System.out.println(a);

        // Encryption
        char grade = 'B';

        grade = (char)(grade + 8);

        System.out.println("The encrypted grade is: " + grade);

        // Decryption
        char decryptGrade = (char)(grade - 8);

        System.out.println("The decrypted grade is: " + decryptGrade);

    }
}
