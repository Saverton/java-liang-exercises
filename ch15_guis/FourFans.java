/** Program to display four drawings of fans in a 2x2 grid.
 * @author Scott M.
 * FourFans.java
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import javafx.scene.layout.GridPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class FourFans extends Application {
    /** Main method to run program. */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    /** Set up the window to display the fans. 
     * @param primary stage: Stage
     */
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setHgap(10);
        grid.setVgap(10);
        
        for (int r = 0; r < 2; r++) {
            for (int c = 0; c < 2; c++) {
                grid.add(drawFan(), c, r);
            }
        }
        
        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("Four Fans");
        stage.show();
    }
    
    /** Draw a fan in a pane.
     * @return Fan drawing: Pane
     */
    public static Pane drawFan() {
        Pane fan = new Pane();
        Circle c = new Circle(100, 100, 100);
        c.setFill(Color.WHITE);
        c.setStroke(Color.BLACK);
        fan.getChildren().add(c);
        
        for (int i = 30; i < 360; i += 90) {
            Arc blade = new Arc(100, 100, 80, 80, i, 30);
            blade.setFill(Color.GREY);
            blade.setType(ArcType.ROUND);
            fan.getChildren().add(blade);
        }
        
        return (fan);
    }
}