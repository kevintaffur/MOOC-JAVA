package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MultipleViews extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout1 = new BorderPane();
        Button button1 = new Button("To the second view!");
        layout1.setTop(new Label("First view!"));
        layout1.setCenter(button1);

        VBox layout2 = new VBox();
        Button button2 = new Button("To the third view!");
        layout2.getChildren().addAll(button2, new Label("Second view!"));

        GridPane layout3 = new GridPane();
        Button button3 = new Button("To the first view!");
        layout3.add(new Label("Third view!"), 0, 0);
        layout3.add(button3, 1, 1);

        Scene firstView = new Scene(layout1);
        Scene secondView = new Scene(layout2);
        Scene thirdView = new Scene(layout3);

        button1.setOnAction((event) -> {
            window.setScene(secondView);
        });

        button2.setOnAction((event) -> {
            window.setScene(thirdView);
        });

        button3.setOnAction((event) -> {
            window.setScene(firstView);
        });

        window.setScene(firstView);
        window.show();
    }

    public static void main(String[] args) {
        launch(MultipleViews.class);
    }

}
