package Work;

public class GeneralEducation extends Course
{
    protected String requirement;

    //----------------------------------------------------------------
    //  Sets up a general education course with the specified
    //  information.
    //----------------------------------------------------------------
    public GeneralEducation(String cTitle, String cNumber, 
            String cDescription, String cDepartment,
            String requirementFilled)
    {
        super(cTitle, cNumber, cDescription, cDepartment);
        requirement = requirementFilled;
    }

    //----------------------------------------------------------------
    //  Returns information about this course as a string.
    //----------------------------------------------------------------
    public String toString()
    {
        String result = super.toString();
        result += "\nGeneral Education Requirement Filled: " + 
                requirement;
        return result;
    }
}