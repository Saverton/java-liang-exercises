/** Program to display a window with a 10x10 matrix of 0s and 1s.
 * @author Scott M.
 * Matrix.java
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class Matrix extends Application
{
    /** Main method to run program. */
    public static void main(String[] args) {
        
    }
    
    /** Display a matrix of 0s and 1s.
     * @params primary stage: Stage
     */
    public void start(Stage stage) {
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                TextField num = new TextField();
                num.setText("" + (int)(Math.random() * 2));
                num.setPrefColumnCount(1);
                grid.add(num, j, i);
            }
        }
        
        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("Matrix");
        stage.show();
    }
}