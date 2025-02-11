package WEEK3;
public class Student
{
    private int ID;
    private String Name;
    Student(int ID, String Name)
    {
        this.ID = ID;
        this.Name = Name;
    }

    public int getID()
    {
        return this.ID;
    }
    public String getName()
    {
        return this.Name;
    }

    public void setID(int ID)
    {
        this.ID = 0;
    }
    public void setName(String Name)
    {
        this.Name = Name;
    }

    public void printVal()
    {
        System.out.println(this.ID);
        System.out.println(this.Name);
    }

}
