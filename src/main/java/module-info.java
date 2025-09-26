module com.example.disser {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;


    opens com.example.disser to javafx.fxml;
    exports com.example.disser;
}