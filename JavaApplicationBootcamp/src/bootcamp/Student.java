package bootcamp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student {

    private String firstname;
    private String lastname;
    private LocalDate dateofbirth;
    private int fees;
    public List<Assignment> assignmentList = new ArrayList<>();

    public Student(String firstname, String lastname, String dateofbirth, int fees) //throws DateTimeParseException 
    {
        this.firstname = firstname;
        this.lastname = lastname;
        this.dateofbirth = LocalDate.parse(dateofbirth);
        this.fees = fees;
    }

    public Student() {
    }

    public Student initialize(Scanner sc) //throws DateTimeParseException 
    {
        System.out.println("Input student data: ");
        System.out.println("Enter first name: ");
        firstname = sc.next();
        System.out.println("Enter last name: ");
        lastname = sc.next();
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        dateofbirth = null;
        System.out.println("Enter birth date: ");
        dateofbirth = LocalDate.parse(sc.next(), formatter);
        System.out.println("Enter tuition fees: ");
        fees = sc.nextInt();
        return this;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getFees() {
        return fees;
    }

    public void setFees(int fees) {
        this.fees = fees;
    }

    public LocalDate getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(LocalDate dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public List<Assignment> getAssignmentList() {
        return assignmentList;
    }

    public void setAssignmentList(List<Assignment> assignmentList) {
        this.assignmentList = assignmentList;
    }

    @Override
    public String toString() {
        return "Student{" + "firstname=" + firstname + ", lastname=" + lastname
                + ", dateofbirth=" + dateofbirth.format(DateTimeFormatter.ofPattern("d/MM/yyyy"))
                + ", fees=" + fees + '}';
    }

}
