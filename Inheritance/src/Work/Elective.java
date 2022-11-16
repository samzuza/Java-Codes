package Work;

public class Elective extends Course
{
    //----------------------------------------------------------------
    //  Sets up an elective course with the specified information.
    //----------------------------------------------------------------
    public Elective(String cTitle, String cNumber, 
            String cDescription, String cDepartment)
    {
        super(cTitle, cNumber, cDescription, cDepartment);
    }

    //-----------------------------------------------------------------
    //  Returns a string including the basic course information.
    //-----------------------------------------------------------------
    public String toString()
    {
        return "Elective course:\n" + super.toString();
    }
}