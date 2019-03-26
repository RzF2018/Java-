package AdapterPattern.commimpl;

import AdapterPattern.adapter.MediaAdapter;
import AdapterPattern.interfaces.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        //内置支持
        if ("mp3".equalsIgnoreCase(audioType)){
            System.out.println("can play mp3 file: " + fileName);
        }
        // 扩展
        else if ("vlc".equalsIgnoreCase(audioType)
                || "mp4".equalsIgnoreCase(audioType)){
            mediaAdapter = new MediaAdapter(audioType);
            mediaAdapter.play(audioType, fileName);
        }else {
            System.out.println("Invalid media: " + audioType + ",this format not " +
                    "supported");
        }
    }
}
