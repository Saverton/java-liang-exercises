/** 
 * (Color and font) Write a program that displays five texts vertically, as shown in 
 * Figure 14.44a. Set a random color and opacity for each text and set the font of 
 * each text to Times Roman, bold, italic, and 22 pixels. 
 * @author Scott M.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

public class Exercise_14_4 extends Application {
    /** Display 5 text boxes in a row.
     * @param stage Stage: stage to set
     */
    public void start(Stage stage) {
        HBox pane = new HBox();
        pane.setPadding(new Insets(10, 5, 10, 5));
        pane.setSpacing(5);
        pane.setAlignment(Pos.CENTER);
        
        Text[] textList = new Text[5];
        for (int i = 0; i < textList.length; i++) {
            textList[i] = new Text("Java");
            textList[i].setRotate(90);
            textList[i].setFill(new Color(Math.random(), Math.random(), Math.random(), Math.random()));
            textList[i].setFont(Font.font("Times New Roman", FontWeight.BOLD, FontPosture.ITALIC, 22));
            pane.getChildren().add(textList[i]);
        }
        
        Scene scene = new Scene(pane);
        stage.setTitle("Text Tester");
        stage.setScene(scene);
        stage.show();
    }
    
    /** Main method to run program. */
    public static void main(String[] args) {
        Application.launch(args);
    }
}