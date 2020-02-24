package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.completeTask(TaskClass.SHOP);
        //Then
        Assert.assertEquals(TaskClass.SHOP, shopping.getTaskName());
        Assert.assertEquals(false, shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.completeTask(TaskClass.DRIVE);
        driving.executeTask();
        //Then
        Assert.assertEquals(TaskClass.DRIVE, driving.getTaskName());
        Assert.assertEquals(true, driving.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.completeTask(TaskClass.PAINT);
        painting.executeTask();
        //Then
        Assert.assertEquals(TaskClass.PAINT, painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }

}