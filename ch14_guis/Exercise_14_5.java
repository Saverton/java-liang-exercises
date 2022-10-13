/** 
 * (Characters around circle) Write a program that displays a string Welcome to 
 * Java around the circle, as shown in Figure 14.44b. Hint: You need to display each 
 * character in the right location with appropriate rotation using a loop.
 * @author Scott M.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class Exercise_14_5 extends Application
{
    /** Main method to run program. */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    /** Display a window with "Welcome To Java" displayed in a circle.
     * @params stage Stage: stage to set
     */
    public void start(Stage stage) {
        Pane pane;
        String message = "Welcome to Java ";
        
        //Format and populate the pane
        pane = circleMessage(message, 150);
        pane.setPadding(new Insets(10, 20, 10, 20));
        
        //Create a scene and place it in the primary Stage
        Scene scene = new Scene(pane);
        stage.setTitle("Circle Message");
        stage.setScene(scene);
        stage.show();
    }
    
    /** Place the letters into a circle on a pane.
     * @param message String: message to display in circle
     * @param radius int: radius of circle in pixels
     * @return Pane: pane containing circle message
     */
    public Pane circleMessage(String message, int radius) {
        Pane pane = new Pane();
        double angleChange = (Math.PI * 2 / message.length());
        int fontSize = (int)(((2 * Math.PI) * radius) / message.length()) - 2;
        for (int i = 0; i < message.length(); i++) {
            Text character = new Text((1.2 * radius) + Math.cos(angleChange * i) * radius, (1.2 * radius) + Math.sin(angleChange * i) * radius, "" + message.charAt(i));
            character.setRotate(Math.toDegrees(angleChange * i) + 90);
            character.setFont(Font.font("Times New Roman", FontWeight.BOLD, fontSize));
            pane.getChildren().add(character);
        }
        return pane;
    }
}
