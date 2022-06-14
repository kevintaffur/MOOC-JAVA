package ticTacToe;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class TicTacToeApplication extends Application {

    @Override
    public void start(Stage window) {
        UI ui = new UI();
        Scene view = new Scene(ui.getView());

        for (Button button : ui.getButtons()) {
            button.setOnAction((event) -> {
                if (ui.getInfo().equals("Turn: X")) {
                    if (!(button.getText().equals("X") || button.getText().equals("O"))) {
                        button.setText("X");
                        ui.setInfo("Turn: O");
                        if (ui.isGameOver()) {
                            ui.setInfo("The end!");
                        }
                    }
                } else {
                    if (!(button.getText().equals("X") || button.getText().equals("O"))) {
                        button.setText("O");
                        ui.setInfo("Turn: X");
                        if (ui.isGameOver()) {
                            ui.setInfo("The end!");
                        }
                    }
                }
            });
        }

        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(TicTacToeApplication.class);
    }

}
