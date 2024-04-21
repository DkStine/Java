import java.util.Scanner;

class Person {
    private String name; private int age; private String city; private String country;

    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }

    public void setCity(String city) {
        this.city = city;
    }
    public String getCity() {
        return city;
    }

    public void setCountry(String country) {
        this.country = country;
    }
    public String getCountry() {
        return country;
    }
}

class Animal {
    public void makeSound(){};
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow!");
    }
}
class Bird extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Chirp...!");
    }
}

public class Lab04 {
    static boolean validateStringText(String text) {return text.matches("^[\\w]+$");}
    static boolean validatePIN(String PIN) {return PIN.matches("\\d{4}|\\d{6}|\\d{8}");}
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Q1 -> Write a Java program to create a class Person with private instance variables,
        // name, age, city and country. Use getters and setters.
        Person p1 = new Person();
        p1.setName("Rohan"); p1.setAge(19); p1.setCity("Kolkata"); p1.setCountry("India");

        Person p2 = new Person();
        p2.setName("Mohan");
        p2.setAge(20);
        p2.setCity("Wales");
        p2.setCountry("Great Britain");

        System.out.printf("%s is %d years old and stays in %s, %s.\n", p1.getName(), p1.getAge(), p1.getCity(), p1.getCountry());
        System.out.printf("%s is %d years old and stays in %s, %s.\n", p2.getName(), p2.getAge(), p2.getCity(), p2.getCountry());

        // WAP to check whether a string contains only a certain set of characters (in this case a-z, A-Z and 0-9)
        System.out.println(validateStringText("ABCDEFabcdef123450"));
        System.out.println(validateStringText("SQL"));
        System.out.println(validateStringText("Java"));
        System.out.println(validateStringText("*&%@#!"));
        System.out.println(validateStringText("w3resource.com"));

        // WAP to validate a PIN. Assume a PIN number is 4, 6 or 8.
        System.out.print("Enter your PIN: ");
        String pin = in.next();
        System.out.println("Is the given pin valid? " + validatePIN(pin));

        // WAP to create a base class Animal with a method called Sound(). Create the subclasses 
        // bird and cat, and override the sound method in each class for different sounds in diff animals
        Animal bd = new Bird();
        bd.makeSound();

        Animal ct = new Cat();
        ct.makeSound();


        in.close();
    }
}
