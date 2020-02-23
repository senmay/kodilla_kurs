package com.kodilla.patterns.factory.tasks;

public class ShoppingTask implements Task{
    String taskName;
    String whatToBuy;
    int quantity;
    boolean isTaskDone;

    public ShoppingTask(String taskName, String whatToBuy, int quantity) {
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
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return isTaskDone;
    }
}
