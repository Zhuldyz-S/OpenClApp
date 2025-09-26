package com.example.disser;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class OpenWindow {

    protected void openPageInCurrentStage(String fxmlPath, Object eventSource) {
        try {
            // Загружаем новый FXML
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            // Получаем текущий Stage
            Stage stage = (Stage) ((Node) eventSource).getScene().getWindow();
            // Заменяем сцену
            stage.setScene(new Scene(loader.load(), 950, 650));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
        /* Example:
        modulePane1.setOnMouseClicked(event -> {
            window.openPageInCurrentStage("hello-view.fxml", event.getSource());
        });
        */
    }

    // это такой же метод как и openPageInCurrentStage(), но реализация которая
    // позволяет привязывать метод открытия нового окна прямо в SceneBuilder
    protected void openPageInThisStage(String fxmlPath, ActionEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loader.load(), 1000, 700));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // переопределение метода с MouseEvent
    protected void openPageInThisStage(String fxmlPath, MouseEvent event) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(loader.load(), 950, 650));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // чтобы новая страница открывалась в отдельном окне
    protected void openPageInAnotherStage(String fxmlPath, int width, int height) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlPath));
            Stage stage = new Stage();
            stage.setScene(new Scene(loader.load(), width, height));
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    // Метод для закрытия текущего окна
    protected void closeCurrentStage(ActionEvent event) {
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        stage.close();
    }
}
