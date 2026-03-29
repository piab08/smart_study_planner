package model;

import java.time.LocalDate;

public class StudySession 
{
    private String subject;
    private LocalDate date;
    private int hours;

    public StudySession(String subject, LocalDate date, int hours) {
        this.subject = subject;
        this.date = date;
        this.hours = hours;
    }

    public void display() {
        System.out.println(date + " -> " + subject + " (" + hours + " hrs)");
    }
}