package com.musicplayer;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.Slider;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class MusicPlayerApp extends Application
{
    private MusicPlayer musicplayer;
    private ListView <String> playlist;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Enjoy Music");
        musicplayer=new MusicPlayer("C:\\Users\\itzar\\Downloads\\Sound-of-Salaar_320(PaglaSongs).mp3");

        Button playButton=new Button("play");
        Button pauseButton=new Button("pause");
        Button stopButton=new Button("stop");

        VBox vbox= new VBox(playButton,pauseButton,stopButton);
        Scene scene=new Scene(vbox,300,300);

        primaryStage.setScene(scene);
        primaryStage.show();

        playlist = new ListView<>();
        playlist.getItems().addAll("Song 1", "Song 2", "Song 3");
        vbox.getChildren().add(playlist);

        ListView<String> playlist = new ListView<>();
        playlist.getItems().addAll("Song 1", "Song 2", "Song 3");

        Slider volumeSlider = new Slider(0, 100, 50);
        volumeSlider.valueProperty().addListener((observable, oldValue, newValue) -> {
        musicplayer.setVolume(newValue.doubleValue() / 100.0);
    });

    vbox.getChildren().addAll(playlist, volumeSlider);
         }
        
}
