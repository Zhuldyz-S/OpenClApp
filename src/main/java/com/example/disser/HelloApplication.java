package com.example.disser;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Stage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("first.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1000, 700);
        stage.setTitle("OpenCL App");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        new HelloApplication().init();
        launch();
    }

    public void init() {

            String programPath = "D:\\Disser\\core\\OpenCLCLCalc-master\\PerfomanceProduction\\ConsoleClient\\Program.exe";
            StringBuilder outputBuffer = new StringBuilder();

            try {
                ProcessBuilder builder = new ProcessBuilder(programPath);
                builder.redirectErrorStream(true);
                Process process = builder.start();

                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(process.getInputStream())
                );

                String line;
                while ((line = reader.readLine()) != null) {
                    outputBuffer.append(line).append("<br>");
                }

                process.waitFor();

            } catch (Exception e) {
                outputBuffer.append(e.getMessage());
            }
    }
}