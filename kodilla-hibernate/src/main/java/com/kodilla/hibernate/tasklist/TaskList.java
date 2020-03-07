package com.kodilla.hibernate.tasklist;

import com.kodilla.hibernate.task.Task;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="TASKLISTS")
public final class TaskList {
    int id;
    String listName;
    String description;
    private List<Task> tasks = new ArrayList<>();

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }
    @OneToMany (targetEntity = Task.class, mappedBy = "taskList", cascade =  CascadeType.ALL, fetch = FetchType.LAZY)
    public List<Task> getTasks() {
        return tasks;
    }
    //public TaskList() {};

    public TaskList(String listName, String description) {
        this.listName = listName;
        this.description = description;
    }

    @Id
    @GeneratedValue
    @NotNull
    @Column(name ="ID", unique = true)
    public int getId() {
        return id;
    }
    @Column(name ="Listname")
    public String getListName() {
        return listName;
    }

    @Column(name ="Description")
    public String getDescription() {
        return description;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    private void setId(int id) {
        this.id = id;
    }
}
