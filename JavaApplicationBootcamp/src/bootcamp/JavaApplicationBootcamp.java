package bootcamp;

import java.util.Scanner;
import static bootcamp.SimpleMethods.simpleInputOutput;
import static bootcamp.SyntheticData.dummy;

public class JavaApplicationBootcamp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        simpleInputOutput();
        System.out.println("Do you want to add systhetic data to lists?");
        dummy(sc);
        System.out.println("Input data for Students,Trainers,Assignments,Courses");
        Methods.inputData(sc);
        System.out.println("Show list of Students");
        Methods.printStudents(sc);
        System.out.println("Show list of Trainers");
        Methods.printTrainers(sc);
        System.out.println("Show list of Assignments");
        Methods.printAssignments(sc);
        System.out.println("Show list of Courses");
        Methods.printCourses();
        System.out.println("Show list of Students per Course");
        Methods.printStudentsPerCourse(sc);
        System.out.println("Show list of Trainers per Course");
        Methods.printTrainersPerCourse(sc);
        System.out.println("Show list of Assignments per Course");
        Methods.printAssignmentsPerCourse(sc);
        System.out.println("Show list of Assignments per Student");
        Methods.printAssignmentsPerStudent();
        System.out.println("Show Assignment Submissions");
        Methods.printStudentsPerCourseAssignmentDate(sc);

    }
}
