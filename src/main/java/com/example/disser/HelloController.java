package com.example.disser;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

public class HelloController implements Initializable {

    OpenWindow window = new OpenWindow();
    @FXML
    private WebView webView;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        String location = getClass().getResource("/init/parallel.html").toExternalForm();

        webView.getEngine().load(location);
    }

    @FXML
    void backAction(ActionEvent event) {
        window.openPageInThisStage("first.fxml", event);
    }
}