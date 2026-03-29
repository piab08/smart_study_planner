package model;

import java.time.LocalDate;

public class Task 
{
    private String subject;
    private int priority; 
    private int duration; 
    private LocalDate deadline;

    public Task(String subject, int priority, int duration, LocalDate deadline) 
    {
        this.subject = subject;
        this.priority = priority;
        this.duration = duration;
        this.deadline = deadline;
    }

    public String getSubject() { return subject; }
    public int getPriority() { return priority; }
    public int getDuration() { return duration; }
    public LocalDate getDeadline() { return deadline; }
}