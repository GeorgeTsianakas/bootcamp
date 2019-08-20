package bootcamp;

import java.util.ArrayList;
import java.util.Scanner;

public class SimpleMethods {

    public static void simpleInputOutput() {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> sList = new ArrayList<>();
        ArrayList<Trainer> tList = new ArrayList<>();
        ArrayList<Assignment> aList = new ArrayList<>();
        ArrayList<Course> cList = new ArrayList<>();

        String c;
        int i;
        System.out.println("Write yes to enter student data: ");
        c = sc.next();
        i = 0;
        while ("yes".equals(c)) {
            System.out.println("Add student to system: ");
            sList.add(i, new Student().initialize(sc));
            System.out.println("Continue? ");
            c = sc.next();
            i++;
        }
        System.out.println(sList);//A list of all the Students
        System.out.println("Write yes to enter trainer data: ");
        c = sc.next();
        i = 0;
        while ("yes".equals(c)) {
            System.out.println("Add trainer to system: ");
            tList.add(i, new Trainer().initialize(sc));
            System.out.println("Continue? ");
            c = sc.next();
            i++;
        }
        System.out.println(tList);//A list of all the Trainers
        System.out.println("Write yes to enter assignment data: ");
        c = sc.next();
        i = 0;
        while ("yes".equals(c)) {
            System.out.println("Add assignment to system: ");
            aList.add(i, new Assignment().initialize(sc));
            System.out.println("Continue? ");
            c = sc.next();
            i++;
        }
        System.out.println(aList);//A list of all the Assignments
        System.out.println("Write yes to enter course data: ");
        c = sc.next();
        i = 0;
        while ("yes".equals(c)) {
            System.out.println("Add course to system: ");
            cList.add(i, new Course().initialize(sc));
            System.out.println("Continue? ");
            c = sc.next();
            i++;
        }
        System.out.println(cList);//A list of all the Courses

    }

}
