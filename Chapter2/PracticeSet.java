package Chapter2;

import java.util.Scanner;
public class PracticeSet {
    public static void main(String[] args) {
        // float a = 7 / 4 * 9 / 2;
        // System.out.println(a);

        Scanner in = new Scanner(System.in);

        float grade = in.nextFloat();
        in.close();

        System.out.print("Encrypted grade is: ");

        float encryptGrade = grade + 8;
        System.out.println(encryptGrade);
        
        float decryptGrade = encryptGrade - 8;
        System.out.print("Decrypted grade is: ");
        System.out.print(decryptGrade);

    }
}
