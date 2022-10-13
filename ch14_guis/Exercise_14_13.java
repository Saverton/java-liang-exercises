/** 
 * (Display a pie chart) Write a program that uses a pie chart to display the percentages 
 * of the overall grade represented by projects, quizzes, midterm exams, and 
 * the final exam, as shown in Figure 14.46c. Suppose that projects take 20 percent 
 * and are displayed in red, quizzes take 10 percent and are displayed in blue, 
 * midterm exams take 30 percent and are displayed in green, and the final exam 
 * takes 40 percent and is displayed in orange. Use the Arc class to display the pies. 
 * Interested readers may explore the JavaFX PieChart class for further study. 
 * @author Scott M.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;

public class Exercise_14_13 extends Application {
    /** Main method to run program. */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    /** Create a bar chart window. 
     * @param stage Stage: stage to set
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

class PieChart extends Pane {
    private int elements;
    private double[] proportions;
    private String[] names;
    
    /** Construct a pie chart with x amount of elements.
     * @param elements int: number of elements/slices
     */
    public PieChart(int elements) {
        this.elements = elements;
    }
    
    /** Set an array of double quantities to proportions. return true if assigning
     * is successful, false otherwise.
     * @param proportions double[]: list of proportions
     * @return boolean: true = successfully set proportions list, false otherwise
     * Precondition: List of proportions must be of size (this.elements) and all quantities
     *      must have a total sum of 1.0 (within 0.001).
     */
    public boolean setProportions(double[] proportions) {
        boolean successful = false;
        
        if (proportions.length == elements && ((int)(getSum(proportions) * 1000) == 1000)) {
            this.proportions = proportions;
            successful = true;
        }
        
        return (successful);
    }
    
    /** Return the sum of elements in a double array.
     * @param arr double[]: array of doubles
     * @return double: sum of elements
     */
    private static double getSum(double[] arr) {
        double sum = 0.0;
        
        for (double d: arr) {
            sum += d;
        }
        
        return (sum);
    }
    
    /** Set an array of subject names for each slice of the pie chart. returns true if assigning is successful, false otherwise.
     * @param names String[]: array of labels for slices
     * @return boolean: true = successful assignment, false otherwise
     * Precondition: length of array of labels is equal to (elements)
     */
    public boolean setNames(String[] names) {
        boolean successful = false;
        
        if (names.length == elements) {
            this.names = names;
            successful = true;
        }
        
        return (successful);
    }
    
    /** Paint the pie chart graphic into the pane.
     * Precondition: arrays of labels and proportions are not null.
     */
    public void paintChart() {
        double anglePos = 0;
        double labelAngle;
        
        //Paint a base circle with a black outline
        Circle c = new Circle(150, 150, 100);
        c.setFill(Color.WHITE);
        c.setStroke(Color.BLACK);
        getChildren().add(c);
        
        //Paint the slices of the pie chart with their labels
        for (int i = 0; i < elements; i++) {
            //get position of label
            labelAngle = anglePos + ((proportions[i] * 360) / 2);
            double labelXOffset = (names[i].length() * 5) / 2;
            double labelYOffset = 6;
            //Randomize color
            Color col = new Color((float)Math.random(), (float)Math.random(), (float)Math.random(), 1.0);
            //Paint the slice
            Arc slice = new Arc(150, 150, 100, 100, anglePos, proportions[i] * 360);
            anglePos += proportions[i] * 360;
            slice.setType(ArcType.ROUND);
            slice.setFill(col);
            //Place the label
            Text label = new Text(150 + (125 * Math.cos(Math.toRadians(labelAngle))) - labelXOffset,
                150 - (125 * Math.sin(Math.toRadians(labelAngle))) - labelYOffset, names[i] + "\n" + (proportions[i] * 100) + "%");
            //Paint the slices and label
            getChildren().add(slice);
            getChildren().add(label);
        }
    }
}