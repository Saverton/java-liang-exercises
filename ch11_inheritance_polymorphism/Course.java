/**
 * Program to define a Course class, modified to use an ArrayList to store
 * students and added proper method comments (yikes!). (Version 2)
 * 
 * @author Scott M.
 * Course.java
 */

import java.util.ArrayList;

public class Course
{
    private String courseName;
    private ArrayList<String> students = new ArrayList<String>();
    
    /**
     * Constructs a course object with the name courseName.
     * 
     * @params (the name of the course)
     */
    public Course(String courseName)
    {
        this.courseName = courseName;
    }
    
    /**
     * Method to get the name of this course.
     * 
     * @return (the name of the course)
     */
    public String getCourseName()
    {
        return this.courseName;
    }
    
    /**
     * Method to return the roster of students in the form of an ArrayList.
     * 
     * @return (ArrayList of students in the class)
     */
    public ArrayList<String> getStudents()
    {
        return (students);
    }
    
    /**
     * Method to get the number of students in the class.
     * 
     * @return (the number of students in the class)
     */
    public int getNumOfStudents()
    {
        return students.size();
    }
    
    /**
     * Method to add a student to the class.
     * 
     * @params (Name of the student to be added)
     */
    public void addStudent(String student)
    {
        students.add(student);
    }
    
    /**
     * Method to drop a student from the class.
     * 
     * @params (Name of the student to be dropped)
     */
    public void dropStudent(String student)
    {
        students.remove(student);
    }
    
    /**
     * Method to clear all students from the class.
     */
    public void clear()
    {
        students.clear();
    }
}