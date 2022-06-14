package smiley;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class SmileyApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane borderPane = new BorderPane();
        Canvas canvas = new Canvas(640, 480);

        borderPane.setCenter(canvas);

        GraphicsContext graphicsContext = canvas.getGraphicsContext2D();

        graphicsContext.setFill(Color.BLACK);
        // Eyes.
        graphicsContext.fillRect(200, 100, 50, 50);
        graphicsContext.fillRect(400, 100, 50, 50);
        
        // Mouth.
        graphicsContext.fillRect(150, 250, 50, 50);
        graphicsContext.fillRect(450, 250, 50, 50);
        graphicsContext.fillRect(200, 300, 250, 50);

        Scene view = new Scene(borderPane);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(SmileyApplication.class);
    }

}
