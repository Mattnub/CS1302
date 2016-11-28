/**
 * Created by Mattnub on 11/10/2016.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class LoginGUI extends Application implements EventHandler<ActionEvent> {

    public static void main(String[] args) {
        launch(args);
    }

    final Button login = new Button();
    final Button exit = new Button();
    final Label id = new Label();
    final Label pw = new Label();
    final TextField idInput = new TextField();
    final TextField pwInput = new TextField();
    @Override
    public void start(Stage primaryStage) {
        login.setText("Login");
            login.setOnAction(this);
        exit.setText("Exit");
            exit.setOnAction(this);

        FlowPane topPane = new FlowPane();
        FlowPane bottomPane = new FlowPane();
        GridPane centerPane = new GridPane();
            centerPane.setPadding(new Insets(12, 12, 12, 12));
            centerPane.setVgap(12);
            centerPane.setHgap(12);
        BorderPane root = new BorderPane();

        Label label = new Label();
            label.setText("User Login");
        topPane.getChildren().add(label);


        id.setText("User ID:");
        pw.setText("Password:");

            centerPane.setConstraints(id, 0, 0);
            centerPane.setConstraints(pw, 0, 1);
            centerPane.setConstraints(idInput, 1, 0);
            centerPane.setConstraints(pwInput, 1, 1);
        centerPane.getChildren().addAll(id, pw, idInput, pwInput);

        bottomPane.getChildren().addAll(login, exit);

        root.setTop(topPane);
        root.setCenter(centerPane);
        root.setBottom(bottomPane);

        Scene scene = new Scene(root, 250, 250);
        primaryStage.setTitle("Login Form");
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @Override
    public void handle(ActionEvent event) {
        if(exit == event.getSource()){
            System.out.println("User Exit");
            System.exit(0);
        }
        if(login == event.getSource()){
            if(idInput.getCharacters().charAt(0) == 'D' || idInput.getCharacters().charAt(0) == 'd'){
                System.out.println("First Char is D or d");
            }
            if(idInput.getCharacters().charAt(0) == 'A' || idInput.getCharacters().charAt(0) == 'a'){
                System.out.println("First Char is A or a");
            }
        }

    }
}
