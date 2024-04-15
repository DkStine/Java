import java.util.Scanner;

class OddInputException extends Exception {
    public OddInputException(String message) {
        super(message);
    }
}

public class ExceptionHandling {
    static void inputEven(int num) throws OddInputException {
        if (num % 2 != 0) throw new OddInputException("The input is odd");
        else System.out.println("The input is even!");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input a number: ");
        int input = in.nextInt();
        try {
            inputEven(input);
        } catch (OddInputException e) {
            System.out.println("Exception occured --> " + e);
        }

        System.out.println("Rest of the code is also running!");
        in.close();
    }
}