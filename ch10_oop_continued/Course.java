/**
 * Program to define a Course class.
 * 
 * @author Scott M.
 * Course.java
 */

public class Course
{
    private String courseName;
    private String[] students;
    private int numOfStudents;
    
    public Course(String courseName)
    {
        this.courseName = courseName;
        this.students = new String[30];
        this.numOfStudents = 0;
    }
    
    public String getCourseName()
    {
        return this.courseName;
    }
    
    public String[] getStudents()
    {
        String[] temp = new String[this.getNumOfStudents()];
        System.arraycopy(this.students, 0, temp, 0, temp.length);
        return temp;
    }
    
    public int getNumOfStudents()
    {
        return this.numOfStudents;
    }
    
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
    
    public void clear()
    {
        this.students = new String[this.students.length];
        this.numOfStudents = 0;
    }
}