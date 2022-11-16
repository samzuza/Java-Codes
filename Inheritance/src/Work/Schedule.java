package Work;

public class Schedule
{
    private Course[] courseList;

    //-----------------------------------------------------------------
    //  Sets up the list of courses.
    //-----------------------------------------------------------------
    public Schedule()
    {
        courseList = new Course[5];

        courseList[0] = new MajorCourse("Intro to Computer Science",
                "CSC101", "An introduction to the basics of good  " +
                "program design.",  "Computer Science", "Computer Science", 
                "none");

        courseList[1] = new MajorCourse("Discreet Mathematics",
                "CSC215", "Instruction on the mathematical modeling " +
                "of real-world problems using discrete math concepts.", 
                "Computer Science", "Computer Science", "CSC101");

        courseList[2] = new GeneralEducation("Basic Art", "ART101",
                "Instruction on basic concepts in art. Lecture and studio " +
                "time required.", "Art", "Fine Arts");

        courseList[3] = new GeneralEducation("Spanish for Beginners 1", 
                "SPA101", "Introduction to the Spanish language. Course " +
                "focus on concepts of the language and speaking exercises.",
                "Modern Languages", "Language");

        courseList[4] = new Elective("Golf", "REC210", "Introduction " +
                "to the game of golf, including rules of play and basic " +
                "techniques. Course consists of instructional class time " +
                "as well as weekly rounds of play.", "Physical Education");
    }

    //-----------------------------------------------------------------
    //  Prints out a detailed schedule of all classes.
    //-----------------------------------------------------------------
    public void display()
    {
        for (int count=0; count < courseList.length; count++)
        {
            System.out.println(courseList[count]);
            System.out.println("-----------------------------------");
        }
    }
}