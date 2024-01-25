public class Q4 {
    public static void main(String[] args) {
        double t = Double.parseDouble(args[0]);
        t = t * 180.0 / Math.PI;

        System.out.println(Math.cos(5 * t) + Math.sin(7 * t));
    }
}
