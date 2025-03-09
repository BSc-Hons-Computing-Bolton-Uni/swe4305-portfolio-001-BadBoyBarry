package Week3and4;

public class Main {
    public static void main(String[] args)
    {
        Course course = new Course("wb232d","Bob");
        Student student = new Student(10011,"Bobby", "smith");
        student.enrol(course);
        student.print_values();
    }
}
