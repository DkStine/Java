import java.util.Scanner;
// import java.math.BigInteger;

public class Assgn_02 {
    // static BigInteger fibNaive(int n) {
    //     if (n == 0) return BigInteger.ZERO;
    //     else if (n == 1) return BigInteger.ONE;
    //     else return fibNaive(n - 1).add(fibNaive(n - 2));
    // }

    // static BigInteger fibEfficient(int n) {
    //     BigInteger[] fibArr = new BigInteger[n + 1];
    //     fibArr[0] = BigInteger.ZERO;
    //     fibArr[1] = BigInteger.ONE;
    //     for (int i = 2; i < n + 1; i++) {
    //         fibArr[i] = fibArr[i - 1].add(fibArr[i - 2]);
    //     }

    //     return fibArr[n];
    // }

    static long gcdEfficient(long a, long b) {
        if (a > b) {
            if (a % b == 0) return b;
            return gcdEfficient(b, a % b);
        }

        return gcdEfficient(a, b % a);
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // int term = in.nextInt();
        // int mod = in.nextInt();
        // System.out.println(fibNaive(term));
        // System.out.println(fibEfficient(term));
        // BigInteger lastDigit = fibEfficient(term).remainder(BigInteger.valueOf(mod));
        // System.out.println(lastDigit);

        // GCD
        long a = in.nextLong();
        long b = in.nextLong();
        System.out.println(gcdEfficient(a, b));
        in.close();
    }
}
