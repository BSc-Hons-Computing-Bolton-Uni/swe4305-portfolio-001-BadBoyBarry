package ProjectB;

import java.util.*;

public class Student {
    private String id;
    private String name;
    private Map<Module, Integer> moduleMarks;

    public Student(String id, String name) {
        this.id = id;
        this.name = name;
        this.moduleMarks = new HashMap<>();
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void assignMark(Module module, int mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Mark must be between 0 and 100.");
        }
        moduleMarks.put(module, mark);
        module.addMark(mark);
    }

    public Integer getMark(Module module) {
        return moduleMarks.get(module);
    }

    public Grade getGrade(Module module) {
        Integer mark = moduleMarks.get(module);
        if (mark == null) return null;
        return module.getGrade(mark);
    }

    public Map<Module, Integer> getAllMarks() {
        return moduleMarks;
    }
}
