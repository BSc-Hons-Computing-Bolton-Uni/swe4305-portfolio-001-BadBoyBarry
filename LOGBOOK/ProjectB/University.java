package ProjectB;

import java.util.*;

public class University {
    private List<Student> students;
    private List<Module> modules;

    public University() {
        students = new ArrayList<>();
        modules = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
    }

    public void addModule(Module m) {
        modules.add(m);
    }

    public void removeStudent(String id) {
        students.removeIf(s -> s.getId().equalsIgnoreCase(id));
    }

    public void removeModule(String code) {
        modules.removeIf(m -> m.getCode().equalsIgnoreCase(code));
    }

    public Student findStudent(String id) {
        return students.stream().filter(s -> s.getId().equalsIgnoreCase(id)).findFirst().orElse(null);
    }

    public Module findModule(String code) {
        return modules.stream().filter(m -> m.getCode().equalsIgnoreCase(code)).findFirst().orElse(null);
    }

    public List<Student> getStudents() {
        return students;
    }

    public List<Module> getModules() {
        return modules;
    }
}
