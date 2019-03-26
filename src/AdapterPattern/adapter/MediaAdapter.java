package AdapterPattern.adapter;

import AdapterPattern.interfaces.AdvancedMediaPlayer;
import AdapterPattern.interfaces.MediaPlayer;
import AdapterPattern.interfaces.impl.Mp4Player;
import AdapterPattern.interfaces.impl.VLCPlayer;

public class MediaAdapter implements MediaPlayer {

    /*
    实现复用引入
     */
    AdvancedMediaPlayer advancedMediaPlayer;

    public MediaAdapter(String audioType){
        if ("vlc".equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new VLCPlayer();
        }else if ("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer = new Mp4Player();
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        if ("vlc".equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playVLC(fileName);
        }else if ("mp4".equalsIgnoreCase(audioType)){
            advancedMediaPlayer.playMp4(fileName);
        }
    }
}
