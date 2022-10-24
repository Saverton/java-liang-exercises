/**
 * (The Course class) Rewrite the Course class in Listing 10.6. Use an ArrayList
 * to replace an array to store students. Draw the new UML diagram for the class. 
 * You should not change the original contract of the Course class (i.e., the definition 
 * of the constructors and methods should not be changed, but the private 
 * members may be changed.)
 * @author Scott M.
 */

import java.util.ArrayList;

public class Exercise_11_5
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        Course soc = new Course("Sociology");
        soc.addStudent("Scott Meadows");
        soc.addStudent("Nico Gonzalez");
        soc.addStudent("Jake Hohner");
        soc.dropStudent("Nico Gonzalez");
        
        System.out.print(soc.getCourseName() + ": " + soc.getStudents().toString());
    }
}

class Course
{
    private String courseName;
    private ArrayList<String> students = new ArrayList<String>();
    
    /**
     * Construct a course object with a specific name.
     * @param courseName String: course name
     */
    public Course(String courseName)
    {
        this.courseName = courseName;
    }
    
    /**
     * Return the name of the course.
     * @return String: course name
     */
    public String getCourseName()
    {
        return this.courseName;
    }
    
    /**
     * Return an ArrayList of names of students enrolled in the course.
     * @return ArrayList<String>: students in course
     */
    public ArrayList<String> getStudents()
    {
        return (students);
    }
    
    /**
     * Return the number of students in the course.
     * @return int: number of students enrolled
     */
    public int getNumOfStudents()
    {
        return students.size();
    }
    
    /**
     * Add a new student to the course.
     * @param student String: student name
     */
    public void addStudent(String student)
    {
        students.add(student);
    }
    
    /**
     * Drop a specific student from the course.
     * @param student String: student name
     */
    public void dropStudent(String student)
    {
        students.remove(student);
    }
    
    /**
     * Remove all students from the course.
     */
    public void clear()
    {
        students.clear();
    }
}