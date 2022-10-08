/** Program to display a cylinder.
 * @author Scott M.
 * Cylinder.java
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Arc;
import javafx.scene.shape.Line;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Cylinder extends Application {
    /** Main method to run program. */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    /** Set up the window to display the fans. 
     * @param primary stage: Stage
     */
    public void start(Stage stage) {
        Pane cylinder = drawCylinder();
        cylinder.setPadding(new Insets(20, 20, 20, 20));
        
        Scene scene = new Scene(cylinder);
        stage.setScene(scene);
        stage.setTitle("Cylinder");
        stage.show();
    }
    
    /** Draw a cylinder.
     * @return Cylinder drawing: Pane
     */
    public static Pane drawCylinder() {
        Pane cylinder = new Pane();
        
        //draw the top of the cylinder.
        Ellipse top = new Ellipse(50, 50, 50, 25);
        top.setFill(Color.WHITE);
        top.setStroke(Color.BLACK);
        cylinder.getChildren().add(top);
        
        //draw the sides
        Line leftSide = new Line(0, 50, 0, 250);
        cylinder.getChildren().add(leftSide);
        Line rightSize = new Line(100, 50, 100, 250);
        cylinder.getChildren().add(rightSize);
        
        //draw the bottom
        Arc bottomFront = new Arc(50, 250, 50, 25, 180, 180);
        bottomFront.setType(ArcType.OPEN);
        bottomFront.setFill(Color.WHITE);
        bottomFront.setStroke(Color.BLACK);
        cylinder.getChildren().add(bottomFront);
        Arc bottomBack = new Arc(50, 250, 50, 25, 0, 180);
        bottomBack.setType(ArcType.OPEN);
        bottomBack.getStrokeDashArray().addAll(6.0, 21.0);
        bottomBack.setFill(Color.WHITE);
        bottomBack.setStroke(Color.BLACK);
        cylinder.getChildren().add(bottomBack);
        
        return (cylinder);
    }
}
