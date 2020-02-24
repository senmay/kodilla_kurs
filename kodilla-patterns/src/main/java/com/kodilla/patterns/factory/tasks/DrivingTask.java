package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task{

    TaskClass taskName;
    String where;
    String using;
    boolean isTaskDone;

    public DrivingTask(TaskClass taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("DrivingTask is executed");
        isTaskDone = true;
    }

    @Override
    public TaskClass getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskDone;
    }
}
