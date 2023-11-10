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
}

public class Interface {
    public static void main(String[] args) {
        MySmartPhone xiaomi = new MySmartPhone();
        xiaomi.showAvailableNetworks();
        xiaomi.connectNetwork("T2-502");
        xiaomi.makeCall("9933784246");
        xiaomi.pickCall();
        xiaomi.playMusic();
        xiaomi.pauseMusic();
    }
}
