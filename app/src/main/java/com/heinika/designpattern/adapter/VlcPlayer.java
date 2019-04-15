package com.heinika.designpattern.adapter;

public class VlcPlayer implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        System.out.println("play Mp4 file name is " + fileName);
    }

    @Override
    public void playMp4(String fileName) {

    }
}
