module com.example.cinemauq {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.cinemauq to javafx.fxml;
    exports com.example.cinemauq;
}