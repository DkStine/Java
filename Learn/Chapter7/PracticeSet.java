package Learn.Chapter7;

public class PracticeSet {
    static void multiTable(int n){
        int i = 1;
        while (i <= 10){
            System.out.format("%d X %d = %d\n", n, i, n * i);
            i++;
        }
    }
    static void starPattern(int n){
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.format("* ");
            }
            System.out.print("\n");
        }
    }
    static int numSum(int n){ // Important
        if (n == 1){
            return 1;
        }else{
            return n + numSum(n - 1);
        }
    }
    static void starPatternRev(int n){
        for (int i = n; i > 0; i--){
            for (int j = i; j > 0; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    static int nFibonacciNum(int n){
        if (n == 1){
            return 0;
        }else if (n == 2){
            return 1;
        /*  --> Advanced approach
        if (n == 1 || n == 2){
            return n - 1;
        }
         */
        }else{
            return nFibonacciNum(n - 1) + nFibonacciNum(n - 2);
        }
    }
    static float avg(float ...arr){
        float sum = 0;
        for (float i : arr){
            sum += i;
        }

        return sum / arr.length;
    }
    static void starPatternRevRec(int n){
        if (n == 1){
            System.out.print("*\n");
        }else{
            for (int i = 1; i <= n; i++){
                System.out.print("* ");
            }
            System.out.println();
            starPatternRevRec(n - 1);
        }
    }
    static void starPatternRec(int n){
        if (n > 0){
            starPatternRec(n - 1);
            for (int i = 1; i <= n; i++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        // multiTable(5);
        // starPattern(5);
        // System.out.println(numSum(3));
        // starPatternRev(10);
        // System.out.println(nFibonacciNum(9));
        // System.out.println(avg(1.3f, 3.7f, 23.5f, 23));
        for (int i = 1; i <= 3; i++){
            starPatternRec(5);
            starPatternRevRec(5);
        }
    }
}
