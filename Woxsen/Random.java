class ConstructerTest {
    int id, mobNo;

    ConstructerTest() {  // -> Default
        System.out.println("This is constructor!");
    }
    ConstructerTest(int id, int mNum) {   // -> Parameterised
        this.id = id;
        this.mobNo = mNum;
    }
    ConstructerTest(ConstructerTest obj) {   // -> Copy
        this.id = obj.id;
        this.mobNo = obj.mobNo;
    }
}

class SubConst extends ConstructerTest {
    void superMethod() {
        System.out.println(super.id);
        System.out.println(super.mobNo);
    }
}

public class Random {
    public static void main(String[] args) {
        ConstructerTest obj1 = new ConstructerTest(123, 45678);
        ConstructerTest obj2 = new ConstructerTest(obj1);
        System.out.println("Obj 1 ka id: " + obj1.id);
        System.out.println("Obj 2 ka id: " + obj2.id);
    }
}
