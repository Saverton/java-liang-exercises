/** Program to generate a window with a bar chart.
 * @author Scott M.
 * PieChartDriver.java
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Insets;

public class PieChartDriver extends Application {
    /** Main method to run program. */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    /** Create a bar chart window. 
     * @param primary stage: Stage
     */
    public void start(Stage stage) {
        String[] labels = {"Project", "Quiz", "Midterm", "Final"};
        double[] proportions = {0.2, 0.1, 0.3, 0.4};
        PieChart chart = new PieChart(4);
        chart.setProportions(proportions);
        chart.setNames(labels);
        chart.setPadding(new Insets(15, 10, 10, 10));
        chart.paintChart();
        
        Scene scene = new Scene(chart);
        stage.setScene(scene);
        stage.setTitle("Pie Chart");
        stage.show();
    }
}
