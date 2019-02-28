package AdpterPattern.Demo2;

public class Client {
    public static void main(String[] args) {
        AudioPlayer andioPlayer = new AudioPlayer();
        andioPlayer.play("mp3","适配器模式.mp3");
        andioPlayer.play("avi","适配器模式.avi");
        andioPlayer.play("mp4","适配器模式.mp4");
    }
}
