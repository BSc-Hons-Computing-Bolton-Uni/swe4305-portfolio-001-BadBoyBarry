package WEEK3;

public class Course
{
    private String courseCode;
    private String courseName;
    Course(String courseCode, String Name)
    {
        this.courseCode = courseCode;
        this.courseName = Name;
    }

    public String getID()
    {
        return this.courseCode;
    }
    public String getName()
    {
        return this.courseName;
    }

    public void setCode(String courseCode)
    {
        this.courseCode = courseCode;
    }
    public void setName(String Name)
    {
        this.courseName = Name;
    }

    public void printVal()
    {
        System.out.println(this.courseCode);
        System.out.println(this.courseName);
    }
}
