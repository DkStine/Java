class A{
    int a;

    public void meth1(){
        System.out.println("Method 1 of class A");
    }
    public void meth2(){
        System.out.println("Method 2 of class A");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("Method 2 of class B");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        A a = new A();
        a.meth2();

        B b = new B();
        b.meth2();
    }
}
