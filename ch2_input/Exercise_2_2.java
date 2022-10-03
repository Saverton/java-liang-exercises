/**
 * (Compute the volume of a cylinder) Write a program that reads in the radius 
 * and length of a cylinder and computes the area and volume.
 * @author Scott M.
 */

import java.util.Scanner;

public class Exercise_2_2 {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        double radius, length, area, volume;
        System.out.print("Enter the radius and length of a cylinder: ");
        radius = kb.nextDouble();
        length = kb.nextDouble();
        kb.close();
        area = Math.PI * Math.pow(radius, 2);
        volume = area * length;
        System.out.println("The area is " + area);
        System.out.print("The volume is " + volume);
    }
}
