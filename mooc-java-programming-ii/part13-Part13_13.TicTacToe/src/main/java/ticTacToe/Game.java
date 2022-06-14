package ticTacToe;

import java.util.List;

import javafx.scene.control.Button;

public class Game {
    public boolean isGameOver(List<Button> buttons) {
        if (check(buttons, "X") || check(buttons, "O")) {
            for (Button button : buttons) {
                button.setDisable(true);
            }
            return true;
        } else {
            return false;
        }
    }
    
    private boolean check(List<Button> buttons, String str) {
        if ((buttons.get(0).getText().equals(str) &&
                buttons.get(1).getText().equals(str) &&
                buttons.get(2).getText().equals(str))
                ||
                (buttons.get(3).getText().equals(str) &&
                buttons.get(4).getText().equals(str) &&
                buttons.get(5).getText().equals(str))
                ||
                (buttons.get(6).getText().equals(str) &&
                buttons.get(7).getText().equals(str) &&
                buttons.get(8).getText().equals(str))
                ||

                (buttons.get(0).getText().equals(str) &&
                buttons.get(3).getText().equals(str) &&
                buttons.get(6).getText().equals(str))
                ||
                (buttons.get(1).getText().equals(str) &&
                buttons.get(4).getText().equals(str) &&
                buttons.get(7).getText().equals(str))
                ||
                (buttons.get(2).getText().equals(str) &&
                buttons.get(5).getText().equals(str) &&
                buttons.get(8).getText().equals(str))
                ||

                (buttons.get(0).getText().equals(str) &&
                buttons.get(4).getText().equals(str) &&
                buttons.get(8).getText().equals(str))
                ||
                (buttons.get(2).getText().equals(str) &&
                buttons.get(4).getText().equals(str) &&
                buttons.get(6).getText().equals(str))) {

            return true;
        } else {
            return false;
        }
    }
}
