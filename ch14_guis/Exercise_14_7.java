/** 
 * (Display random 0 or 1) Write a program that displays a 10-by-10 square matrix, 
 * as shown in Figure 14.45a. Each element in the matrix is 0 or 1, randomly generated. 
 * Display each number centered in a text field. Use TextField’s setText
 * method to set value 0 or 1 as a string.
 * @author Scott M.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.geometry.Pos;
import javafx.stage.Stage;

public class Exercise_14_7 extends Application
{
    /** Main method to run program. */
    public static void main(String[] args) {
        
    }
    
    /** Display a matrix of 0s and 1s.
     * @params stage Stage: stage to set
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