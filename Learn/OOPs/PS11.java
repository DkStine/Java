// Q1 and Q2
abstract class Pen {
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen {
    void changeNib() {
        System.out.println("Changing nib...");
    }
    @Override
    void write() {
        System.out.println("Writing...");
    }
    @Override
    void refill() {
        System.out.println("Refilling in progress...");
    }
}

// Q3 and Q5
interface BasicAnimal {
    void eat();
    void sleep();
}
class Monkey {
    void jump() {
        System.out.println("Jumping...");
    }
    void bite() {
        System.out.println("Beware, I may bite you...");
    }
}
class HumanBeing extends Monkey implements BasicAnimal {
    @Override
    public void eat() {
        System.out.println("Time to eat now...");
    }
    @Override
    public void sleep() {
        System.out.println("Sleep is important too...");
    }
}

// Q4
abstract class Telephone {
    abstract void ring();
    abstract void lift();
    abstract void disconnect();
}
class SmartTelephone extends Telephone {
    void useCamera() {
        System.out.println("Launching camera...");
    }
    void useSpotify() {
        System.out.println("Launching Spotify...");
    }
    void useInsta() {
        System.out.println("Launching Instagram...");
    }
    @Override
    void ring() {
        System.out.println("Ringing |/\\*|");
    }
    @Override
    void lift() {
        System.out.println("Which call to lift?");
    }
    @Override
    void disconnect() {
        System.out.println("Call disconnected");
    }
}

// Q6 and Q7 -> Easy
interface TVRemote {
    void home();
    void switchOn();
    void switchOff();
    void changeChannel(int chNum);
}
interface SmartTVRemote extends TVRemote {
    void netflix();
    void youtube();
    void wifi();
    void bluetooth();
}

public class PS11 {
    public static void main(String[] args) {
        // Q1 and Q2
        /*FountainPen pen = new FountainPen();
        pen.write();
        pen.refill();
        pen.changeNib();
        */

        // Q3
        /* 
        HumanBeing man = new HumanBeing();
        man.eat();
        man.bite();
        man.jump();
        man.sleep();
        */

        // Q4
        /* 
        Telephone tele = new SmartTelephone();
        tele.ring();
        tele.lift();
        tele.disconnect();
        // tele.useSpotify(); --> Error
        */

        // Q5
        /* 
        Monkey man = new HumanBeing();
        man.bite();
        man.jump();
        // man.sleep(); --> Error
        */
    }
}
