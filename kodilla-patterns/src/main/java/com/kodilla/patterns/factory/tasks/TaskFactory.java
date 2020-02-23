package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public static final String SHOPPING = "SHOPPING";
    public static final String PAINTING = "PAINTING";
    public static final String DRIVING = "DRIVING";

    public final Task completeTask(final String taskClass) {
        switch (taskClass) {
            case SHOPPING:
                return new ShoppingTask(SHOPPING,"Lollipop", 2);
            case PAINTING:
                return new PaintingTask(PAINTING,"Red","Big balooon");
            case DRIVING:
                return new DrivingTask(DRIVING,"Moldavia","Motorcycle");
            default:
                return null;
        }
    }
}
