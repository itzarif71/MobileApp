package com.musicplayer;

import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.util.Duration;

public class MusicPlayer {
  private MediaPlayer mediaPlayer;

  public MusicPlayer(String mediaPath){
    Media media=new Media(mediaPath);
    mediaPlayer=new MediaPlayer(media);

    mediaPlayer.setOnEndOfMedia(() ->{

    });
  }

  public void play(){
    mediaPlayer.play();
  }
  public void pause(){
    mediaPlayer.pause();
  }
  public void stop(){
    mediaPlayer.stop();
    mediaPlayer.seek(Duration.ZERO);
  }

  public void setVolume(double volume){
    mediaPlayer.setVolume(volume);
  }
}
