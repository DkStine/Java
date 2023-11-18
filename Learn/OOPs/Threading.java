class Cooking extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.println("Cooking...");
        }
    }
}
class Coding extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("Coding now...");
        }
    }
}
class Chatting extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 10; i++) {
            System.out.println("Chatting with girlfriend...");
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        Cooking cook = new Cooking();
        Coding code = new Coding();
        Chatting chat = new Chatting();

        cook.start();
        code.start();
        chat.start();
    }
}