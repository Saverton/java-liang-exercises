/**
 * Program to test the course class. Creates a course, adds three students, removes
 * a student, and displays the students.
 * 
 * @author Scott M.
 * CourseTest.java
 */

public class CourseTest
{
    /**
     * Main method to run program.
     */
    public static void main(String[] args)
    {
        System.out.println("BlueJ is not broken.");
        Course soc = new Course("Sociology");
        soc.addStudent("Scott Meadows");
        soc.addStudent("Nico Gonzalez");
        soc.addStudent("Jake Hohner");
        soc.dropStudent("Nico Gonzalez");
        
        System.out.print(soc.getCourseName() + ": ");
        for (int i = 0; i < soc.getNumOfStudents(); i++)
        {
            System.out.print(soc.getStudents()[i] + " ");
        }
    }
}