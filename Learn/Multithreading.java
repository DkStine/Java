class Thread1 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i <= 100) {
            System.out.println("Joker");
        }
    }
}

class Thread2 extends Thread {
    @Override
    public void run() {
        int i = 0;
        while (i++ <= 100) {
            System.out.println("Helix de Folie kjdkfjdlk");
        }
    }
}

class Thread3 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i++ <= 50) System.out.println("Superman Salman ka fan!");
    }
}

class Thread4 implements Runnable {
    @Override
    public void run() {
        int i = 0;
        while (i++ <= 50) System.out.println("Fan of Akshay Kumar, Housefull 4, Phir Hera Pheri");
    }
}

public class Multithreading {
    public static void main(String[] args) {
        /* 
        Thread1 t1 = new Thread1();
        Thread2 t2 = new Thread2();
        
        t1.start();
        t2.start();
        */

        Thread3 t3 = new Thread3();
        Thread4 t4 = new Thread4();
        Thread thread3 = new Thread(t3);
        Thread thread4 = new Thread(t4);
        thread3.start();
        thread4.start();
    }
}
