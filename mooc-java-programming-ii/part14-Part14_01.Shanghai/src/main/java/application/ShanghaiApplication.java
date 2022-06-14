package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.stage.Stage;

public class ShanghaiApplication extends Application {

    @Override
    public void start(Stage window) {
        NumberAxis xAxis = new NumberAxis(2006, 2018, 1);
        NumberAxis yAxis = new NumberAxis(0, 100, 10);

        xAxis.setLabel("Year");
        yAxis.setLabel("Ranking");

        LineChart<Number, Number> lineChart = new LineChart<>(xAxis, yAxis);
        lineChart.setTitle("University of Helsinki, Shanghai rainking");

        XYChart.Series ranks = new XYChart.Series<>();
        ranks.getData().add(new XYChart.Data(2007, 73));
        ranks.getData().add(new XYChart.Data(2008, 68));
        ranks.getData().add(new XYChart.Data(2009, 72));
        ranks.getData().add(new XYChart.Data(2010, 72));
        ranks.getData().add(new XYChart.Data(2011, 74));
        ranks.getData().add(new XYChart.Data(2012, 73));
        ranks.getData().add(new XYChart.Data(2013, 76));
        ranks.getData().add(new XYChart.Data(2014, 73));
        ranks.getData().add(new XYChart.Data(2015, 67));
        ranks.getData().add(new XYChart.Data(2016, 56));
        ranks.getData().add(new XYChart.Data(2017, 56));

        lineChart.getData().add(ranks);

        Scene view = new Scene(lineChart, 640, 480);
        window.setScene(view);
        window.show();
    }

    public static void main(String[] args) {
        launch(ShanghaiApplication.class);
    }

}
