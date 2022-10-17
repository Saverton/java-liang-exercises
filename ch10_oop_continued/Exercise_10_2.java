/**
 * (The BMI class) Add the following new constructor in the BMI class:
 * /** Construct a BMI with the specified name, age, weight, 
 * feet, and inches /
 *      public BMI(String name, int age, double weight, double feet, double inches) 
 * @author Scott M.
 */

public class Exercise_10_2 {
    /**
     * Main method to run program.
     */
    public static void main(String[] args) {
        System.out.print("Empty class");
    }
}

class BMI
{
    private String name;
    private int hInches, hFeet, age, weight;
    public static final double KILOGRAMS_PER_POUND = 0.45359237;
    public static final double METERS_PER_INCH = 0.0254;
    
    /**
     * Construct a new BMI object with a specified name, age, weight, feet and inches of height.
     * @param name String: name of the person to which this BMI belongs to
     * @param age int: age of the person
     * @param hFeet int: feet of height of the person
     * @param hInches int: inches of height of the person
     * @param weight: weight of the person in pounds
     */
    public BMI(String name, int age, int hFeet, int hInches, int weight)
    {
        this.name = name;
        this.age = age;
        this.hFeet = hFeet;
        this.hInches = hInches;
        this.weight = weight;
    }
    
    /**
     * Construct a new BMI object with a specified name, weight, feet and inches of height.
     * @param name String: name of the person to which this BMI belongs to
     * @param hFeet int: feet of height of the person
     * @param hInches int: inches of height of the person
     * @param weight: weight of the person in pounds
     */
    public BMI(String name, int hFeet, int hInches, int weight)
    {
        this(name, 20, hFeet, hInches, weight);
    }
    
    /**
     * Return the feet denomination of the height measurement.
     * @return int: height denomination of feet
     */
    public int getFeet()
    {
        return this.hFeet;
    }
    
    /**
     * Return the inches denomination of the height measurement.
     * @return int: height denomination of inches
     */
    public int getInches()
    {
        return this.hInches;
    }

    /**
     * Return the weight in pounds of the person
     * @return int: weight of person in pounds
     */
    public int getWeight()
    {
        return this.weight;
    }
    
    /**
     * Return the name of the person
     * @return String: person's name
     */
    public String getName()
    {
        return this.name;
    }
    
    /**
     * Return the age of the person
     * @return int: person's age
     */
    public int getAge()
    {
        return this.age;
    }
    
    /**
     * Return the calculated BMI of the person
     * @return double: BMI of person
     */
    public double getBMI()
    {
        double bmi = weight * KILOGRAMS_PER_POUND / Math.pow((hFeet * 12 + hInches) * METERS_PER_INCH, 2);
        return Math.round(bmi * 100) / 100;
    }
    
    /**
     * Return the status of the person's BMI (as Underweight, Normal, Overweight, or Obese)
     * @return String: status of person's BMI
     */
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