package com.example.disser;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class FirstController implements Initializable {

    OpenWindow window = new OpenWindow();
    @FXML
    private Button Button1;

    @FXML
    private Button Button2;

    @FXML
    void lineAction(ActionEvent event) {
        window.openPageInThisStage("line.fxml", event);
    }

    @FXML
    void parallelAction(ActionEvent event) {
        window.openPageInThisStage("parallel.fxml", event);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }

}