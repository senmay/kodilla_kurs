package com.kodilla.patterns.factory.tasks;

public interface Task {
    void executeTask();
    TaskClass getTaskName();
    boolean isTaskExecuted();
    boolean isTaskDone = false;
}
