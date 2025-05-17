package ProjectB;

import java.util.*;
import java.util.stream.Collectors;

public class Module {
    private String code;
    private String name;
    private List<Integer> marks;

    public Module(String code, String name) {
        this.code = code;
        this.name = name;
        this.marks = new ArrayList<>();
    }

    public String getCode() {
        return code;
    }

    public String getName() {
        return name;
    }

    public void addMark(int mark) {
        if (mark < 0 || mark > 100) {
            throw new IllegalArgumentException("Mark must be between 0 and 100.");
        }
        marks.add(mark);
    }

    public double getMeanMark() {
        return marks.stream().mapToInt(Integer::intValue).average().orElse(0);
    }

    public int getMinMark() {
        return marks.stream().mapToInt(Integer::intValue).min().orElse(0);
    }

    public int getMaxMark() {
        return marks.stream().mapToInt(Integer::intValue).max().orElse(0);
    }

    public Map<Grade, Long> getGradeProfile() {
        return marks.stream()
                .map(this::getGrade)
                .collect(Collectors.groupingBy(g -> g, Collectors.counting()));
    }

    public Grade getGrade(int mark) {
        if (mark >= 70) return Grade.A;
        else if (mark >= 60) return Grade.B;
        else if (mark >= 50) return Grade.C;
        else if (mark >= 40) return Grade.D;
        else return Grade.F;
    }
}
