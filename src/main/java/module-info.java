module infom.grp7.lab_crud_app {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens infom.grp7.lab_crud_app.controller to javafx.fxml;

    exports infom.grp7.lab_crud_app;
}