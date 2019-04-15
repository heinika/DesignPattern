package com.heinika.designpattern.adapter;

public class Mp4Player implements AdvanceMediaPlayer {
    @Override
    public void playVlc(String fileName) {

    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("play Mp4 file name is " + fileName);
    }
}
