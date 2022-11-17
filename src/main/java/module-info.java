module com.main.main {
    requires javafx.graphics;
    requires javafx.fxml;
    requires javafx.controls;
    requires javafx.base;
    requires java.sql;
    requires mysql.connector.j;


    opens com.main.controller to javafx.fxml;
    exports com.main.controller;
}