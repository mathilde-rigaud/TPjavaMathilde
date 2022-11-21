package com.example.aaa;

import com.sun.media.jfxmedia.MediaPlayer;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HeaderBarView extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HeaderBarView.class.getResource("hello-view.fxml"));

        //Parent root = FXMLLoader.load(getClass().getResource("FXMLDocument.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Hello!");

        //stage.initStyle(StageStyle.TRANSPARENT);
        stage.setScene(scene);
        stage.show();


    }

    public static void main(String[] args) {

        launch();

    }
}
/*

    public static int SetPourcentageCompletion (int pourcentage){

    }

    public static int SetScore(int score){

    }

    public static int setDeathCounter(int a){

    }

 */