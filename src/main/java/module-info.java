module com.example.workshopjavafxjdbc {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.workshopjavafxjdbc to javafx.fxml;
    exports com.example.workshopjavafxjdbc;
    exports com.example.workshopjavafxjdbc.gui;
    opens com.example.workshopjavafxjdbc.gui to javafx.fxml;
    opens com.example.workshopjavafxjdbc.model.entities;
    opens com.example.workshopjavafxjdbc.model.services;
    exports com.example.workshopjavafxjdbc.gui.util;

}