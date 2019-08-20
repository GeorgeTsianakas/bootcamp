package bootcamp;

import java.util.Scanner;

public class SyntheticData {

    public static void dummy(Scanner sc) {

        Student s1 = new Student("George", "Tsianakas", "26/08/1994", 350);
        Student s2 = new Student("George", "Dimitriou", "27/07/1993", 450);
        Student s3 = new Student("Tasos", "Xampsas", "26/10/1994", 250);
        Student s4 = new Student("Johnny", "Koskinas", "4/04/1994", 850);
        Student s5 = new Student("Bill", "Pandazis", "26/08/1994", 750);
        Student s6 = new Student("Vaggelis", "Theodorou", "16/08/1995", 350);
        Data.courseList.get(0).studentList.add(s1);
        Data.courseList.get(1).studentList.add(s2);
        Data.courseList.get(2).studentList.add(s3);
        Data.courseList.get(3).studentList.add(s4);
        Data.courseList.get(4).studentList.add(s5);
        Data.courseList.get(5).studentList.add(s6);
        for (int i = 0; i < 6; i++) {
            System.out.println(Data.courseList.get(i).studentList);
        }

        Trainer t1 = new Trainer("George", "Iraklidis", "Introduction to Java");
        Trainer t2 = new Trainer("George", "Pasparakhs", "C Intermidiate");
        Trainer t3 = new Trainer("Spuros", "Mavros", "Java");
        Trainer t4 = new Trainer("Unknown", "Unknown", "Introduction C#");
        Data.courseList.get(0).trainerList.add(t1);
        Data.courseList.get(1).trainerList.add(t2);
        Data.courseList.get(2).trainerList.add(t3);
        Data.courseList.get(3).trainerList.add(t4);
        for (int i = 0; i < 6; i++) {
            System.out.println(Data.courseList.get(i).trainerList);
        }

        Assignment a1 = new Assignment("Assignment1", "Classes", "14/02/2019", 50, 60);
        Assignment a2 = new Assignment("Assignment2", "Databases", "12/02/2019", 30, 50);
        Assignment a3 = new Assignment("Assignment3", "Debuggng", "12/02/2019", 20, 60);
        Assignment a4 = new Assignment("Assignment4", "Test", "14/02/2019", 25, 40);
        Data.courseList.get(0).assignmentList.add(a1);
        Data.courseList.get(1).assignmentList.add(a2);
        Data.courseList.get(2).assignmentList.add(a3);
        Data.courseList.get(3).assignmentList.add(a4);
        for (int i = 0; i < 6; i++) {
            System.out.println(Data.courseList.get(i).assignmentList);
        }

        Course c1 = new Course("Software Design and Development", "java", "full", "8/02/2019", "15/02/2019");
        Course c2 = new Course("Software Design and Development", "java", "part", "8/02/2019", "19/02/2019");
        Course c3 = new Course("Object Oriented Programming", "java", "full", "8/02/2019", "15/02/2019");
        Course c4 = new Course("Object Oriented Programming", "java", "part", "8/02/2019", "19/02/2019");
        Course c5 = new Course("Object Oriented Programming", "c#", "full", "8/02/2019", "15/02/2019");
        Course c6 = new Course("Object Oriented Programming", "c#", "part", "8/02/2019", "19/02/2019");
        Data.courseList.add(c1);
        Data.courseList.add(c2);
        Data.courseList.add(c3);
        Data.courseList.add(c4);
        Data.courseList.add(c5);
        Data.courseList.add(c6);
        for (int i = 0; i < 6; i++) {
            System.out.println(Data.courseList);
        }

    }

}
