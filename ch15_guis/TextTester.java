/** Program to display 5 text boxes rotated 90 degrees in a horizontal row. Each text
 * box has randomized font, color, and opacity.
 * 
 * @author Scott M.
 * TextTester.java
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

public class TextTester extends Application {
    /** Display 5 text boxes in a row.
     * @params stage to be populated
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