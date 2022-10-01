/** Driver class to test the Colorable interface by creating an array of Geometric
 * Objects and displaying their colorable messages if they are colorable.
 * 
 * @author Scott M.
 * TestColorable.java
 */

public class TestColorable {
    /** Main method to run program */
    public static void main(String[] args) {
        GeometricObject[] objects = new GeometricObject[5];
        objects[0] = new Triangle(3, 4, 5);
        objects[1] = new Circle(4.0);
        objects[2] = new Square(5.0);
        objects[3] = new Circle();
        objects[4] = new Square(3.5);
        
        for (GeometricObject geo: objects) {
            System.out.println("Area is " + geo.getArea());
            if (geo instanceof Colorable) {
                ((Colorable)geo).howToColor();
                System.out.println();
            }
        }
    }
}