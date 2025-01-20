module com.example.TestProject {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.TestProject to javafx.fxml;
    exports com.example.TestProject;
}