package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class GreeterApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout1 = new BorderPane();
        layout1.setPrefSize(300, 180);
        VBox vBox = new VBox();

        Button start = new Button("Start");
        TextField textField = new TextField();
        vBox.getChildren().addAll(new Label("Enter your name and start."), textField, start);

        layout1.setCenter(vBox);

        BorderPane layout2 = new BorderPane();
        layout2.setPrefSize(300, 180);

        Scene view1 = new Scene(layout1);
        Scene view2 = new Scene(layout2);

        start.setOnAction((event) -> {
            layout2.setCenter(new Label("Welcome " + textField.getText() + "!"));
            window.setScene(view2);
        });

        window.setScene(view1);
        window.show();
    }

    public static void main(String[] args) {
        launch(GreeterApplication.class);
    }
}
