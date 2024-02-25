import java.util.Scanner;

public class Assgn_01 {
    static int getMaxPairwiseProduct(int[] arr) {
        int maxProduct = 0, n = arr.length;
        
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                maxProduct = Math.max(maxProduct, arr[i] * arr[j]);
            }
        }
        return maxProduct;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] nums = new int[n];
        
        for (int i = 0; i < n; i++) {
            nums[i] = in.nextInt();
        }
        
        in.close();
        System.out.println(getMaxPairwiseProduct(nums));
    }
}