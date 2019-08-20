package bootcamp;

import java.util.Scanner;

public class Trainer {

    private String firstname;
    private String lastname;
    private String subject;

    public Trainer(String firstname, String lastname, String subject) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.subject = subject;
    }

    public Trainer() {
    }

    public Trainer initialize(Scanner sc) {
        System.out.println("Input trainers data: ");
        System.out.println("Enter first name: ");
        firstname = sc.next();
        System.out.println("Enter last name: ");
        lastname = sc.next();
        System.out.println("Enter trainer's subject: ");
        subject = sc.next();
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

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Trainer{" + "firstname=" + firstname + ", lastname=" + lastname + ", subject=" + subject + '}';
    }

}
