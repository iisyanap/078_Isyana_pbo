package behavioral_command;

public class Main {
    public static void main(String[] args) {
        // Membuat perangkat yang akan dikendalikan
        Light livingRoomLight = new Light();

        // Membuat perintah untuk mengontrol perangkat
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        // Membuat remote control
        RemoteControl remote = new RemoteControl();

        // Menyetel perintah ke remote control
        remote.setOnCommand(lightOn);
        remote.setOffCommand(lightOff);

        // Mengontrol perangkat menggunakan remote control
        remote.pressOnButton();  // Output: Lampu menyala
        remote.pressOffButton(); // Output: Lampu mati
    }
}
