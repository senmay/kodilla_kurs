package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task shopping = factory.completeTask(TaskFactory.SHOPPING);
        //Then
        Assert.assertEquals("SHOPPING", shopping.getTaskName());
        Assert.assertEquals(false, shopping.isTaskExecuted());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task driving = factory.completeTask(TaskFactory.DRIVING);
        driving.executeTask();
        //Then
        Assert.assertEquals("DRIVING", driving.getTaskName());
        Assert.assertEquals(true, driving.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory factory = new TaskFactory();
        //When
        Task painting = factory.completeTask(TaskFactory.PAINTING);
        painting.executeTask();
        //Then
        Assert.assertEquals("PAINTING", painting.getTaskName());
        Assert.assertEquals(true, painting.isTaskExecuted());
    }


}