public class Q7 {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean x = (a <= b * c)? true:false;
        boolean y = (b <= a * c)? true:false;
        boolean z = (c <= b * a)? true:false;

        System.out.println(x || y || z);
    }
}
