module com.java_projects.calculator {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.java_projects.calculator to javafx.fxml;
    exports com.java_projects.calculator;
}