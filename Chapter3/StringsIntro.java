package Chapter3;

public class StringsIntro {
    public static void main(String[] args) {
        String string = new String("Deepak Kumar");
        System.out.println(string);

        // System.out.println(string.charAt(2));
        // System.out.println(string.lastIndexOf("a"));
        // System.out.println(string.equals("Deepak Kumar"));
        System.out.println(string.equalsIgnoreCase("deepak kumar"));

    }
}