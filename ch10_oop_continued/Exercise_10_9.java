/**
 * (The Course class) Revise the Course class as follows:
 *  ■ The array size is fixed in Listing 10.6. Improve it to automatically increase 
 *    the array size by creating a new larger array and copying the contents of the 
 *    current array to it.
 *  ■ Implement the dropStudent method.
 *  ■ Add a new method named clear() that removes all students from the 
 *    course.
 * Write a test program that creates a course, adds three students, removes one, 
 * and displays the students in the course.
 * @author Scott M.
 */

public class Exercise_10_9 {
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

class Course
{
    private String courseName;
    private String[] students;
    private int numOfStudents;
    
    /**
     * Construct a new course with a course name.
     * @param courseName String: name of the course
     */
    public Course(String courseName)
    {
        this.courseName = courseName;
        this.students = new String[30];
        this.numOfStudents = 0;
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
     * Return the array of students taking the course.
     * @return String[]: array of student names
     */
    public String[] getStudents()
    {
        String[] temp = new String[this.getNumOfStudents()];
        System.arraycopy(this.students, 0, temp, 0, temp.length);
        return temp;
    }

    /**
     * Return the number of students taking the course
     * @return int: number of students
     */
    public int getNumOfStudents()
    {
        return this.numOfStudents;
    }
    
    /**
     * Add a new student to the course.
     * @param student String: student name
     */
    public void addStudent(String student)
    {
        if (this.getNumOfStudents() + 1 == this.students.length)
        {
            String[] temp = new String[this.students.length * 2];
            System.arraycopy(this.students, 0, temp, 0, this.students.length);
            this.students = temp;
        }
        this.students[this.getNumOfStudents()] = student;
        this.numOfStudents++;
    }
    
    /**
     * Drop a student from the course, no student is removed if the student name isn't found.
     * @param student String: name of the student to remove
     */
    public void dropStudent(String student)
    {
        for (int i = 0; i < this.getNumOfStudents(); i++)
        {
            if (this.students[i].equals(student))
            {
                for (int j = i; j < this.getNumOfStudents(); j++)
                {
                    this.students[j] = this.students[j + 1];
                }
                this.numOfStudents--;
                return;
            }
        }
    }
    
    /**
     * Drop all students from the course.
     */
    public void clear()
    {
        this.students = new String[this.students.length];
        this.numOfStudents = 0;
    }
}