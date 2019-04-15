package com.heinika.designpattern.adapter;

public class AdapterPatternDemo {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp4","test.mp4");
        audioPlayer.play("mp3","test.mp3");
        audioPlayer.play("mkv","test.mkv");
    }
}
