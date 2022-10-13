/** 
 * (Display a bar chart) Write a program that uses a bar chart to display the percentages 
 * of the overall grade represented by projects, quizzes, midterm exams, and the 
 * final exam, as shown in Figure 14.46b. Suppose that projects take 20 percent and 
 * are displayed in red, quizzes take 10 percent and are displayed in blue, midterm 
 * exams take 30 percent and are displayed in green, and the final exam takes 40
 * percent and is displayed in orange. Use the Rectangle class to display the bars. 
 * Interested readers may explore the JavaFX BarChart class for further study.
 * @author Scott M.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.layout.HBox;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Text;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;

public class Exercise_14_12 extends Application {
    /** Main method to run program. */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    /** Create a bar chart window. 
     * @param stage Stage: stage to set
     */
    public void start(Stage stage) {
        String[] labels = {"Project", "Quiz", "Midterm", "Final"};
        int[] quantity = {2, 1, 3, 4};
        HBox chart = createBarChart(labels, quantity, 100, 50);
        
        Scene scene = new Scene(chart);
        stage.setScene(scene);
        stage.setTitle("Bar Graph");
        stage.show();
    }
    
    /** Create a bar chart with an array of names and bars.
     * @param names String[]: names of categories
     * @param quantities int[]: quantities of each category
     * @param hScale int: horizontal scale in pixels
     * @param vScale int: vertical scale in pixels
     * @return Pane: drawn bar chart
     * Precondition: names and quantities arrays must be the same length.
     */
    public static HBox createBarChart(String[] names, int[] quantities, int hScale, int vScale) {
        HBox chart = new HBox();
        chart.setPadding(new Insets(10, 10, 10, 10));
        chart.setSpacing(10);
        int height = getMax(quantities) * vScale + 15;
        
        for (int i = 0; i < names.length; i++) {
            Pane pane = new Pane();
            Rectangle bar = new Rectangle(0, height - (vScale * quantities[i]), hScale, (vScale * quantities[i]));
            bar.setFill(new Color((float)Math.random(), (float)Math.random(), (float)Math.random(), 1.0));
            Text label = new Text(0, height - ((vScale * quantities[i]) + 10), names[i]);
            pane.getChildren().add(bar);
            pane.getChildren().add(label);
            chart.getChildren().add(pane);
        }
        
        return (chart);
    }
    
    /** Return max value in an integer array.
     * @param arr int[]: array of integers
     * @return int: max value
     */
    public static int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}