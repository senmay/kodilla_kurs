package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
//    public static final String SHOPPING = "SHOPPING";
//    public static final String PAINTING = "PAINTING";
//    public static final String DRIVING = "DRIVING";

    public final Task completeTask(TaskClass taskClass) {
        switch (taskClass) {
            case SHOP:
                return new ShoppingTask(taskClass.SHOP,"Lollipop", 2);
            case PAINT:
                return new PaintingTask(taskClass.PAINT,"Red","Big balooon");
            case DRIVE:
                return new DrivingTask(taskClass.DRIVE,"Moldavia","Motorcycle");
            default:
                return null;
        }
    }
}
