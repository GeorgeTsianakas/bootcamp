package bootcamp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Methods {

    Scanner sc = new Scanner(System.in);
    private static String c;
    private static String w;

    public static void inputData(Scanner sc) {
        System.out.println("Write yes to input data ");
        System.out.println("Write no for synthetic data ");
        System.out.println("Then write continue every time if you want to");
        c = sc.next();
        w = sc.next();
        while (w.equals("continue")) {

            switch (c) {
                case "yes":

                    Data.addList(new Course().initialize(sc));
                    Data.addList(new Assignment().initialize(sc), sc);
                    Data.addList(new Trainer().initialize(sc), sc);
                    Data.addList(new Student().initialize(sc), sc);

                    break;
                case "no":
                    SyntheticData.dummy(sc);
                    break;
                default:
                    System.out.println("Access denied! ");
                    break;
            }
        }
    }

    public static void printStudents(Scanner sc) {
        int index;
        if (Data.courseList.isEmpty()) {
            System.out.println("Empty courselist");
        } else {
            index = 1;
            System.out.println("Students: ");
            for (Course course : Data.courseList) {
                for (Student student : course.studentList) {
                    System.out.printf("%d. %s\n", index, student);
                    index++;
                }
            }
        }
    }

    public static void printTrainers(Scanner sc) {
        int index;
        if (Data.courseList.isEmpty()) {
            System.out.println("Empty trainerlist ");
        } else {
            index = 1;
            System.out.println("Trainers:");
            for (Course course : Data.courseList) {
                for (Trainer trainer : course.trainerList) {
                    System.out.printf("%d. %s\n", index, trainer);
                    index++;
                }
            }
        }
    }

    public static void printAssignments(Scanner sc) {
        int index;
        if (Data.courseList.isEmpty()) {
            System.out.println("Empty assignmentlist ");
        } else {
            index = 1;
            System.out.println("Assignments:");
            for (Course course : Data.courseList) {
                for (Assignment assignment : course.assignmentList) {
                    System.out.printf("%d. %s\n", index, assignment);
                    index++;
                }
            }
        }
    }

    public static void printCourses() {
        if (Data.courseList.isEmpty()) {
            System.out.println("Course List is Empty");
        } else {
            System.out.println("Courses: ");
            Data.courseList.forEach((course) -> {
                System.out.println(course);
            });
        }
    }

    public static void printStudentsPerCourse(Scanner sc) {
        int index;
        for (Course course : Data.courseList) {
            index = 1;
            System.out.printf("\n%s students:\n",
                    course);
            for (Student student : course.studentList) {
                System.out.printf("%d. %s %s\n", index,
                        student.getFirstname(),
                        student.getLastname());
                index++;
            }
        }
    }

    public static void printTrainersPerCourse(Scanner sc) {
        int index;
        for (Course course : Data.courseList) {
            index = 1;
            System.out.printf("\n%s Trainers:\n", course);
            for (Trainer trainer : course.trainerList) {
                System.out.printf("%d. %s\n", index, trainer);
                index++;
            }
        }
    }

    public static void printAssignmentsPerCourse(Scanner sc) {
        int index;
        for (Course course : Data.courseList) {
            index = 1;
            System.out.printf("\n%s Assignments:\n", course);
            for (Assignment assignment : course.assignmentList) {
                System.out.printf("%d. %s\n", index, assignment);
                index++;
            }
        }
    }

    public static void printAssignmentsPerStudent() {

        Data.courseList.forEach((Course course) -> {
            course.studentList.stream().map((student) -> {
                System.out.printf("\n%s %s\n", student.getFirstname(), student.getLastname());
                return student;
            }).map((_item) -> {
                System.out.println("Assignments: ");
                return _item;
            }).map((_item) -> 1).forEachOrdered((index) -> {
                for (Assignment assignment : course.assignmentList) {
                    System.out.printf("%5d. %s  Submit: %s\n", index, assignment.getTitle(),
                            assignment.getSubmissiondt().format(DateTimeFormatter.ofPattern("d/MM/yyyy")));
                    index++;
                }
            });
        });
    }

    public static void printStudentsPerCourseAssignmentDate(Scanner sc) {
        LocalDate searchDate;
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        searchDate = null;
        System.out.print("Search For Date (dd/mm/yyyy): ");
        searchDate = LocalDate.parse(sc.next(), formatter);
        int index = 0;
        for (Course course : Data.courseList) {
            for (Assignment assignment : course.assignmentList) {
                int day = searchDate.getDayOfYear();
                int year = searchDate.getYear();
                int sunday = assignment.getSubmissiondt().getDayOfYear() + 2;
                int monday = assignment.getSubmissiondt().getDayOfYear() - 4;
                int subYear = assignment.getSubmissiondt().getYear();
                if ((day <= sunday) && (day >= monday) && (year == subYear)) {
                    System.out.println("\nSearch Date: " + searchDate.format(DateTimeFormatter.ofPattern("d/MM/yyyy")));
                    System.out.println("Assignment: " + assignment.getTitle());
                    System.out.printf("Submit From %s - %s:\n",
                            assignment.getSubmissiondt().minusDays(4).format(DateTimeFormatter.ofPattern("d/MM/yyyy")),
                            assignment.getSubmissiondt().format(DateTimeFormatter.ofPattern("d/MM/yyyy")));
                    index = 1;
                    for (Student student : course.studentList) {
                        System.out.printf("%5d. %s %s\n", index,
                                student.getFirstname(), student.getLastname());
                        index++;
                    }
                }
            }
        }
        if (index == 0) {
            System.out.println("No Assignments.");
        }
    }

}
