/** Program to display a window containing all 52 playing cards in a standard deck
 * of cards.
 * @author Scott M.
 * DisplayCards.java
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class DisplayCards extends Application {
    /** Main method to run program. */
    public static void main(String[] args) {
        Application.launch(args);
    }
    
    /** Display 52 playing cards in a 13x4 array.
     * @param primary stage: Stage
     */
    public void start(Stage stage) {
        ArrayList<Image> cards = new ArrayList<Image>();
        cards = getCards();
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setHgap(5);
        grid.setVgap(5);
        
        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 13; c++) {
                grid.add(new ImageView(cards.get((r * 13) + c)), c, r);
            }
        }
        
        Scene scene = new Scene(grid);
        stage.setScene(scene);
        stage.setTitle("Playing Cards");
        stage.show();
    }
    
    /** Return an arrayList of playing cards.
     * @return Deck of Cards: ArrayList
     */
    public static ArrayList<Image> getCards() {
        File directory = new File("cards");
        ArrayList<Image> cards = new ArrayList<Image>();
        File[] images = directory.listFiles();
        
        for (int i = 0; i < images.length; i++) {
            if (images[i].getName().contains("S") ||
                images[i].getName().contains("JO") ||
                images[i].getName().contains("back"))
                continue;
            cards.add(new Image(images[i].getPath()));
        }
        
        return (cards);
    }
}