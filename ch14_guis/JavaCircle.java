/** Program to display a window with the phrase "Welcome to Java" around a circle.
 * 
 * @author Scott M.
 * JavaCircle.java
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class JavaCircle extends Application
{
    /** Main method to run program. */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    /** Display a window with "Welcome To Java" displayed in a circle.
     * @params Stage
     */
    public void start(Stage stage) {
        Pane pane = new Pane();
        String message = "Welcome to Java ";
        
        //Format and populate the pane
        pane.setPadding(new Insets(10, 20, 10, 20));
        circleMessage(pane, message, 150);
        
        //Create a scene and place it in the primary Stage
        Scene scene = new Scene(pane);
        stage.setTitle("Circle Message");
        stage.setScene(scene);
        stage.show();
    }
    
    /** Place the letters into a circle on a pane.
     * @params pane to populate: Pane, message to display: String
     */
    public void circleMessage(Pane pane, String message, int radius) {
        double angleChange = (Math.PI * 2 / message.length());
        int fontSize = (int)(((2 * Math.PI) * radius) / message.length()) - 2;
        for (int i = 0; i < message.length(); i++) {
            Text character = new Text((1.2 * radius) + Math.cos(angleChange * i) * radius, (1.2 * radius) + Math.sin(angleChange * i) * radius, "" + message.charAt(i));
            character.setRotate(Math.toDegrees(angleChange * i) + 90);
            character.setFont(Font.font("Times New Roman", FontWeight.BOLD, fontSize));
            pane.getChildren().add(character);
        }
    }
}
