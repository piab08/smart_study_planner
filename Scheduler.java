package service;

import model.Task;
import model.StudySession;

import java.time.LocalDate;
import java.util.*;

public class Scheduler {

    public List<StudySession> generatePlan(List<Task> tasks) {

        tasks.sort(Comparator
                .comparing(Task::getDeadline)
                .thenComparing(Task::getPriority));

        List<StudySession> plan = new ArrayList<>();

        LocalDate current = LocalDate.now(); // ✅ global pointer

        for (Task task : tasks) {

            int remaining = task.getDuration();

            while (remaining > 0 && !current.isAfter(task.getDeadline())) {

                int hours = Math.min(2, remaining);

                plan.add(new StudySession(
                        task.getSubject(),
                        current,
                        hours
                ));

                remaining -= hours;
                current = current.plusDays(1); // ✅ key fix
            }
        }

        return plan;
    }
}