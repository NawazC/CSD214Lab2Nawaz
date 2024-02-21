module com.example.test1csd214nawaz {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.test1csd214nawaz to javafx.fxml;
    exports com.example.test1csd214nawaz;
}