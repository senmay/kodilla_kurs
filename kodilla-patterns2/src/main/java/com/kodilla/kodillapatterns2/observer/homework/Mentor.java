package com.kodilla.kodillapatterns2.observer.homework;

public class Mentor implements MentorObserver {
    private final String username;
    private int updateCount;

    public Mentor(String username) {
        this.username = username;
    }

    @Override
    public void notifyAboutNewTask(StudentTasks studentTasks) {
        System.out.println("Hi " + username + ". Your student " + studentTasks.getStudent().getUsername() +
                " solved exercise: " + studentTasks.getExercises().peekLast() +
                ". Exercises done by this student: " + studentTasks.getExercises().size());
        updateCount++;
    }

    public String getusername() {
        return username;
    }

    public int getUpdateCount() {
        return updateCount;
    }
}