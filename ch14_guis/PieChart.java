/** Class creates pane of a Pie chart.
 * @author Scott M.
 * PieChart.java
 */

import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Text;

public class PieChart extends Pane {
    private int elements;
    private double[] proportions;
    private String[] names;
    
    /** Construct a pie chart with x amount of elements.
     * @param number of elements: int
     */
    public PieChart(int elements) {
        this.elements = elements;
    }
    
    /** Set an array of double quantities to proportions. return true if assigning
     * is successful, false otherwise.
     * @param list of proportions: double[]
     * @return true if assigning is successful, false otherwise
     * Precondition: List of proportions must be of size (elements) and all quantities
     *      must have a total sum of 1.0.
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
     * @param double array: double[]
     * @return sum: double
     */
    private static double getSum(double[] arr) {
        double sum = 0.0;
        
        for (double d: arr) {
            sum += d;
        }
        
        return (sum);
    }
    
    /** Set an array of subject names for each slice of the pie chart. returns true if assigning is successful, false otherwise.
     * @param array of labels: String[]
     * @return true if assigning is successful, false otherwise
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
    
    /** Paint a pie chart graphic into the pane.
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
