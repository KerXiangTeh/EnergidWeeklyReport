package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;

public class SampleController {

    @FXML
    private NumberAxis caloriesAxis;

    @FXML
    private LineChart<?, ?> lineChart;

    @FXML
    private CategoryAxis dateAxis;
    
    public void initialize(URL url, ResourceBundle rb) {
    	XYChart.Series series = new XYChart.Series<>();
    	series.setName("Calories");
    	
    	series.getData().add(new XYChart.Data("9/1",2800));
    	series.getData().add(new XYChart.Data("9/2",1800));
    	series.getData().add(new XYChart.Data("9/3",400));
    	series.getData().add(new XYChart.Data("9/4",3000));
    	
    	XYChart.Series series2 = new XYChart.Series<>();
    	series2.setName("Goal");
    	
    	series2.getData().add(new XYChart.Data("9/1",2000));
    	series2.getData().add(new XYChart.Data("9/2",2000));
    	series2.getData().add(new XYChart.Data("9/3",2000));
    	series2.getData().add(new XYChart.Data("9/4",2000));
    	
    	lineChart.getData().addAll(series, series2);
    	
    	//Below was an attempt at getting the table object to work - Ker 
    	//tableDate.setCellValueFactory(new PropertyValueFactory<Entry, LocalDate>("date"));
    	
    	
    }

}
