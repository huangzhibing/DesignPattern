package AdpterPattern.Demo2;

public class AviPlayer implements MediaInterface {
    @Override
    public void playMp4(String name) {
        //什么都不用做
    }

    @Override
    public void playAvi(String name) {
        System.out.println("播放AVI文件，文件名："+name);
    }

}
