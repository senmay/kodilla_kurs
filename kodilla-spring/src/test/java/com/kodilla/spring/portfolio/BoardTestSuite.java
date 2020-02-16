package com.kodilla.spring.portfolio;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context =
                new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        board.getToDoList().addTask("Zadanie 1");
        board.getInProgressList().addTask("Zadanie 2");
        board.getDoneList().addTask("Zadanie 3");
        //When
        String toDoTask = board.getToDoList().getTask(0);
        String inProgressTask = board.getInProgressList().getTask(0);
        String doneTask = board.getDoneList().getTask(0);
        //Then
        Assert.assertEquals("Zadanie 1", toDoTask);
        Assert.assertEquals("Zadanie 2", inProgressTask);
        Assert.assertEquals("Zadanie 3", doneTask);
    }
}