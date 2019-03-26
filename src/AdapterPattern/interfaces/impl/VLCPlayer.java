package AdapterPattern.interfaces.impl;

import AdapterPattern.interfaces.AdvancedMediaPlayer;

/**
 * 增强型媒体播放器接口实现类1:仅实现一种功能
 */
public class VLCPlayer implements AdvancedMediaPlayer {
    @Override
    public void playVLC(String fileName) {
        System.out.println("can play vlc file: " + fileName);
    }

    @Override
    public void playMp4(String fileName) {
        // DO NOTHING
    }
}
