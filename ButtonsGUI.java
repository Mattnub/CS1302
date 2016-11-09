/**
 * Created by Mattnub on 11/08/2016.
 */

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class ButtonsGUI extends Application implements EventHandler<ActionEvent> {

    public static void main(String[] args) {
        launch(args);
    }
    /*final Button find = new Button();
    final Button clear = new Button();
    final Button exit = new Button();*/
    final MenuItem open = new MenuItem();
    final MenuItem close = new MenuItem();
    final MenuItem about = new MenuItem();
    final MenuItem exit = new MenuItem();


    @Override
    public void start(Stage primaryStage) {
        /*find.setText("Find");
        clear.setText("Clear");
        clear.setOnAction(this);
        exit.setText("Exit");
        exit.setOnAction(this);*/

        open.setText("Open");
        close.setText("Close");
        exit.setText("Exit");
            exit.setOnAction(this);
        about.setText("About");

        Menu file = new Menu();
            file.setText("File");
        Menu help = new Menu();
            help.setText("Help");

        MenuBar mb = new MenuBar();
            mb.getMenus().add(file);
            mb.getMenus().add(help);

        file.getItems().addAll(open, close, exit);
        help.getItems().add(about);

        BorderPane borderPane = new BorderPane();
        borderPane.setTop(mb);

        /*FlowPane flowPane = new FlowPane();
            flowPane.getChildren().add(find);
            flowPane.getChildren().add(clear);
            flowPane.getChildren().add(exit);*/

        Scene scene = new Scene(borderPane, 300, 250);

        primaryStage.setTitle("Button Practice");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void handle(ActionEvent event){
        /*if(clear == event.getSource()){
            System.out.println("User Clear");
            find.setText("");
            clear.setText("");
            exit.setText("");
        }*/
        if(exit == event.getSource()){
            System.out.println("User Exit");
            System.exit(0);
        }
    }
}
