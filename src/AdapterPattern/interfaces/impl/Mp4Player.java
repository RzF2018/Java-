package AdapterPattern.interfaces.impl;

import AdapterPattern.interfaces.AdvancedMediaPlayer;

/**
 * 增强型媒体播放器接口实现类1:仅实现一种功能
 */
public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        //DO NOTHING
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("can play mp4 file: " + fileName);
    }
}
