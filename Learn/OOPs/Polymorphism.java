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
    void sampleMethod() {
        System.out.println("Sample method");
    }
}

public class Polymorphism {
    public static void main(String[] args) {
        MusicPlayer mp = new MySmartPhone();  // --> This is a smartphone but use it as a Music Player only
        // MusicPlayer -> reference, MySmartPhone -> object
        // mp.showAvailableNetworks(); --> Invalid: Wifi class method
        // mp.sampleMethod(); --> Invalid: MySmartPhone class method
        mp.playMusic();
        mp.pauseMusic();
    }
}