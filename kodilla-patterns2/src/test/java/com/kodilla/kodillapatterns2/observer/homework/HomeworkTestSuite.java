package com.kodilla.kodillapatterns2.observer.homework;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeworkTestSuite {
    @Test
    public void notifyAboutNewTask() {
        //given
        StudentTasks student1Tasks = new StudentTasks(new Student("student1"));
        StudentTasks student2Tasks = new StudentTasks(new Student("student2"));
        StudentTasks student3Tasks = new StudentTasks(new Student("student3"));
        Mentor mentor1 = new Mentor("mentor1");
        Mentor mentor2 = new Mentor("mentor2");

        student1Tasks.registerObserver(mentor1);
        student2Tasks.registerObserver(mentor1);
        student3Tasks.registerObserver(mentor2);

        //when
        student1Tasks.addTaskToQueue("zadanie 1.1");
        student3Tasks.addTaskToQueue("zadanie 18.1");
        student1Tasks.addTaskToQueue("zadanie 1.2");
        student1Tasks.addTaskToQueue("zadanie 1.3");
        student2Tasks.addTaskToQueue("zadanie 10.1");
        student3Tasks.addTaskToQueue("zadanie 18.2");

        //then
        assertEquals(1, student2Tasks.getExercises().size());
        assertEquals(2, student3Tasks.getExercises().size());
        assertEquals(3, student1Tasks.getExercises().size());
        assertEquals(4, mentor1.getUpdateCount());
        assertEquals(2, mentor2.getUpdateCount());
    }
}