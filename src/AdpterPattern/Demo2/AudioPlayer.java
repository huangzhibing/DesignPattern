package AdpterPattern.Demo2;

public class AudioPlayer implements MediaPlayer{
    public MediaAdapter mediaAdapter;

    @Override
    public void play(String type, String name) {
        //原audioplayer要实现的播放mp3的功能
        if(type.equalsIgnoreCase("mp3")){
            System.out.println("播放MP3文件，文件名："+name);
        }
        //加入mediaadapter适配器之后AudioPlayer也可以播放avi和mp4
        else if(type.equalsIgnoreCase("avi")||type.equalsIgnoreCase("mp4")){
            mediaAdapter = new MediaAdapter();
            mediaAdapter.play(type,name);
        }
    }
}
