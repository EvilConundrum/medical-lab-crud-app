package infom.grp7.lab_crud_app;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;

public class Main extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        String  viewsFolderPath = "/infom/grp7/lab_crud_app/views/";
        URL     viewsURL = getClass().getResource(viewsFolderPath + "MainView.fxml");
        assert  viewsURL != null;
        Parent  root = FXMLLoader.load(viewsURL);
        Scene   scene = new Scene(root);

        stage.setScene(scene);
        stage.show();

        stage.setOnCloseRequest(event -> {
            Platform.exit();         // Shuts down the JavaFX application cleanly, including all threads
            System.exit(0);   // Ensures that the JVM shuts down completely
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}