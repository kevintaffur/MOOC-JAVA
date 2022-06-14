package application;

import java.nio.file.Files;
import java.nio.file.Paths;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class PartiesApplication extends Application {

    @Override
    public void start(Stage window) {
        NumberAxis xAxis = new NumberAxis(1968, 2008, 4);
        NumberAxis yAxis = new NumberAxis(0, 30, 5);

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("Relative support of the parties");

        try {
            Files.lines(Paths.get("partiesdata.tsv")).forEach((row) -> {
                if(!row.contains("Party")) {                
                    XYChart.Series data = new XYChart.Series<>();
                    String[] parts = row.split("\t");
                    data.setName(parts[0]);
                    int position = 1;
                    for (int i = 1968; i <= 2008; i += 4) {
                        String value = parts[position];
                        if (!value.equals("-")) {
                            data.getData().add(new XYChart.Data<>(i, Double.valueOf(parts[position])));
                        }
                        position++;
                    }
                    lineChart.getData().add(data);
                }
            });
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        Scene view = new Scene(lineChart);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(PartiesApplication.class);
    }
}
