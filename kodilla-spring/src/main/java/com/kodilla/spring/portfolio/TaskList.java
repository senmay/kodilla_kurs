package com.kodilla.spring.portfolio;

import java.util.ArrayList;
import java.util.List;

public class TaskList {
    private List<String> tasks;

    public TaskList() {
        this.tasks = new ArrayList<>();
    }

    public String getTask(int i) {
        String entry = tasks.get(i);
        return entry;
    }

    public void addTask(String taskDescription){
        tasks.add(taskDescription);
    }
}