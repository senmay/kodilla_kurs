package com.kodilla.patterns.factory.tasks;

public class PaintingTask implements Task{
    TaskClass taskName;
    String color;
    String whatToPaint;
    boolean isTaskDone;

    public PaintingTask(TaskClass taskName, String color, String whatToPaint) {
        this.taskName = taskName;
        this.color = color;
        this.whatToPaint = whatToPaint;
    }

    @Override
    public void executeTask() {
        System.out.println("PaintingTask is executed");
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
