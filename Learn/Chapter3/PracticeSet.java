package Chapter3;

import java.util.Scanner;
public class PracticeSet {
    public static void main(String[] args) {
        // Q1
        // String initString = in.nextLine();
        // in.close();
        
        // String finalString = initString.toLowerCase();
        // System.out.println("The initial string is: " + initString + "\nThe final string is: " + finalString);
        
        
        // Q2
        // Scanner in = new Scanner(System.in);

        // System.out.print("Enter the string with spaces: ");
        // String spaceString = in.nextLine();
        // in.close();
        
        // System.out.println(spaceString.replace(" ", "_"));
        
        
        // Q4
        Scanner in = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String initString = in.nextLine();
        in.close();

        System.out.println(initString.indexOf("  ", 0));
        System.out.println(initString.indexOf("   ", 0));
        


    }
}
