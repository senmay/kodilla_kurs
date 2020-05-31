package com.kodilla.kodillapatterns2.observer.homework;

import java.util.*;

public class StudentTasks implements QueueObservable {
    private final Student student;
    private final Deque<String> exercises;
    private final List<MentorObserver> observers;

    public StudentTasks(Student student) {
        this.student = student;
        exercises = new ArrayDeque<>();
        observers = new ArrayList<>();
    }

    public void addTaskToQueue(String task) {
        exercises.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(MentorObserver observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (MentorObserver observer : observers) {
            observer.notifyAboutNewTask(this);
        }
    }

    public Student getStudent() {
        return student;
    }

    public Deque<String> getExercises() {
        return exercises;
    }
}