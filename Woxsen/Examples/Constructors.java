package Examples;

public class Constructors {
    Constructors() {
        System.out.println("This is an empty/default constructor!");
    }
    Constructors(String in) {
        System.out.println("This is parameterised constructor and prints: " + in);
    }

    public static void staticMethod() {
        System.out.println("This is a static method and doesn't need object to be called!");
        }
    public void nonStaticMethod() {
        System.out.println("This is a non static method and needs object to be called!");
    }

    public static void main(String[] args) {
        staticMethod(); // Being called without object

        Constructors obj1 = new Constructors(); // Using default constructor
        Constructors obj2 = new Constructors("EEEuuuu"); // Using parameterised constructor
        obj1.nonStaticMethod(); // needs obj to call non static method
        obj2.nonStaticMethod(); // needs obj to call non static method
    }
}
