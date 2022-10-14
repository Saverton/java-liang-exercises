/**
 * (Display a 3 * 3 grid) Write a program that displays a 3 * 3 grid, as shown in 
 * Figure 14.47c. Use red color for vertical lines and blue for horizontals. The lines 
 * are automatically resized when the window is resized.
 * @author Scott M.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.shape.Line;
import javafx.scene.paint.Color;


public class Exercise_14_16 extends Application {
    /** Main method to run program */
    public static void main(String[] args) {
        Application.launch(args);
    }

    /**
     * Create a 3x3 grid in a resizable window that adjusts grid positions. Vertical lines are red, horizontal lines are blue.
     * @param stage Stage: stage to set
     */
    public void start(Stage stage) {
        Pane grid = new Pane();
        Line[] vertical = new Line[4];
        Line[] horizontal = new Line[4];

        // create the vertical lines
        int startX = 50, cellWidth = 50, topY = 50, bottomY = 200;
        for (int i = 0; i < vertical.length; i++) {
            vertical[i] = new Line(startX + (i * cellWidth), topY, startX + (i * cellWidth), bottomY);
            vertical[i].setStroke(Color.RED);
            vertical[i].startXProperty().bind(grid.widthProperty().multiply(0.2 * (i + 1)));
            vertical[i].startYProperty().bind(grid.heightProperty().multiply(0.2));
            vertical[i].endXProperty().bind(vertical[i].startXProperty() );
            vertical[i].endYProperty().bind(grid.heightProperty().multiply(0.8));
            grid.getChildren().add(vertical[i]);
        }
        int startY = 50, leftX = 50, rightX = 200;
        for (int i = 0; i < horizontal.length; i++) {
            horizontal[i] = new Line(leftX, startY + (i * cellWidth), rightX, startY + (i * cellWidth));
            horizontal[i].setStroke(Color.BLUE);
            horizontal[i].startXProperty().bind(grid.widthProperty().multiply(0.2));
            horizontal[i].startYProperty().bind(grid.heightProperty().multiply(0.2 * (i + 1)));
            horizontal[i].endXProperty().bind(grid.widthProperty().multiply(0.8));
            horizontal[i].endYProperty().bind(horizontal[i].startYProperty());
            grid.getChildren().add(horizontal[i]);
        }

        Scene scene = new Scene(grid, 250, 250);
        stage.setScene(scene);
        stage.setTitle("Resizable Grid");
        stage.show();
    }
}
