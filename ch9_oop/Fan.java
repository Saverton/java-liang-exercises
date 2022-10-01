/**
 * Program to define a Fan class with datafields for speed, on/off, radius, and color.
 * The class has one specific behavior besides get/set methods that returns a string
 * describing the fan.
 * 
 * @author Scott M.
 * Fan.java
 */

public class Fan
{
    final static int SLOW = 1, MEDIUM = 2, FAST = 3;
    /**
     * Main method to test class.
     */
    public static void main(String[] args)
    {
        Fan f1 = new Fan();
        Fan f2 = new Fan();
        
        f1.setSpeed(FAST);
        f1.setRadius(10);
        f1.setColor("yellow");
        f1.turnOn();
        
        f2.setSpeed(MEDIUM);
        
        System.out.print(f1.toString() + "\n\n");
        System.out.print(f2.toString());
    }
    
    /**
     * Class to define the fan object
     */
    private int speed = SLOW;
    private boolean on = false;
    private int radius = 5;
    private String color = "blue";
    
    public Fan()
    {
    }
    
    public int getSpeed()
    {
        return speed;
    }
    
    public void setSpeed(int newSpeed)
    {
        if (newSpeed > 0 && newSpeed <= 3)
        {
            speed = newSpeed;
        }
    }
    
    public boolean isOn()
    {
        return on;
    }
    
    public void turnOn()
    {
        on = true;
    }
    
    public void turnOff()
    {
        on = false;
    }
    
    public int getRadius()
    {
        return radius;
    }
    
    public void setRadius(int newRadius)
    {
        if (newRadius > 0)
        {
            radius = newRadius;
        }
    }
    
    public String getColor()
    {
        return color;
    }
    
    public void setColor(String newColor)
    {
        color = newColor;
    }
    
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