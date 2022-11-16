package Work;

public class MajorCourse extends Course
{
    protected String major;
    protected String requisite;

    //----------------------------------------------------------------
    //  Sets up a major course with the specified information.
    //----------------------------------------------------------------
    public MajorCourse(String cTitle, String cNumber, 
            String cDescription, String cDepartment, 
            String cMajor, String cRequisite)
    {
        super(cTitle, cNumber, cDescription, cDepartment);
        major = cMajor;
        requisite = cRequisite;
    }

    //----------------------------------------------------------------
    //  Returns information about this course as a string.
    //----------------------------------------------------------------
    public String toString()
    {
        String result = super.toString();
        result += "\nCourse Major: " + major + "\n";
        result += "Pre/Co-Requisite(s): " + requisite;
        return result;
    }
}