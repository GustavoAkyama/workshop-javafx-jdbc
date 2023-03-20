package com.example.workshopjavafxjdbc;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.stage.Stage;

import java.io.IOException;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(Main.class.getResource("MainView.fxml"));
            ScrollPane scrollPane = loader.load();

            scrollPane.setFitToHeight(true);
            scrollPane.setFitToWidth(true);

            Scene scene = new Scene(scrollPane);
            stage.setScene(scene);
            stage.setTitle("Sample JavaFX application");
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
       }
    }

    public static void main(String[] args) {
        launch();
    }
}
