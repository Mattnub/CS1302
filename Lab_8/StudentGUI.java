/**
 * Created by Mattnub on 11/15/2016.
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

public class StudentGUI extends Application implements EventHandler<ActionEvent> {

    public static void main(String[] args) {
        launch(args);
    }
    final Button find = new Button();
    final Button update = new Button();
    final Button exit = new Button();
    @Override
    public void start(Stage primaryStage) {
//        Panes
        BorderPane root = new BorderPane();
        FlowPane topPane = new FlowPane();
        FlowPane bottomPane = new FlowPane();
        GridPane centerPane = new GridPane();
            centerPane.setPadding(new Insets(10, 10, 10, 10));
            centerPane.setVgap(10);
            centerPane.setHgap(10);
//        Buttons - Setting Text and Handle Actions
//        Add Buttons to bottom pane
        find.setText("Find");
        find.setOnAction(this);
        update.setText("Update");
        update.setOnAction(this);
        exit.setText("Exit");
        exit.setOnAction(this);
        bottomPane.getChildren().addAll(find, update, exit);
//        Label for Top Pane
        Label title = new Label();
            title.setText("Student Info");
        topPane.getChildren().add(title);
//        Labels and Boxes for Middle Pane
        Label id = new Label();
            id.setText("Student ID:");
        Label fn = new Label();
            fn.setText("First Name:");
        Label ln = new Label();
            ln.setText("Last Name:");
        Label gpa = new Label();
            gpa.setText("GPA:");
        TextField idText = new TextField();
        TextField fnText = new TextField();
        TextField lnText = new TextField();
        TextField gpaText = new TextField();
//        Add Labels and Boxes to GripPane
        centerPane.setConstraints(id, 0, 0);
        centerPane.setConstraints(fn, 0, 1);
        centerPane.setConstraints(ln, 0, 2);
        centerPane.setConstraints(gpa, 0, 3);
        centerPane.setConstraints(idText, 1, 0);
        centerPane.setConstraints(fnText, 1, 1);
        centerPane.setConstraints(lnText, 1, 2);
        centerPane.setConstraints(gpaText, 1, 3);
        centerPane.getChildren().addAll(id, fn, ln, gpa,
                idText, fnText, lnText, gpaText);

//        Add Panes to Root
        root.setCenter(topPane);
        root.setBottom(bottomPane);
        root.setCenter(centerPane);
//        Create scene and add to Stage
        Scene scene = new Scene(root, 250, 300);
        primaryStage.setTitle("Student Window");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if(exit == event.getSource()){
            System.out.println("Exit Pressed");
            System.exit(0);
        }
        if(update == event.getSource()){
            BorderPane bp = new BorderPane();
            Button btn = new Button();
                btn.setText("New Window Success!");
            bp.setCenter(btn);
            Scene scene = new Scene(bp, 300, 275);
            Stage stage = new Stage();
            stage.setTitle("New Window");
            stage.setScene(scene);
            stage.show();

        }
    }
}
