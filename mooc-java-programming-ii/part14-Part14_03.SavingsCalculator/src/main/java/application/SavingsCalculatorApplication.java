package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SavingsCalculatorApplication extends Application {

    @Override
    public void start(Stage window) {
        // BorderPane.
        BorderPane layout = new BorderPane();

        // Axis for chart.
        NumberAxis xAxis = new NumberAxis(0, 30, 1);
        NumberAxis yAxis = new NumberAxis();
        yAxis.setAutoRanging(true);

        // Chart.
        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);

        // Data.
        XYChart.Series monthly = new XYChart.Series<>();
        XYChart.Series yearly = new XYChart.Series<>();

        // VBox container for sliders.
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10, 10, 10, 10));

        // BorderPanes inside vBox.
        BorderPane up = new BorderPane();
        BorderPane down = new BorderPane();
        vbox.getChildren().addAll(up, down);

        layout.setTop(vbox);

        // First slider.
        up.setLeft(new Label("Monthly savings"));
        Slider monthlySlider = new Slider(25, 250, 25);
        monthlySlider.setShowTickLabels(true);
        monthlySlider.setShowTickMarks(true);
        monthlySlider.setMajorTickUnit(25);
        monthlySlider.setBlockIncrement(1);
        up.setCenter(monthlySlider);
        Label monthlyLabel = new Label(String.valueOf((int) monthlySlider.getValue()));
        up.setRight(monthlyLabel);

        // Initial values for the first line.
        for (int i = 0; i <= 30; i++) {
            int monthlyValue = (int) monthlySlider.getValue();
            monthly.getData().add(new XYChart.Data(i, monthlyValue * 12 * i));
        }

        // First slider listener.
        monthlySlider.valueProperty().addListener((event) -> {
            monthlyLabel.setText(String.valueOf((int) monthlySlider.getValue()));

            monthly.getData().clear();
            for (int i = 0; i <= 30; i++) {
                int monthlyValue = (int) monthlySlider.getValue();
                monthly.getData().add(new XYChart.Data(i, monthlyValue * 12 * i));
            }
        });
        lineChart.getData().add(monthly);

        // Second slider.
        down.setLeft(new Label("Yearly interest rate"));
        Slider yearlySlider = new Slider(0, 10, 0);
        yearlySlider.setShowTickLabels(true);
        yearlySlider.setShowTickMarks(true);
        yearlySlider.setBlockIncrement(1);
        down.setCenter(yearlySlider);
        Label yearlyLabel = new Label(String.valueOf((int) yearlySlider.getValue()));
        down.setRight(yearlyLabel);

        // Second slider listener.
        yearlySlider.valueProperty().addListener((event) -> {
            yearlyLabel.setText(String.valueOf((int) yearlySlider.getValue()));

            yearly.getData().clear();
            double accumulator = 0.0;
            for (int i = 0; i <= 30; i++) {
                // Money per year.
                int yearlyValue = (int) monthlySlider.getValue() * 12 * i;
                // Accumulator to calculate interest.
                accumulator += yearlyValue;
                double interest = (accumulator * yearlySlider.getValue()) / 100;
                accumulator += interest;
                yearly.getData().add(new XYChart.Data(i, yearlyValue + interest));
            }
        });
        lineChart.getData().add(yearly);

        layout.setCenter(lineChart);

        Scene view = new Scene(layout);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(SavingsCalculatorApplication.class);
    }

}
