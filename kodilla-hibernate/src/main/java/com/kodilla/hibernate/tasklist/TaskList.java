package com.kodilla.hibernate.tasklist;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name="TASKLISTS")
public final class TaskList {
    int id;
    String listName;
    String description;

    public TaskList() {};

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
