package com.kodilla.hibernate.task;

import com.kodilla.hibernate.tasklist.TaskList;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Entity
public final class Task {

    @Id
    @GeneratedValue
    private int id;

    private String description;

    @NotNull
    private Date created;

    private int duration;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "TASKS_FINANCIALS_ID")
    private TaskFinancialDetails taskFinancialDetails;

    @ManyToOne
    @JoinColumn(name = "TASKLIST_ID")
    private TaskList taskList;

    public Task(String description, int duration) {
        this.description = description;
        this.created = new Date();
        this.duration = duration;
    }

}