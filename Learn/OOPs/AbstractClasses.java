abstract class SmartPhone {
    SmartPhone() {
        System.out.println("I am constructor of SmartPhone class.");
    }

    abstract public void bootScreen();
}

class Xiaomi extends SmartPhone {
    @Override
    public void bootScreen() {
        System.out.println("Booting Xiaomi...");
    }
}
class Realme extends SmartPhone {
    @Override
    public void bootScreen() {
        System.out.println("Booting Realme...");
    }
}
class Apple extends SmartPhone {
    @Override
    public void bootScreen() {
        System.out.println("Booting Apple...");
    }
}

public class AbstractClasses {
    public static void main(String[] args) {
        Apple app = new Apple();
        app.bootScreen();
        Realme real = new Realme();
        real.bootScreen();
        Xiaomi xi = new Xiaomi();
        xi.bootScreen();
    }
}
