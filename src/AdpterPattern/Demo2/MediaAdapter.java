package AdpterPattern.Demo2;

import com.sun.prism.shader.Solid_TextureYV12_AlphaTest_Loader;

/**
 * 适配器是实现了mediaplayer的play功能
 * mediainterface相当于插口，可以插入各种类型的播放器，比如mp4，avi播放器
 */

public class MediaAdapter implements MediaPlayer {
    public MediaInterface mediaInterface;

    @Override
    public void play(String type,String name){
        if(type.equalsIgnoreCase("mp4")){
            mediaInterface = new Mp4Player();
            mediaInterface.playMp4(name);
        }
        if(type.equalsIgnoreCase("avi")){
            mediaInterface = new AviPlayer();
            mediaInterface.playAvi(name);
        }
    }
}
