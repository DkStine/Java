public class Q3 {
    public static void main(String[] args) {
        int randomInt, max = 6, min = 1;
        randomInt = (int) ((max - min + 1) * Math.random() + min);

        System.out.println(randomInt);
    }
}
