package com.heinika.designpattern.adapter;

public class MediaAdapter implements MediaPlayer {
    private AdvanceMediaPlayer advanceMediaPlayer;

    public MediaAdapter(String videoType){
        if(videoType.equalsIgnoreCase("vlc") ){
            advanceMediaPlayer = new VlcPlayer();
        } else if (videoType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer = new Mp4Player();
        }
    }


    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("vlc")){
            advanceMediaPlayer.playVlc(fileName);
        }else if(audioType.equalsIgnoreCase("mp4")){
            advanceMediaPlayer.playMp4(fileName);
        }
    }
}
