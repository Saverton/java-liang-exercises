/**
 * Display a Rectanguloid that resizes with the window.
 * @author Scott M.
 * Rectanguloid.java
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import javafx.scene.paint.Color;


public class Rectanguloid extends Application
{
    /** Main method to run program. */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    /** Create and display a window with a resizable Rectanguloid.
     * @param primary stage: Stage
     */
    @Override
    public void start(Stage stage) {
        Pane pane = new Pane();
        
        //Create a rectanguloid
        Rectangle back = new Rectangle();
        back.xProperty().bind(pane.widthProperty().divide(10));
        back.setY(0);
        back.widthProperty().bind(pane.widthProperty().divide(10).multiply(9));
        back.heightProperty().bind(pane.heightProperty().divide(10).multiply(9));
        back.setFill(Color.WHITE);
        back.setStroke(Color.BLACK);
        pane.getChildren().add(back);
        
        Rectangle front = new Rectangle();
        front.setX(0);
        front.yProperty().bind(pane.heightProperty().divide(10));
        front.widthProperty().bind(pane.widthProperty().divide(10).multiply(9));
        front.heightProperty().bind(pane.heightProperty().divide(10).multiply(9));
        front.setFill(new Color(1, 1, 1, 0));
        front.setStroke(Color.BLACK);
        pane.getChildren().add(front);
        
        Line l1 = new Line();
        l1.setStartX(0);
        l1.startYProperty().bind(pane.heightProperty().divide(10));
        l1.endXProperty().bind(pane.widthProperty().divide(10));
        l1.setEndY(0);
        pane.getChildren().add(l1);
        
        Line l2 = new Line();
        l2.setStartX(0);
        l2.startYProperty().bind(pane.heightProperty());
        l2.endXProperty().bind(pane.widthProperty().divide(10));
        l2.endYProperty().bind(pane.heightProperty().divide(10).multiply(9));
        pane.getChildren().add(l2);
        
        Line l3 = new Line();
        l3.startXProperty().bind(pane.widthProperty().divide(10).multiply(9));
        l3.startYProperty().bind(pane.heightProperty());
        l3.endXProperty().bind(pane.widthProperty());
        l3.endYProperty().bind(pane.heightProperty().divide(10).multiply(9));
        pane.getChildren().add(l3);
        
        Line l4 = new Line();
        l4.startXProperty().bind(pane.widthProperty().divide(10).multiply(9));
        l4.startYProperty().bind(pane.heightProperty().divide(10));
        l4.endXProperty().bind(pane.widthProperty());
        l4.setEndY(0);
        pane.getChildren().add(l4);
        
        Scene scene = new Scene(pane, 200, 200);
        stage.setScene(scene);
        stage.setTitle("Rectanguloid");
        stage.show();
    }
}
