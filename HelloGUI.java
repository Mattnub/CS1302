/**
 * Created by Mattnub on 11/08/2016.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class HelloGUI extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    final Button btn = new Button();
    @Override
    public void start(Stage primaryStage) {
        btn.setText("Hello");

        FlowPane flowPane = new FlowPane();
        flowPane.getChildren().add(btn);

        Scene scene = new Scene(flowPane, 300, 250);

        primaryStage.setTitle("Hello World");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
