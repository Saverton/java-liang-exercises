/**
 * (Display three cards) Write a program that displays three cards randomly 
 * selected from a deck of 52, as shown in Figure 14.43c. The card image files 
 * are named 1.png, 2.png, …, 52.png and stored in the image/card directory. 
 * All three cards are distinct and selected randomly.
 * @author Scott M.
 */

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import java.io.File;
import java.util.ArrayList;

public class Exercise_14_3 extends Application {
    /** Main method to run program. */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    /** Shuffle and display three cards.
     * @param stage Stage: stage to set
     */
    public void start(Stage stage) {
        ArrayList<Image> cards = getCards();
        java.util.Collections.shuffle(cards);
        HBox hPane = new HBox();
        hPane.setPadding(new Insets(5, 10, 5, 10));
        hPane.setSpacing(5);
        hPane.setAlignment(Pos.CENTER);
        
        for (int i = 0; i < 3; i++) {
            hPane.getChildren().add(new ImageView(cards.get(i)));
        }
        
        Scene scene = new Scene(hPane);
        stage.setTitle("Three Cards");
        stage.setScene(scene);
        stage.show();
    }
    
    /** Return an arrayList of playing cards.
     * @return ArrayList: deck of cards
     */
    public static ArrayList<Image> getCards() {
        File directory = new File("cards");
        ArrayList<Image> cards = new ArrayList<Image>();
        File[] images = directory.listFiles();
        
        for (int i = 0; i < images.length; i += 2) {
            cards.add(new Image(images[i].getPath()));
        }
        
        return (cards);
    }
}