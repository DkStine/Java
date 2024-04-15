import java.util.Scanner;

class MyCellPhone {
    void makeCall(String phoneNumber) {
        System.out.println("Calling..." + phoneNumber);
    }
    void pickCall() {
        System.out.println("Picking call...");
    }
}
interface Wifi {
    String[] showAvailableNetworks();
    void connectNetwork(String network);
}

class Network implements Wifi {
    @Override
    public String[] showAvailableNetworks() {
        String[] netArr = {"A", "B", "C", "502"};
        return netArr;
    }
    @Override
    public void connectNetwork(String network) {
        System.out.println("You are connected to: " + network);
    }
}

interface Camera {
    void takeSnap();
    void recordVideo();
    default void recordVideoIn8k(){
        System.out.println("Recording in 8k...");
    }
}
interface MusicPlayer {
    void playMusic();
    void pauseMusic();
}
class MySmartPhone extends MyCellPhone implements Wifi, Camera, MusicPlayer {
    @Override
    public String[] showAvailableNetworks() {
        String[] availableNetworks = {"T2-502", "Oval", "WOU_Students", "..."};
        return availableNetworks;
    }
    @Override
    public void connectNetwork(String network) {
        System.out.println("Connecting to..." + network);
    }
    @Override
    public void takeSnap() {
        System.out.println("Taking Snap...");
    }
    @Override
    public void recordVideo() {
        System.out.println("Recording in 4k");
    }
    @Override
    public void playMusic() {
        System.out.println("Playing Music");
    }
    @Override
    public void pauseMusic() {
        System.out.println("Pausing music...");
    }
}

interface SampleParent {
    void meth1();
    void meth2();
}
interface SampleChild extends SampleParent {
    void meth3();
    void meth4();
}
class InterfaceInherit implements SampleChild {
    @Override
    public void meth1() {
        System.out.println("This is meth1");
    }
    @Override
    public void meth2() {
        System.out.println("This is meth2");
    }
    @Override
    public void meth3() {
        System.out.println("This is meth3");
    }
    @Override
    public void meth4() {
        System.out.println("This is meth4");
    }
}

public class Interface {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        // Interfaces
        /* 
        MySmartPhone xiaomi = new MySmartPhone();
        xiaomi.showAvailableNetworks();
        xiaomi.connectNetwork("T2-502");
        xiaomi.makeCall("9933784246");
        xiaomi.pickCall();
        xiaomi.playMusic();
        xiaomi.pauseMusic();

        // Interface Inheritance
        InterfaceInherit ii = new InterfaceInherit();
        ii.meth1();
        ii.meth2();
        ii.meth3();
        ii.meth4();
        */

        Network net = new Network();
        for (String s: net.showAvailableNetworks()) {
            System.out.print(s + " ");
        }

        System.out.print("\nEnter the network to connect: ");
        String toConnect = in.nextLine();
        net.connectNetwork(toConnect);
    }
}
