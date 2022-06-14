package collage;

import javafx.application.Application;

import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        // the example opens the image, creates a new image, and copies the opened image
        // into the new one, pixel by pixel
        Image sourceImage = new Image("file:monalisa.png");

        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();

        int yCoordinate = 0;
        while (yCoordinate < height / 2) {
            int xCoordinate = 0;
            while (xCoordinate < width / 2) {

                Color color = imageReader.getColor((xCoordinate + xCoordinate), (yCoordinate + yCoordinate));
                double red = 1.0 - color.getRed();
                double green = 1.0 - color.getGreen();
                double blue = 1.0 - color.getBlue();
                double opacity = color.getOpacity();

                Color newColor = new Color(red, green, blue, opacity);

                // Top left corner.
                imageWriter.setColor(xCoordinate, yCoordinate, newColor);

                // Top right corner.
                imageWriter.setColor(xCoordinate + width / 2, yCoordinate, newColor);

                // Bottom left corner.
                imageWriter.setColor(xCoordinate, yCoordinate + height / 2, newColor);

                // Bottom right corner.
                imageWriter.setColor(xCoordinate + width / 2, yCoordinate + height / 2, newColor);

                xCoordinate++;
            }

            yCoordinate++;
        }

        // // Top left corner.
        // ImageView image1 = new ImageView(targetImage);
        // image1.setViewport(new Rectangle2D(0, 0, width / 2, height / 2));
        
        // // Top right corner.
        // ImageView image2 = new ImageView(targetImage);
        // image2.setViewport(new Rectangle2D(0, 0, width / 2, height / 2));
        
        // // Bottom left corner.
        // ImageView image3 = new ImageView(targetImage);
        // image3.setViewport(new Rectangle2D(0, 0, width / 2, height / 2));
        
        // // Bottom right corner.
        // ImageView image4 = new ImageView(targetImage);
        // image4.setViewport(new Rectangle2D(0, 0, width / 2, height / 2));
        
        // Pane pane = new Pane(); 
        // pane.getChildren().addAll(image1, image2, image3, image4);
        // image1.relocate(0, 0);
        // image2.relocate(width / 2, 0);
        // image3.relocate(0, height / 2);
        // image4.relocate(width / 2, height / 2);

        // Image.
        ImageView image = new ImageView(targetImage);
        Pane pane = new Pane();
        pane.getChildren().add(image);
        
        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
