/**
 * The BMI class has fields for the name, age, height (feet and inches), weight of
 * a patient. The class has behavior to get each value, construct with every parameter,
 * or with a default age of 20, and to return the BMI and BMI based status of the
 * patient.
 * 
 * @author Scott M.
 * BMI.java
 */

public class BMI
{
    /**
     * Data fields
     */
    private String name;
    private int hInches, hFeet, age, weight;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;
    
    public BMI(String name, int age, int hFeet, int hInches, int weight)
    {
        this.name = name;
        this.age = age;
        this.hFeet = hFeet;
        this.hInches = hInches;
        this.weight = weight;
    }
    
    public BMI(String name, int hFeet, int hInches, int weight)
    {
        this(name, 20, hFeet, hInches, weight);
    }
    
    public int getFeet()
    {
        return this.hFeet;
    }
    
    public int getInches()
    {
        return this.hInches;
    }
    
    public int getWeight()
    {
        return this.weight;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public int getAge()
    {
        return this.age;
    }
    
    public double getBMI()
    {
        double bmi = weight * KILOGRAMS_PER_POUND / Math.pow((hFeet * 12 + hInches) * METERS_PER_INCH, 2);
        return Math.round(bmi * 100) / 100;
    }
    
    public String getStatus()
    {
        double bmi = getBMI();
        String status;
        if (bmi < 18.5)
        {
            status = "Underweight";
        }
        else if (bmi < 25)
        {
            status = "Normal";
        }
        else if (bmi < 30)
        {
            status = "Overweight";
        }
        else
        {
            status = "Obese";
        }
        return status;
    }
}