/** Program to display a checkerboard.
 * @author Scott M.
 * Checkerboard.java
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.shape.Rectangle;
import javafx.scene.paint.Color;

public class Checkerboard extends Application
{
    /** Main method to run program. */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    /** Display a checkerboard.
     * @params main stage: Stage
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
