/**
 * (The Fan class) Design a class named Fan to represent a fan. The class contains: 
 *  ■ Three constants named SLOW, MEDIUM, and FAST with the values 1, 2, and 3 to 
 *    denote the fan speed.
 *  ■ A private int data field named speed that specifies the speed of the fan (the 
 *    default is SLOW).
 *  ■ A private boolean data field named on that specifies whether the fan is on (the 
 *    default is false).
 *  ■ A private double data field named radius that specifies the radius of the fan 
 *    (the default is 5).
 *  ■ A string data field named color that specifies the color of the fan (the default 
 *    is blue).
 *  ■ The accessor and mutator methods for all four data fields.
 *  ■ A no-arg constructor that creates a default fan.
 *  ■ A method named toString() that returns a string description for the fan. If 
 *    the fan is on, the method returns the fan speed, color, and radius in one combined 
 *    string. If the fan is not on, the method returns the fan color and radius 
 *    along with the string “fan is off” in one combined string.
 * Draw the UML diagram for the class and then implement the class. Write a test 
 * program that creates two Fan objects. Assign maximum speed, radius 10, color 
 * yellow, and turn it on to the first object. Assign medium speed, radius 5, color 
 * blue, and turn it off to the second object. Display the objects by invoking their 
 * toString method.
 * @author Scott M.
 */

public class Exercise_9_8 {
    /**
     * Main method to test class.
     */
    public static void main(String[] args)
    {
        Fan f1 = new Fan();
        Fan f2 = new Fan();
        
        f1.setSpeed(Fan.FAST);
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.turnOn();
        
        f2.setSpeed(Fan.MEDIUM);
        
        System.out.print(f1.toString() + "\n\n");
        System.out.print(f2.toString());
    }
}

class Fan
{
    final static int SLOW = 1, MEDIUM = 2, FAST = 3;
    private int speed = SLOW;
    private boolean on = false;
    private int radius = 5;
    private String color = "blue";
    
    /**
     * Construct a default Fan object.
     */
    public Fan()
    {
    }
    
    /**
     * Return the speed of the fan
     * @return int: fan speed
     */
    public int getSpeed()
    {
        return speed;
    }
    
    /**
     * Set the speed of the fan
     * @param newSpeed int: new fan speed
     */
    public void setSpeed(int newSpeed)
    {
        if (newSpeed > 0 && newSpeed <= 3)
        {
            speed = newSpeed;
        }
    }
    
    /**
     * Check if the fan is on
     * @return boolean: true = fan is on, false = fan is off
     */
    public boolean isOn()
    {
        return on;
    }
    
    /**
     * Set the fan to ON
     */
    public void turnOn()
    {
        on = true;
    }
    
    /**
     * Set the fan to OFF
     */
    public void turnOff()
    {
        on = false;
    }
    
    /**
     * Return the radius of the fan.
     * @return int: fan's radius
     */
    public int getRadius()
    {
        return radius;
    }
    
    /**
     * Set the radius of the fan.
     * @param newRadius int: new radius of the fan
     */
    public void setRadius(int newRadius)
    {
        if (newRadius > 0)
        {
            radius = newRadius;
        }
    }
    
    /**
     * Return the color of the fan.
     * @return String: fan color
     */
    public String getColor()
    {
        return color;
    }
    
    /**
     * Set the color of the fan
     * @param newColor String: new color of fan
     */
    public void setColor(String newColor)
    {
        color = newColor;
    }
    
    /**
     * Return a String with info about the Fan object.
     * @return String: String with Fan info
     */
    public String toString()
    {
        String output = "";
        output += "Status: ";
        output += (on) ? "on" : "off";
        output += "\nRadius: " + getRadius();
        output += "\nSpeed: " + getSpeed();
        output += "\nColor: " + getColor();
        return output;
    }
}