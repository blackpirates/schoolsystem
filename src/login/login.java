package login;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.FileInputStream;

/**
 * Created by Administrator on 15-Mar-18.
 */
public class login extends Application {


    @Override
    public void start(Stage stage) throws Exception {




      //  AnchorPane root = (AnchorPane) loader.load(fxmlStream);

        Parent root = FXMLLoader.load(getClass().getResource("loginPage.fxml"));


        // Create the Scene

        Scene scene = new Scene(root);

        // Set the Scene to the Stage

        stage.setScene(scene);

        // Set the Title to the Stage

        stage.setTitle("sims");

        // Display the Stage

        stage.show();


    }
}
