/** 
 * (Game: display a checkerboard) Write a program that displays a checkerboard 
 * in which each white and black cell is a Rectangle with a fill color black or 
 * white, as shown in Figure 14.44c. 
 * @author Scott M.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class Exercise_14_6 extends Application
{
    /** Main method to run program. */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    /** Display a checkerboard.
     * @params stage Stage: stage to set
     */
    public void start(Stage stage) {
        boolean fillRect = false;
        //Create a pane
        Pane board = new Pane();
        board.setPadding(new Insets(5, 5, 5, 5));
        
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                Rectangle rect = new Rectangle(i * 15, j * 15, 15, 15);
                if (!fillRect) {
                    rect.setFill(Color.WHITE);
                }
                board.getChildren().add(rect);
                fillRect = !fillRect;
            }
            fillRect = !fillRect;
        }
        
        Scene scene = new Scene(board);
        stage.setScene(scene);
        stage.setTitle("Checkerboard");
        stage.show();
    }
}
