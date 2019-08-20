package bootcamp;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Assignment {

    private String title;
    private String description;
    private LocalDate submissiondt;
    private int oralmark;
    private int totalmark;

    public Assignment(String title, String description, String submissiondt, int oralmark, int totalmark) //throws DateTimeParseException
    {
        this.title = title;
        this.description = description;
        this.submissiondt = LocalDate.parse(submissiondt);
        this.oralmark = oralmark;
        this.totalmark = totalmark;
    }

    public Assignment() {
    }

    public Assignment initialize(Scanner sc) //throws DateTimeParseException
    {
        System.out.println("Input Assignment data: ");
        System.out.println("Enter title: ");
        title = sc.next();
        System.out.println("Enter description: ");
        description = sc.next();
        DateTimeFormatter formatter;
        formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
        System.out.println("Enter submission date: ");
        submissiondt = LocalDate.parse(sc.next(), formatter);
        System.out.println("Enter oral mark: ");
        oralmark = sc.nextInt();
        System.out.println("Enter total mark: ");
        totalmark = sc.nextInt();
        return this;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getSubmissiondt() {
        return submissiondt;
    }

    public void setSubmissiondt(LocalDate submissiondt) {
        this.submissiondt = submissiondt;
    }

    public int getOralmark() {
        return oralmark;
    }

    public void setOralmark(int oralmark) {
        this.oralmark = oralmark;
    }

    public int getTotalmark() {
        return totalmark;
    }

    public void setTotalmark(int totalmark) {
        this.totalmark = totalmark;
    }

    @Override
    public String toString() {
        return "Assignment{" + "title=" + title + ", description=" + description
                + ", submissiondt=" + submissiondt.format(DateTimeFormatter.ofPattern("d/MM/yyyy"))
                + ", oralmark=" + oralmark + ", totalmark=" + totalmark + '}';
    }

}
