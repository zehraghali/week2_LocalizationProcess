module com.example.week2_home {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.week2_home to javafx.fxml;
    exports com.example.week2_home;
}