// Extend Thread class
class Cooking extends Thread {
    @Override
    public void run() {
        for (int i = 1; i <= 10000; i++) {
            System.out.println("Cooking...");
        }
    }
}
class Coding extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++) {
            System.out.println("Coding now...");
        }
    }
}
class Chatting extends Thread {
    @Override
    public void run() {
        for(int i = 1; i <= 10000; i++) {
            System.out.println("Chatting with girlfriend...");
        }
    }
}

// Create Runnable bullet(object) -> implement Runnable interface
class Cooking1 implements Runnable {
    @Override
    public void run() {
        int i = 1;

        while (i < 100) {
            System.out.println("Cooking...");
        }
    }
}
class Chatting1 implements Runnable {
    @Override
    public void run() {
        int i = 1;

        while (i < 100) {
            System.out.println("Chatting...");
        }
    }
}

public class Threading {
    public static void main(String[] args) {
        /* --> Extending Thread class
        Cooking cook = new Cooking();
        Coding code = new Coding();
        Chatting chat = new Chatting();

        cook.start();
        code.start();
        chat.start();
        */
        
        /* --> Implementing Runnable Interface*/
        Cooking1 bullet1 = new Cooking1();
        Thread gun1 = new Thread(bullet1);
        Chatting1 bullet2 = new Chatting1();
        Thread gun2 = new Thread(bullet2);

        gun1.start();
        gun2.start();

    }
}