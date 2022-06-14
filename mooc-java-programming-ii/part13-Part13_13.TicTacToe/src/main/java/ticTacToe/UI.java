package ticTacToe;

import java.util.ArrayList;
import java.util.List;

import javafx.geometry.Insets;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;

public class UI {
    private List<Button> buttons;
    private Label info;
    private Game game;

    public UI() {
        this.buttons = new ArrayList<>();
        this.info = new Label("Turn: X");
        this.game = new Game();
    }


    public Parent getView() {
        BorderPane layout = new BorderPane();
        this.info.setFont(Font.font("Monospaced", 40));
        GridPane grid = new GridPane();
        grid.setVgap(10);
        grid.setHgap(10);
        grid.setPadding(new Insets(10, 10, 10, 10));

        layout.setTop(this.info);
        layout.setCenter(grid);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                Button button = new Button(" ");
                button.setFont(Font.font("Monospaced", 40));
                grid.add(button, i, j);
                this.buttons.add(button);
            }
        }
        return layout;
    }

    public boolean isGameOver() {
        return this.game.isGameOver(this.buttons);
    }

    public String getInfo() {
        return this.info.getText();
    }

    public void setInfo(String string) {
        this.info.setText(string);
    }

    public List<Button> getButtons() {
        return this.buttons;
    }
}
