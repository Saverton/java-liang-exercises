/**
 * Program to calculate the area enclosed by the four cities: Atlanta, Orlando, Savannah, and Charlotte.
 * 
 * @author Scott M.
 * EstimateAreas.java
 */
public class EstimateAreas {
    public static double distance(double latitude1, double longitude1, double latitude2, double longitude2) {
        double distance;
        final double RADIUS = 6371.01;
        latitude1 = Math.toRadians(latitude1);
        longitude1 = Math.toRadians(longitude1);
        latitude2 = Math.toRadians(latitude2);
        longitude2 = Math.toRadians(longitude2);
        distance = RADIUS * Math.acos((Math.sin(latitude1)) * Math.sin(latitude2) + Math.cos(latitude1) * Math.cos(latitude2) * Math.cos(longitude1 - longitude2));
        return distance;
    }
    public static double triangleArea(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double area = Math.pow((s * (s - side1) * (s - side2) * (s - side3)), 0.5);
        return area;
    }
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //declare vars
        double latAtlanta, longAtlanta, latOrlando, longOrlando, latSavannah, longSavannah, latCharlotte, longCharlotte, atlOrl, orlSav, savCha, chaAtl,
            atlSav, triangle1, triangle2, area;
        
        //get locations for the four cities
        latAtlanta = 33.75;
        longAtlanta = -84.39;
        latOrlando = 28.54;
        longOrlando = -81.38;
        latSavannah = 32.08;
        longSavannah = -81.10;
        latCharlotte = 35.23;
        longCharlotte = -80.84;
        
        //calculate distances between the four cities
        atlOrl = distance(latAtlanta, longAtlanta, latOrlando, longOrlando);
        orlSav = distance(latOrlando, longOrlando, latSavannah, longSavannah);
        savCha = distance(latSavannah, longSavannah, latCharlotte, longCharlotte);
        chaAtl = distance(latCharlotte, longCharlotte, latAtlanta, longAtlanta);
        
        //calculate distance between two opposite cities
        atlSav = distance(latAtlanta, longAtlanta, latSavannah, longSavannah);
        
        //calculate the area of two triangles
        triangle1 = triangleArea(atlSav, savCha, chaAtl);
        triangle2 = triangleArea(atlSav, orlSav, atlOrl);
        
        //sum the areas of the triangles
        area = triangle1 + triangle2;
        
        //display result
        System.out.print("The area between Atlanta, Orlando, Savannah, and Charlotte is " + area + " square km.");
    }
}