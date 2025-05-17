package ProjectB;

import java.util.*;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static University university = new University();

    public static void main(String[] args) {
        boolean running = true;
        while (running) {
            printMenu();
            String option = scanner.nextLine().trim();
            switch (option) {
                case "1": addStudent(); break;
                case "2": addModule(); break;
                case "3": assignMark(); break;
                case "4": showStudentGrades(); break;
                case "5": showModuleStatistics(); break;
                case "6": deleteStudent(); break;  // NEW CASE
                case "7": running = false; break;
                default: System.out.println("Invalid option.");
            }
        }
    }

    private static void printMenu() {
        System.out.println("\n===== University Marks System =====");
        System.out.println("1. Add Student");
        System.out.println("2. Add Module");
        System.out.println("3. Assign/Update Student Mark");
        System.out.println("4. Display Student Grades");
        System.out.println("5. Display Module Statistics");
        System.out.println("6. Delete Student");  // NEW OPTION
        System.out.println("7. Exit");
        System.out.print("Choose an option: ");
    }

    private static void deleteStudent() {
        System.out.print("Enter Student ID to delete: ");
        String id = scanner.nextLine();
        Student student = university.findStudent(id);

        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        university.removeStudent(id);
        System.out.println("Student with ID " + id + " has been deleted.");
    }

    private static void addStudent() {
        System.out.print("Enter Student ID: ");
        String id = scanner.nextLine();
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();
        university.addStudent(new Student(id, name));
        System.out.println("Student added successfully.");
    }

    private static void addModule() {
        System.out.print("Enter Module Code: ");
        String code = scanner.nextLine();
        System.out.print("Enter Module Name: ");
        String name = scanner.nextLine();
        university.addModule(new Module(code, name));
        System.out.println("Module added successfully.");
    }

    private static void assignMark() {
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        Student student = university.findStudent(studentId);
        if (student == null) {
            System.out.println("Student not found.");
            return;
        }

        System.out.print("Enter Module Code: ");
        String moduleCode = scanner.nextLine();
        Module module = university.findModule(moduleCode);
        if (module == null) {
            System.out.println("Module not found.");
            return;
        }

        System.out.print("Enter Mark (0-100): ");
        int mark;
        try {
            mark = Integer.parseInt(scanner.nextLine());
            student.assignMark(module, mark);
            System.out.println("Mark assigned successfully.");
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a numeric value.");
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid mark: " + e.getMessage());
        }

    }

    private static void showStudentGrades() {
        for (Student student : university.getStudents()) {
            System.out.println("\nStudent: " + student.getName() + " (ID: " + student.getId() + ")");
            for (Module module : university.getModules()) {
                Integer mark = student.getMark(module);
                if (mark != null) {
                    System.out.println("  " + module.getCode() + " - " + module.getName() + ": " + mark +
                            " (" + student.getGrade(module) + ")");
                }
            }
        }
    }

    private static void showModuleStatistics() {
        for (Module module : university.getModules()) {
            System.out.println("\nModule: " + module.getName() + " (" + module.getCode() + ")");
            System.out.printf("  Mean: %.2f\n", module.getMeanMark());
            System.out.println("  Min: " + module.getMinMark());
            System.out.println("  Max: " + module.getMaxMark());
            System.out.println("  Grade Profile:");
            Map<Grade, Long> profile = module.getGradeProfile();
            for (Grade grade : Grade.values()) {
                System.out.printf("    %s: %d\n", grade, profile.getOrDefault(grade, 0L));
            }
        }
    }
}
