class Phone{
    public void switchOn(){
        System.out.println("Switching on the phone...");
    }
    public void userName() {
        System.out.println("The username is DkStine");
    }
}

class SmartPhone extends Phone{
    public void playMusic() {
        System.out.println("Playing music...");
    }
    @Override
    public void userName() {
        System.out.println("The username is DkStine in SmartPhone");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        Phone ph = new SmartPhone();

        ph.userName();
        ph.switchOn();
    }
}
