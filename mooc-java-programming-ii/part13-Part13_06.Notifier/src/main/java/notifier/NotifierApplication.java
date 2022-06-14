package notifier;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class NotifierApplication extends Application {

    @Override
    public void start(Stage window) {
        VBox vbox = new VBox();
        TextField textField = new TextField("Hello World!");
        Button button = new Button("Update");
        Label label = new Label();

        vbox.setSpacing(15);
        vbox.getChildren().addAll(textField, button, label);

        button.setOnAction((event) -> {
            label.setText(textField.getText());
        });

        Scene view = new Scene(vbox);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(NotifierApplication.class);
    }

}
