import java.util.Scanner;

public class ProgAssn5 {
    static boolean checkPrime(int n) {
        int flag = 1;
        for (int i = 2; i <= (int) Math.sqrt(n); i++) {
            if (n % i == 0) {
                flag = 0;
                return flag == 1;
            }
        }
        return flag == 1;
    }
    static double calculateSin(double x, double error) {
            double result = 0.0;
            int n = 1;
            double term = x;

            while (Math.abs(term) > error) {
                result += term;
                n += 2;
                term = -term * x * x / (n * (n - 1));
            }

            return result;
    }
    static double calculateCos(double x, double error) {
        double result = 1.0;
        int n = 2;
        double term = -x * x / 2.0;

        while (Math.abs(term) > error) {
            result += term;
            n += 2;
            term = -term * x * x / (n * (n - 1));
        }

        return result;
    }
    static int factorial(int n) {
        int fact = 1;
        for (int i = n; i > 1; i--) {
            fact *= i;
        }
        return fact;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Q1
        /* 
        System.out.print("Enter first number: ");
        int x = scan.nextInt();
        System.out.print("Enter second number: ");
        int y = scan.nextInt();

        int sumOfFactorsX = 0;
        int sumOfFactorsY = 0;

        for (int i = 1; i < x; i++) {
            if (x % i == 0) {
                sumOfFactorsX += i;
            }
        }
        for (int j = 1; j < y; j++) {
            if (y % j == 0) {
                sumOfFactorsY += j;
            }
        }

        if (sumOfFactorsX == y && sumOfFactorsY == x) {
            System.out.println("These are amicable numbers.");
        } else {
            System.out.println("Non amicable numbers.");
        }
        */

        // Q2
        /* 
        System.out.println("Enter a number: ");
        int num = scan.nextInt();

        boolean numIsPrime = checkPrime(num);
        
        int revNum = 0;
        while (num != 0) {
            int digit = num % 10;
            revNum = revNum * 10 + digit;
            num /= 10;
        }
        boolean revNumIsPrime = checkPrime(revNum);

        if (numIsPrime == revNumIsPrime) {
            System.out.println("Twisted prime");
        }else {
            System.out.println("Not twisted prime");
        }
        */

        // Q3
        /* 
        System.out.println("First number: ");
        int x = scan.nextInt();
        System.out.println("Second number: ");
        int y = scan.nextInt();

        // System.out.println(checkPrime(6));

        for (int i = x + 1; i < y; i++) {
            if (checkPrime(i)) {
                System.out.printf("%d ", i);
            }
        }
        */

        // Q4
        /* 
        System.out.println("Enter m: ");
        int m = scan.nextInt();
        System.out.println("Enter n: ");
        int n = scan.nextInt();

        for (int i = m; i <= n; i++) {
            System.out.printf("Factorial of %d is %d\n", i, factorial(i));
        }
        */

        // Q5
        /* 
        int n = 2;
        
        while (n <= 15) {
            System.out.printf("Multiplication table of %d\n", n);
            for (int i = 1; i <= 10; i++) {
                System.out.printf("%d x %d = %d\n", n, i, n * i);
            }
            n++;
        }
        */

        // Q6
        /* 
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
        
        int number = 1;
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++;
            }
            System.out.println();
        }
        
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        */
        
        // Q7
        /* 
        for (int i = 1; i <= 5; i++) {
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }
            System.out.println();
        }
        
        for (int i = 5; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
        
        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int k = rows - i; k > 0; k--) {
                System.out.print("   ");
            }
            
            // Inner loop for each row
            for (int j = 1; j <= i; j++) {
                System.out.print(i + " ");
            }
            System.out.println(); // Move to the next line after each row
        }
        */
        
        // Q8
        /* 
        System.out.println("Enter the value of n: ");
        int n = scan.nextInt();
        int finalSum = 0;
        
        for (int i = 1; i <= n; i++) {
            int rowSum = 0;
            for (int j = 1; j <= i; j++) {
                rowSum += j;
            }
            finalSum += rowSum;
            // System.out.println();
        }
        System.out.println(finalSum);
        */        
        
        // Q9
        /* 
        System.out.println("Enter the value of n: ");
        int n = scan.nextInt();
        float sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += (1 / (i * i));
        }

        System.out.println("The sum is: " + sum);
        */

        // Q10
        /* 
        System.out.println("No. of terms: ");
        int n = scan.nextInt();
        int a = 0, b = 1, c = 1;
        
        int i = 3;

        System.out.printf("%d %d %d ", a, b, c);
        while (i <= n) {
            int nextTerm = a + b + c;
            System.out.print(nextTerm + " ");
            a = b;
            b = c;
            c = nextTerm;
            i++;
        }
        */

        // HA1
        /* 
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >= 1; j--) {
                if (j == i) {
                    System.out.print("* ");
                } else {
                    System.out.printf("%d ", j);
                }
            }
            System.out.println();
        }
        */

        // HA2
        /* 
        for (int i = 1; i <= 5; i++) {
            for (int k = 1; k <= 5 - i; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        */

        // HA3 --> Nahi aaya mujhe ChatGPT se chhapa hai yeh aur iske baad wala
        /* 
        System.out.println("Enter the value of x: ");
        double x = scan.nextDouble();
        double error = 1e-6;
        
        double result = calculateSin(x, error);
        
        System.out.println("sin(" + x + ") = " + result);
        */
        
        // HA4
        /* 
        System.out.println("Enter the value of x: ");
        double x = scan.nextDouble();
        double error = 1e-6;

        double result = calculateCos(x, error);

        System.out.println("cos(" + x + ") = " + result);
        */
    

        // HA5
        /* 
        System.out.println("Enter the number of terms: ");
        int n = scan.nextInt();
        int a = 0, b = 1;

        System.out.printf("%d %d ", a, b);
        int t = 2;

        while (t <= n) {
            int nextTerm = a + b;
            System.out.print(nextTerm + " ");
            a = b;
            b = nextTerm;
            t++;
        }
        */



        scan.close();

    }
}
