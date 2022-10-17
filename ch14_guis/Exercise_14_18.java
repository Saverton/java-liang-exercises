/**
 * (Plot the square function) Write a program that draws a diagram for the function 
 * f(x) = x^2
 * (see Figure 14.48b). 
 * Hint: Add points to a polyline using the following code:
 *      Polyline polyline = new Polyline();
 *      ObservableList<Double> list = polyline.getPoints();
 *      double scaleFactor = 0.0125;
 *      for (int x = -100; x <= 100; x++) {
 *      list.add(x + 200.0);
 *      list.add(scaleFactor * x * x);
 *      }
 * @author Scott M.
 */

import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.collections.ObservableList;
import javafx.scene.shape.Polyline;
import javafx.scene.paint.Color;

public class Exercise_14_18 extends Application {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

    /**
     * Start the application, graph a quadratic equation.
     * @param stage Stage: stage to set
     */
    public void start(Stage stage) {
        QuadraticEquation qe = new QuadraticEquation(1, 0, 0);
        qe.draw();
        Scene scene = new Scene(qe);
        stage.setScene(scene);
        stage.setTitle("Quadratic graph");
        stage.setHeight(600.0);
        stage.show();
    }
}

class Graph extends Pane {
    private int scale, margin;
    private int[] bounds, originLocation;
    public static final int MIN_X = 0, MAX_X = 1, MIN_Y = 2, MAX_Y = 3, X = 0, Y = 0;

    /**
     * Construct a new graph with a minimum and maximum x and y value to plot, a scale of pixels per unit, 
     * and the margin of pixels around the graph.
     * @param minX int: minimum x plot
     * @param maxX int: maximum x plot
     * @param minY int: minimum y plot
     * @param maxY int: maximum y plot
     * @param scale int: pixels per unit on the graph
     * @param margin int: graph margin
     */
    public Graph(int minX, int maxX, int minY, int maxY, int scale, int margin) {
        bounds = new int[4];
        bounds[MIN_X] = minX;
        bounds[MAX_X] = maxX;
        bounds[MIN_Y] = minY;
        bounds[MAX_Y] = maxY;
        this.scale = scale;
        originLocation = new int[2];
        originLocation[X] = minX * -1 * scale;
        originLocation[Y] = minY * -1 * scale;
        this.margin = margin;
    }

    /**
     * Return the graph bounds.
     * @return int[]: array of graph bounds.
     */
    public int[] getBounds() {
        return this.bounds;
    }

    /**
     * Return the graph scale.
     * @return int: scale (pixels per unit)
     */
    public int getScale() {
        return this.scale;
    }

    /**
     * Return graph origin.
     * @return int[]: graph origin pixel location
     */
    public int[] getOrigin() {
        return this.originLocation;
    }

    /**
     * Return graph margin.
     * @return int: graph margin
     */
    public int getMargin() {
        return this.margin;
    }

    /**
     * Draw the graph onto the pane.
     */
    public void drawGraph() {
        Line xLine = new Line(margin, margin + (bounds[MAX_Y] * scale), margin + (bounds[MIN_X] * scale * -1) + (bounds[MAX_X] * scale), 
            margin + (bounds[MAX_Y] * scale));
        Line yLine = new Line(margin + (bounds[MIN_X] * -1 * scale), margin, margin + (bounds[MIN_X] * -1 * scale), 
            margin + (bounds[MIN_Y] * -1 * scale) + (bounds[MAX_Y] * scale));
        Line xArrowTop = new Line(margin + (bounds[MIN_X] * scale * -1) + (bounds[MAX_X] * scale), margin + (bounds[MAX_Y] * scale), 
            margin + (bounds[MIN_X] * scale * -1) + (bounds[MAX_X] * scale) - 10, margin + (bounds[MAX_Y] * scale) - 10);
        Line xArrowBottom = new Line(margin + (bounds[MIN_X] * scale * -1) + (bounds[MAX_X] * scale), margin + (bounds[MAX_Y] * scale), 
            margin + (bounds[MIN_X] * scale * -1) + (bounds[MAX_X] * scale) - 10, margin + (bounds[MAX_Y] * scale) + 10);
        Line yArrowLeft = new Line(margin + (bounds[MIN_X] * -1 * scale), margin + (bounds[MIN_Y] * -1 * scale) + (bounds[MAX_Y] * scale), 
            margin + (bounds[MIN_X] * -1 * scale) - 10, margin + (bounds[MIN_Y] * -1 * scale) + (bounds[MAX_Y] * scale) - 10);
        Line yArrowRight = new Line(margin + (bounds[MIN_X] * -1 * scale), margin + (bounds[MIN_Y] * -1 * scale) + (bounds[MAX_Y] * scale), 
            margin + (bounds[MIN_X] * -1 * scale) + 10, margin + (bounds[MIN_Y] * -1 * scale) + (bounds[MAX_Y] * scale) - 10);
        Text xLabel = new Text(margin + (bounds[MIN_X] * scale * -1) + (bounds[MAX_X] * scale) + 2, margin + (bounds[MAX_Y] * scale) + 3, "x");
        Text yLabel = new Text(margin + (bounds[MIN_X] * -1 * scale) - 3, margin + (bounds[MIN_Y] * -1 * scale) + (bounds[MAX_Y] * scale) + 8, "y");
        this.getChildren().add(xLine);
        this.getChildren().add(yLine);
        this.getChildren().add(xArrowTop);
        this.getChildren().add(xArrowBottom);
        this.getChildren().add(yArrowLeft);
        this.getChildren().add(yArrowRight);
        this.getChildren().add(xLabel);
        this.getChildren().add(yLabel);
    }
}

class QuadraticEquation extends Pane {
    Graph graph;
    double a, b, c;
    final static int MIN_WIDTH = 10, MIN_HEIGHT = 10;

    /**
     * Construct a new Quadratic equation with a given a, b, and c in the form:
     *      y = ax^2 + bx + c
     * @param a double: variable "a"
     * @param b double: variable "b"
     * @param c double: variable "c"
     */
    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
        double discriminant = this.getDiscriminant();
        int graphMinX, graphMaxX, graphMinY, graphMaxY;
        if (discriminant == 0) {
            graphMinX = (int)Math.round(this.getRoot1()) - (MIN_WIDTH / 2);
            graphMaxX = (int)Math.round(this.getRoot1()) + (MIN_WIDTH / 2);
            graphMinY = -1 * (MIN_HEIGHT / 2);
            graphMaxY = (MIN_HEIGHT / 2);
        }
        else if (discriminant > 0) {
            graphMinX = (int)Math.round(this.getRoot1()) - (MIN_WIDTH / 2);
            graphMaxX = (int)Math.round(this.getRoot2()) + (MIN_WIDTH / 2);
            graphMinY = -1 * (MIN_HEIGHT / 2);
            graphMaxY = (MIN_HEIGHT / 2);
        }
        else {
            double vertex = (-1 * b) / (2 * a);
            graphMinX = (int)Math.round(vertex) - (MIN_WIDTH / 2);
            graphMaxX = (int)Math.round(vertex) + (MIN_WIDTH / 2);
            graphMinY = (int)Math.round(getYValue(vertex)) - (MIN_HEIGHT / 2);
            graphMaxY = (int)Math.round(getYValue(vertex)) + (MIN_HEIGHT / 2);
        }
        this.graph = new Graph(graphMinX, graphMaxX, graphMinX, graphMaxY, (int)(500 / Math.max(graphMaxX - graphMinX, graphMaxY - graphMinY)), 20);
    }

    /**
     * Get the graph pane of the quadratic equation.
     * @return Graph: qe graph
     */
    public Graph getGraph() {
        return this.graph;
    }

    /**
     * Return the discriminant of the quadratic equation.
     * @return double: equation discriminant
     */
    public double getDiscriminant()
    {
        return Math.pow(this.b, 2) - 4 * this.a * this.c;
    }
    
    /**
     * Return the first root of the quadratic eqation.
     * @return double: first root of the quadratic equation
     */
    public double getRoot1()
    {
        double root1;
        if (this.getDiscriminant() >= 0)
        {
            root1 = (-1 * this.b + Math.sqrt(this.getDiscriminant())) / (2 * a);
        }
        else
        {
            root1 = 0;
        }
        return root1;
    }
    
    /**
     * Return the second root of the quadratic eqation.
     * @return double: second root of the quadratic equation
     */
    public double getRoot2()
    {
        double root2;
        if (this.getDiscriminant() >= 0)
        {
            root2 = (-1 * this.b - Math.sqrt(this.getDiscriminant())) / (2 * a);
        }
        else
        {
            root2 = 0;
        }
        return root2;
    }

    /**
     * Return the y value of the quadratic equation at a given x.
     * @param x double: x value
     * @return double: y value at this x position
     */
    public double getYValue(double x) {
        return (Math.pow(x, 2) * this.a + this.b * x + this.c);
    }

    /**
     * Draw the graph along with it's quadratic equation.
     */
    public void draw() {
        Polyline curve = new Polyline();
        ObservableList<Double> curveList = curve.getPoints();
        for (int x = (this.graph.getBounds()[Graph.MIN_X] * this.graph.getScale()); x < (this.graph.getBounds()[Graph.MAX_X] * this.graph.getScale()); x++) {
            curveList.add((double)x + this.graph.getOrigin()[Graph.X] + this.graph.getMargin());
            curveList.add(-1 * (getYValue((double)x / this.graph.getScale()) * this.graph.getScale()) + this.graph.getOrigin()[Graph.Y] + this.graph.getMargin());
        }
        curve.setStroke(Color.RED);
        this.graph.drawGraph();
        this.getChildren().add(this.graph);
        this.getChildren().add(curve);
    }
}