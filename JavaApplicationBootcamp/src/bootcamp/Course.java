package bootcamp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Course {

    private String title;
    private String stream;
    private String type;
    private LocalDate startdate;
    private LocalDate enddate;
    public List<Student> studentList = new ArrayList<>();
    public List<Trainer> trainerList = new ArrayList<>();
    public List<Assignment> assignmentList = new ArrayList<>();

    public Course(String title, String stream, String type, String startdate, String enddate) //throws DateTimeParseException
    {
        this.title = title;
        this.stream = stream;
        this.type = type;
        this.startdate = LocalDate.parse(startdate);
        this.enddate = LocalDate.parse(enddate);
    }

    public Course() {
    }

    public Course initialize(Scanner sc) //throws NullPointerException//throws DateTimeParseException
    {
        System.out.println("Input Cource data: ");
        System.out.println("Enter title: ");
        title = sc.next();
        while (!(stream.equals("java") || stream.equals("c#"))) {
            System.out.print("Enter stream (java/c#): ");
            stream = sc.next();
            if (!(stream.equals("java") || stream.equals("c#"))) {
                System.out.print("Invalid Input ");
            }
        }
        while (!(type.equals("full") || type.equals("part"))) {
            System.out.print("Enter type (full/part): ");
            type = sc.next();
            if (!(type.equals("full") || type.equals("part"))) {
                System.out.print("Invalid Input ");
            }
        }
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        startdate = null;
        enddate = null;
        System.out.println("Enter start date: ");
        startdate = LocalDate.parse(sc.next(), formatter);
        System.out.println("Enter end date: ");
        enddate = LocalDate.parse(sc.next(), formatter);
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public LocalDate getStartdate() {
        return startdate;
    }

    public void setStartdate(LocalDate startdate) {
        this.startdate = startdate;
    }

    public LocalDate getEnddate() {
        return enddate;
    }

    public void setEnddate(LocalDate enddate) {
        this.enddate = enddate;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Trainer> getTrainerList() {
        return trainerList;
    }

    public void setTrainerList(List<Trainer> trainerList) {
        this.trainerList = trainerList;
    }

    public List<Assignment> getAssignmentList() {
        return assignmentList;
    }

    public void setAssignmentList(List<Assignment> assignmentList) {
        this.assignmentList = assignmentList;
    }

    @Override
    public String toString() {
        return title + " - " + stream + "(" + type + ")\n"
                + "Duration: "
                + startdate.format(DateTimeFormatter.ofPattern("d/MM/yyyy"))
                + " - "
                + enddate.format(DateTimeFormatter.ofPattern("d/MM/yyyy"));
    }

}
