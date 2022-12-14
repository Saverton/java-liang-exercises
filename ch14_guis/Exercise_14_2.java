/** 
 * (Tic-tac-toe board) Write a program that displays a tic-tac-toe board, as shown 
 * in Figure 14.43b. A cell may be X, O, or empty. What to display at each cell is 
 * randomly decided. The X and O are images in the files x.gif and o.gif.
 * @author Scott M.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.GridPane;

public class Exercise_14_2 extends Application {
    /** Main method to run program. */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    /** Create a window with randomized tic tac toe board.
     * @param stage Stage: stage to set
     */
    public void start(Stage stage) {
        GridPane pane = new GridPane();
        Image x = new Image("tic-tac-toe/x.gif");
        Image o = new Image("tic-tac-toe/o.gif");
        Image empty = new Image("tic-tac-toe/empty.gif");
        
        //set grid pane alignment
        pane.setAlignment(Pos.CENTER);
        pane.setPadding(new Insets(11.5, 11.5, 11.5, 11.5));
        
        //randomize selection for each square
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                int square = (int)(Math.random() * 3);
                int rotation = ((int)(Math.random() * 4) * 90) + ((int)(Math.random() * 10) - 5);
                ImageView image;
                switch (square) {
                    case 0: image = new ImageView(x);
                        image.setRotate(rotation);
                        break;
                    case 1: image = new ImageView(o);
                        image.setRotate(rotation);
                        break;
                    default: image = new ImageView(empty);
                }
                pane.add(image, j, i);
            }
        }
        
        //create a scene and window to display
        Scene scene = new Scene(pane);
        stage.setTitle("Tic Tac Toe");
        stage.setScene(scene);
        stage.show();
    }
}