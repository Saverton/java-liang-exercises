/** 
 * (Paint a smiley face) Write a program that paints a smiley face, as shown in 
 * Figure 14.46a.
 * @author Scott M.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Ellipse;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;
import javafx.scene.paint.Color;

public class Exercise_14_11 extends Application {
    /** Main method to run program. */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    /** Set up the window to display the fans. 
     * @param stage Stage: stage to set
     */
    public void start(Stage stage) {
        Pane face = drawFace();
        face.setPadding(new Insets(20, 20, 20, 20));
        
        Scene scene = new Scene(face);
        stage.setScene(scene);
        stage.setTitle("Smiley Face");
        stage.show();
    }
    
    /** Draw a Smiley Face.
     * @return Pane: smiley face drawing
     */
    public static Pane drawFace() {
        Pane face = new Pane();
        
        //draw face outline
        Circle outline = new Circle(100, 100, 80);
        outline.setFill(Color.YELLOW);
        outline.setStroke(Color.BLACK);
        face.getChildren().add(outline);
        
        //draw mouth
        Arc mouth = new Arc(100, 100, 80, 50, 200, 140);
        mouth.setType(ArcType.OPEN);
        //mouth.setFill(Color.WHITE);
        mouth.setStroke(Color.BLACK);
        face.getChildren().add(mouth);
        
        //draw nose
        Polygon nose = new Polygon(100, 90, 90, 110, 110, 110);
        nose.setFill(Color.ORANGE);
        nose.setStroke(Color.BLACK);
        face.getChildren().add(nose);
        
        //draw eyes
        for (int i = 0; i < 2; i++) {
            Ellipse eye = new Ellipse(75 + 50 * i, 75, 20, 15);
            eye.setFill(Color.WHITE);
            eye.setStroke(Color.BLACK);
            Circle pupil = new Circle(75 + 50 * i, 75, 5);
            face.getChildren().add(eye);
            face.getChildren().add(pupil);
        }
        
        return (face);
    }
}
