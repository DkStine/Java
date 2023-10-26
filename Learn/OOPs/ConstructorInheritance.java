class Parent{
    Parent(){
        System.out.println("I am blank Parent constuctor");
    }
    Parent(int x){
        System.out.printf("I am overloaded Parent constructor printing x: %d\n", x);
    }
}
class Child extends Parent{
    Child(){
        System.out.println("I am blank Child constructor");
    }
    Child(int x, int y){
        super(x);
        System.out.printf("I am overloaded Child constructor printing y: %d\n", y);
    }
}
class GrandChild extends Child{
    GrandChild(){
        System.out.println("I am blank GrandChild constructor");
    }
    GrandChild(int x, int y, int z){
        super(x, y);
        System.out.printf("I am overloaded GrandChild constructor printing z: %d\n", z);
    }

}

public class ConstructorInheritance {
    public static void main(String[] args) {
        GrandChild gc = new GrandChild(23, 34, 78);
    }
}
