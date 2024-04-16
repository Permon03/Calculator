package com.java_projects.calculator;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;

public class Main extends Application{
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(Main.class.getResource("MainFxml.fxml"));
        Scene scene = new Scene(fxmlLoader.load());
        stage.setTitle("Calculator");
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);

    }
}
