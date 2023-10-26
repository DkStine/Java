class Animal{
    String color;

    public void setColor(String c){
        this.color = c;
    }
}

class Dog extends Animal{
    int legs;
    String name;

    public Dog(String c, int l, String n){
        this.legs = l;
        this.name = n;
        this.color = c;
    }

    public void getDetails(){
        System.out.println("legs: " + this.legs + ", name: " + this.name + ", color: " + this.color);
    }

}

public class Inheritance {
    public static void main(String[] args) {
        // Object of derived class Dog
        Dog d = new Dog("black", 4, "Tommy");
        d.getDetails();

        // Object of SuperClass Animal
        Animal a = new Animal();
        a.setColor("brown");
    }
}
