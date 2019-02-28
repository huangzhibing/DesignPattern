package AdpterPattern.Demo2;

public class Mp4Player implements MediaInterface{
    @Override
    public void playMp4(String name) {
        System.out.println("播放MP4文件，文件名："+name);
    }

    @Override
    public void playAvi(String name) {
        //什么都不用做
    }
}
