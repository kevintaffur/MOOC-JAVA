package textstatistics;

import java.util.Arrays;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class TextStatisticsApplication extends Application {

    @Override
    public void start(Stage window) {
        BorderPane layout = new BorderPane();
        Label letters = new Label("Letters: 0");
        Label words = new Label("Words: 0");
        Label longest = new Label("The longest word is:");

        HBox bottomLabels = new HBox();
        bottomLabels.setSpacing(15);
        bottomLabels.getChildren().addAll(letters, words, longest);

        TextArea textArea = new TextArea();
        layout.setCenter(textArea);
        layout.setBottom(bottomLabels);

        textArea.textProperty().addListener((change, oldValue, newValue) -> {
            letters.setText("Letters: " + newValue.length());

            String[] parts = newValue.split(" ");
            
            words.setText("Words: " + parts.length);

            String longestWord = Arrays.stream(parts)
                    .sorted((word1, word2) -> word2.length() - word1.length())
                    .findFirst()
                    .get();
            longest.setText("The longest word is: " + longestWord);
        });

        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }
    
    public static void main(String[] args) {
        launch(TextStatisticsApplication.class);
    }

}
