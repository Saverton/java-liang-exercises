/**
 * (Geography: estimate areas) Find the GPS locations for Atlanta, Georgia; 
 * Orlando, Florida; Savannah, Georgia; and Charlotte, North Carolina from 
 * www.gps-data-team.com/map/ and compute the estimated area enclosed by these 
 * four cities.
 * @author Scott M.
 * EstimateAreas.java
 */

public class Exercise_4_3 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        //declare vars
        double latAtlanta, longAtlanta, latOrlando, longOrlando, latSavannah, longSavannah, latCharlotte, longCharlotte, atlOrl, orlSav, savCha, chaAtl,
            atlSav, s1, s2, triangle1, triangle2, area;
        final double RADIUS = 6371.01; // radius of the earth
        
        //get locations for the four cities
        latAtlanta = Math.toRadians(33.75);
        longAtlanta = Math.toRadians(-84.39);
        latOrlando = Math.toRadians(28.54);
        longOrlando = Math.toRadians(-81.38);
        latSavannah = Math.toRadians(32.08);
        longSavannah = Math.toRadians(-81.10);
        latCharlotte = Math.toRadians(35.23);
        longCharlotte = Math.toRadians(-80.84);
        
        //calculate distances between the four cities
        atlOrl = RADIUS * Math.acos((Math.sin(latAtlanta)) * Math.sin(latOrlando) + Math.cos(latAtlanta) * Math.cos(latOrlando) * Math.cos(longAtlanta - longOrlando));
        orlSav = RADIUS * Math.acos((Math.sin(latOrlando)) * Math.sin(latSavannah) + Math.cos(latOrlando) * Math.cos(latSavannah) * Math.cos(longOrlando - longSavannah));
        savCha = RADIUS * Math.acos((Math.sin(latSavannah)) * Math.sin(latCharlotte) + Math.cos(latSavannah) * Math.cos(latCharlotte) * Math.cos(longSavannah - longCharlotte));
        chaAtl = RADIUS * Math.acos((Math.sin(latCharlotte)) * Math.sin(latAtlanta) + Math.cos(latCharlotte) * Math.cos(latAtlanta) * Math.cos(longCharlotte - longAtlanta));
        
        //calculate distance between two opposite cities
        atlSav = RADIUS * Math.acos((Math.sin(latAtlanta)) * Math.sin(latSavannah) + Math.cos(latAtlanta) * Math.cos(latSavannah) * Math.cos(longAtlanta - longSavannah));
        
        //calculate the area of two triangles
        s1 = (atlSav + savCha + chaAtl) / 2;
        triangle1 = Math.pow((s1 * (s1 - atlSav) * (s1 - savCha) * (s1 - chaAtl)), 0.5);
        s2 = (atlSav + orlSav + atlOrl) / 2;
        triangle2 = Math.pow((s2 * (s2 - atlSav) * (s2 - orlSav) * (s2 - atlOrl)), 0.5);
        
        //sum the areas of the triangles
        area = triangle1 + triangle2;
        
        //display result
        System.out.print("The area between Atlanta, Orlando, Savannah, and Charlotte is " + area + " square km.");
    }
}