import java.util.Scanner;

public class ProgAssn4 {
    public static void main(String[] args) {
        // Q1
        Scanner in = new Scanner(System.in);
        // System.out.print("The first number: ");
        // int n1 = in.nextInt();
        // System.out.print("The second number: ");
        // int n2 = in.nextInt();
        // System.out.print("The third number: ");
        // int n3 = in.nextInt();

        // int sum = 0;
        // for (int n = n1; n <= n2; n += n3) {
        //     sum += n;
        //     System.out.print(n + " ");
        // }

        // System.out.println("\nThe sum of the numbers is: " + sum);

        // Q2
        /* 
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int sumOfDigits = 0;

        while (num != 0) {
            sumOfDigits += num % 10;
            num /= 10;
        }

        if (sumOfDigits % 9 == 0) {
            System.out.println("Is divisible by 9");
        } else {
            System.out.println("Not divisible");
        }
        */

        // Q3
        // System.out.print("Enter the value of N: ");
        // int N = in.nextInt();
        // int sum = 0, count = 0;
        
        // System.out.println("The random numbers are:");
        // do {
        //     int randomNum = (int) (Math.random() * N) + 1;
        //     System.out.print(randomNum + " ");
        //     sum += randomNum;
        //     count++;
        // } while (count < N);

        // double average = (double) sum/N;
        // System.out.println("\nThe average of these random numbers is: " + average);

        // Q4
        // System.out.println("Enter the two numbers:");
        // System.out.print("x: ");
        // int a = in.nextInt();
        // System.out.print("y: ");
        // int b = in.nextInt();
        // int gcd = 1;
        
        // while (true) {
        //     int x = Math.max(a, b);
        //     int y = Math.min(a, b);
        //     if (x % y == 0) {
        //         gcd = y;
        //         break;
        //     } else {
        //         a = x % y;
        //         b = y;
        //     }
        // }

        // System.out.println("The GCD is: " + gcd);

        // Q5
        // System.out.print("Enter the number: ");
        // int num = in.nextInt();
        // int sumOfFactors = 0;

        // for (int i = 1; i < num; i++) {
        //     if (num % i == 0) {
        //         sumOfFactors += i;
        //     }
        // }

        // if (sumOfFactors == num) {
        //     System.out.println("Perfect Number");
        // } else {
        //     System.out.println("Not a perfect number");
        // }

        // Q6
        // System.out.print("Enter the base: ");
        // int base = in.nextInt();
        // int n = base;
        // System.out.print("Enter the power: ");
        // int power = in.nextInt();

        // for (int i = 2; i <= power; i++) {
        //     base *= n;
        // }

        // System.out.printf("%d raised to the power %d is: %d", n, power, base);

        // Q7
        // System.out.print("Enter the number: ");
        // int num = in.nextInt();

        // for (int i = 1; i <= 10; i++) {
        //     System.out.printf("%d x %d = %d\n", num, i, num * i);
        // }

        // Q8
        // int n = (int) (Math.random() * 10) + 1;
        
        // while (true) {
        //     System.out.print("Guess the number: ");
        //     int userGuess = in.nextInt();
        //     if (userGuess < n) {
        //         System.out.println("Too low, try again!");
        //     }
        //     if (userGuess > n) {
        //         System.out.println("Too high, try again!");
        //     }
        //     if (userGuess == n) {
        //         System.out.println("Good guess");
        //         break;
        //     }
        // }

        // Q9
        /* 
        System.out.print("Enter the number: ");
        int num = in.nextInt();
        int result = 0;
        int multiplier = 1;

        while (num != 0) {
            int digit = num % 10;

            if (digit != 0) {
                result += digit * multiplier;
                multiplier *= 10;
            }

            num /= 10;
        }

        System.out.println(result);
        */

        // Q10
        /* 
        System.out.print("The value of N: ");
        int N = in.nextInt();
        int power = 1;

        while (power*3 <= N) {
            power *= 3;
        }
        System.out.println(power);
        */

        // HA1
        // int sumOfSquares = 0;
        // int sum = 0;

        // for (int i = 1; i <= 10; i++) {
        //     sum += i;
        //     sumOfSquares += i*i;
        // }

        // int squareOfSum = sum * sum;

        // if (sumOfSquares > squareOfSum) {
        //     System.out.println(sumOfSquares - squareOfSum);
        // } else {
        //     System.out.println(squareOfSum - sumOfSquares);
        // }

        // HA2
        // int sum = 0;

        // for (int i = 1; i < 1000; i++) {
        //     if (i % 3 == 0 | i % 5 == 0) {
        //         sum += i;
        //     }
        // }
        // System.out.println("The sum is: " + sum);

        // HA3
        // for (int i = 1000; i <= 2000; i++) {
        //     System.out.print(i + " ");

        //     if ((i - 999) % 5 == 0) {
        //         System.out.println();
        //     }
        // }

        // HA4
        // System.out.println("Enter value of N: ");
        // int N = in.nextInt();
        // int sumOfEven = 0;
        // int productOfOdd = 1;

        // for (int i = 1; i <= N; i++) {
        //     if (i % 2 == 0) {
        //         sumOfEven += i;
        //     } else {
        //         productOfOdd *= i;
        //     }
        // }

        // System.out.printf("The sum of even is %d and the product of odds is %d", sumOfEven, productOfOdd);
        
        // HA5
        // System.out.println("Enter the value of N: ");
        // int N = in.nextInt();

        // for (int i = 1; i <= N; i++) {
        //     int value = 1;

        //     // Print the numbers for each row
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(value);
        //         value = (value == 1) ? 2 : 1; // Alternating between 1 and 2
        //     }

        //     System.out.println(); // Move to the next line
        // }  --> Unable to solve...

        in.close();
    }
}
