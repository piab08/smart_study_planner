package main;

import model.Task;
import model.StudySession;
import service.Scheduler;

import java.time.LocalDate;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        List<Task> tasks = new ArrayList<>();

        tasks.add(new Task("Math", 1, 10, LocalDate.of(2026, 4, 5)));
        tasks.add(new Task("Physics", 2, 8, LocalDate.of(2026, 4, 7)));
        tasks.add(new Task("CS", 1, 6, LocalDate.of(2026, 4, 3)));

        Scheduler scheduler = new Scheduler();
        List<StudySession> plan = scheduler.generatePlan(tasks);

        for (StudySession session : plan) {
            session.display();
        }
    }
}