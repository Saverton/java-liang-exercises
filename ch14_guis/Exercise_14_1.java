/** 
 * (Display images) Write a program that displays four images in a grid pane, as 
 * shown in Figure 14.43a. 
 * @author Scott M.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class Exercise_14_1 extends Application
{
    /** Create a window with 4 images in a 2x2 layout.
     *
     * @param  stage the primary stage for this application.
     */
    @Override
    public void start(Stage stage)
    {
        Image[][] images = new Image[2][2];
        images[0][0] = new Image("flags/uk.jpg");
        images[0][1] = new Image("flags/canada.jpg");
        images[1][0] = new Image("flags/australia.jpg");
        images[1][1] = new Image("flags/usa.jpg");
        
        //Create and populate a grid pane
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);
        grid.setPadding(new Insets(11.5, 12.5, 13.5, 14.5));
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                ImageView temp = new ImageView(images[i][j]);
                temp.setFitWidth(100);
                temp.setFitHeight(100);
                grid.add(temp, j, i);
            }
        }
        
        //Create a scene and place the grid in the scene
        Scene scene = new Scene(grid);
        stage.setTitle("Image Grid");
        stage.setScene(scene);
        stage.show();
    }
    
    /** Main method to run program. */
    public static void main(String[] args) {
        Application.launch(args);
    }
}
