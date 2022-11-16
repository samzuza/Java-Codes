package Work;

abstract public class Course
{
    protected String title;
    protected String number;
    protected String description;
    protected String department;

    //----------------------------------------------------------------
    //  Sets up a course with the specified information.
    //----------------------------------------------------------------
    public Course(String cTitle, String cNumber, String cDescription,
            String cDepartment)
    {
        title = cTitle;
        number = cNumber;
        description = cDescription;
        department = cDepartment;
    }

    //-----------------------------------------------------------------
    //  Returns a string including the basic course information.
    //-----------------------------------------------------------------
    public String toString()
    {
        String result = "Course Title: " + title + "\n";
        result += "Course Number: " + number + "\n";
        result += "Course Description: " + description + "\n";
        result += "Department: " + department;
        return result;
    }
}