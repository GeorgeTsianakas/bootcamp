package bootcamp;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Data {

    public static List<Course> courseList = new ArrayList<Course>();

    public static void addList(Student student, Scanner sc) {
        if (coursesHasStudent(student)) {
            System.out.println("Student already exists ");
        } else {
            System.out.println("Course List");
            for (int i = 0; i < courseList.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, courseList.get(i));
            }
            System.out.print("Add student to course. Choose a number: ");
            int n = sc.nextInt();
            while (n < 1 || n > courseList.size()) {
                System.out.print("Invalid input ");
                n = sc.nextInt();
            }
            courseList.get(n - 1).studentList.add(student);
            System.out.println("Student entered ");
        }
    }

    public static void addList(Trainer trainer, Scanner sc) {
        if (coursesHasTrainer(trainer)) {
            System.out.println("Trainer already exists ");
        } else {
            System.out.println("Course List");
            for (int i = 0; i < courseList.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, courseList.get(i));
            }
            System.out.print("Add Trainer to course. Choose a number: ");
            int n = sc.nextInt();
            while (n < 1 || n > courseList.size()) {
                System.out.print("Invalid input ");
                n = sc.nextInt();
            }
            courseList.get(n - 1).trainerList.add(trainer);
            System.out.println("Trainer entered ");
        }
    }

    public static void addList(Assignment assignment, Scanner sc) {
        if (coursesHasAssignment(assignment)) {
            System.out.println("Assignment already exists ");
        } else {
            System.out.println("Course List");
            for (int i = 0; i < courseList.size(); i++) {
                System.out.printf("%d. %s\n", i + 1, courseList.get(i));
            }
            System.out.print("Add Assignment to course. Choose a number: ");
            int n = sc.nextInt();
            while (n < 1 || n > courseList.size()) {
                System.out.print("Invalid input ");
                n = sc.nextInt();
            }
            courseList.get(n - 1).assignmentList.add(assignment);
            System.out.println("Assignment entered ");
        }
    }

    public static void addList(Course course) {
        if (courseList.contains(course)) {
            courseList.add(course);
            System.out.println("Course entered ");
        } else {
            System.out.println("Course already exists ");
        }
    }

    public static boolean coursesHasStudent(Student student) {
        return courseList.stream().anyMatch((course) -> (course.studentList.contains(student)));
    }

    public static boolean coursesHasTrainer(Trainer trainer) {
        return courseList.stream().anyMatch((course) -> (course.trainerList.contains(trainer)));
    }

    public static boolean coursesHasAssignment(Assignment assignment) {
        return courseList.stream().anyMatch((course) -> (course.assignmentList.contains(assignment)));
    }

}
