/**
 * (Game: hangman) Write a program that displays a drawing for the popular hangman game, as shown in Figure 14.48a.
 * @author Scott M.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Line;
import javafx.scene.shape.Circle;
import javafx.scene.layout.Pane;
import javafx.geometry.Insets;
import javafx.scene.paint.Color;

public class Exercise_14_17 extends Application {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        Application.launch(args);
    }

    /**
     * Create a window with a drawing of a hangman game.
     * @param stage Stage: stage to set
     */
    public void start(Stage stage) {
        Scene scene;
        Pane hangman = drawHangman();
        hangman.setPadding(new Insets(10.0));

        // add onto scene and set Stage
        scene = new Scene(hangman);
        stage.setScene(scene);
        stage.setTitle("Hangman");
        stage.show();
    }

    /**
     * Return a Pane containing a hangman drawing.
     * @return Pane: hangman drawing
     */
    public static Pane drawHangman() {
        Pane hangman = new Pane();
        Arc baseOfStand;
        Line poleOfStand, horizontalSupport, hanger, torso, leftArm, rightArm, leftLeg, rightLeg;
        Circle head;

        // create stand/hanger
        baseOfStand = new Arc(50.0, 220.0, 30.0, 20.0, 0.0, 180.0);
        baseOfStand.setType(ArcType.OPEN);
        baseOfStand.setFill(Color.WHITE);
        baseOfStand.setStroke(Color.BLACK);
        poleOfStand = new Line(50.0, 200.0, 50.0, 20.0);
        horizontalSupport = new Line(50.0, 20.0, 170.0, 20.0);
        hanger = new Line(170.0, 20.0, 170.0, 40.0);
        hangman.getChildren().add(baseOfStand);
        hangman.getChildren().add(poleOfStand);
        hangman.getChildren().add(horizontalSupport);
        hangman.getChildren().add(hanger);

        // create hanging man
        head = new Circle(170.0, 55.0, 15.0);
        head.setFill(Color.WHITE);
        head.setStroke(Color.BLACK);
        torso = new Line(170.0, 70.0, 170.0, 130.0);
        leftArm = new Line(170.0, 70.0, 130.0, 110.0);
        rightArm = new Line(170.0, 70.0, 210.0, 110.0);
        leftLeg = new Line(170.0, 130.0, 145.0, 190.0);
        rightLeg = new Line(170.0, 130.0, 195.0, 190.0);
        hangman.getChildren().add(head);
        hangman.getChildren().add(torso);
        hangman.getChildren().add(leftArm);
        hangman.getChildren().add(rightArm);
        hangman.getChildren().add(leftLeg);
        hangman.getChildren().add(rightLeg);

        return hangman;
    }
}
