package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    TaskClass taskName;
    String whatToBuy;
    int quantity;
    boolean isTaskDone;

    public ShoppingTask(TaskClass taskName, String whatToBuy, int quantity) {
        this.taskName = taskName;
        this.whatToBuy = whatToBuy;
        this.quantity = quantity;
    }


    @Override
    public void executeTask() {
        System.out.println("ShoppingTask is executed");
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
