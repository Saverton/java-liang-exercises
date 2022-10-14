/**
 * (Display a STOP sign) Write a program that displays a STOP sign, as shown 
 * in Figure 14.47b. The octagon is in red and the sign is in white.
 * @author Scott M.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.layout.StackPane;
import javafx.geometry.Insets;
import javafx.scene.shape.Polygon;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

public class Exercise_14_15 extends Application{
    /** Create a window containing a STOP sign graphic.
     * @param stage Stage: stage to set
     */
    public void start(Stage stage) {
        StackPane stopSign = new StackPane();
        stopSign.setPadding(new Insets(10, 20, 10, 20));

        // create octagon
        Polygon signBase = createOctagon(100);
        signBase.setFill(Color.RED);
        stopSign.getChildren().add(signBase);

        // create STOP text
        Text signText = new Text("STOP");
        signText.setFill(Color.WHITE);
        signText.setFont(new Font("Times New Roman", 32));
        stopSign.getChildren().add(signText);

        // create and populate scene
        Scene scene = new Scene(stopSign, 200, 200);
        stage.setScene(scene);
        stage.setTitle("STOP Sign!");
        stage.show();
    }

    /**
     * Return a Javafx polygon with the points to make an octogon.
     * @param radius int: radius of octagon
     * @return Polygon: octagon
     */
    public static Polygon createOctagon(int radius) {
        Polygon oct = new Polygon();
        ObservableList<Double> pointList = oct.getPoints();
        double angle = Math.toRadians(360.0 / 16);
        for (int i = 0; i < 8; i++) {
            pointList.add(radius * Math.cos(angle));
            pointList.add(radius * Math.sin(angle));
            angle += Math.toRadians(360.0 / 8);
        }
        return oct;
    }

    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Application.launch(args);
    }
}