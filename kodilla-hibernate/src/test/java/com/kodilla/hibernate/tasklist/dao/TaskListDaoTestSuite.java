package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.task.Task;
import com.kodilla.hibernate.task.TaskFinancialDetails;
import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    private static final String DESCRIPTION =  "DESCRIPTION";
    private static final String LISTNAME =  "LISTNAME";

    @Autowired
    private TaskListDao taskListDao;

//    @Test
//    public void testFindByListName() {
//        //GIVEN
//        TaskList taskList1 = new TaskList("tasklist1", "first description");
//        TaskList taskList2 = new TaskList("tasklist2", "second description");
//        taskListDao.save(taskList1);
//        taskListDao.save(taskList2);
//
//        //WHEN
//        String listname1 = taskList1.getListName();
//        List<TaskList> readTasks = taskListDao.findByListName(listname1);
//
//        //THEN
//        Assert.assertEquals("tasklist1", readTasks.get(0).getListName());
//
//        //Cleanup
//        taskListDao.delete(taskList1);
//        taskListDao.delete(taskList2);
//
//    }

    @Test
    public void testTaskListDaoSaveWithTasks() {
        //Given
        Task task = new Task("Test: Learn Hibernate", 14);
        Task task2 = new Task("Test: Write some entities", 3);
        TaskFinancialDetails tfd = new TaskFinancialDetails(new BigDecimal(20), false);
        TaskFinancialDetails tfd2 = new TaskFinancialDetails(new BigDecimal(10), false);
        task.setTaskFinancialDetails(tfd);
        task2.setTaskFinancialDetails(tfd2);
        TaskList taskList = new TaskList(LISTNAME, "ToDo tasks");
        taskList.getTasks().add(task);
        taskList.getTasks().add(task2);
        task.setTaskList(taskList);
        task2.setTaskList(taskList);

        //When
        taskListDao.save(taskList);
        int id = taskList.getId();

        //Then
        Assert.assertNotEquals(0, id);

        //CleanUp
        //taskListDao.deleteById(id);
    }
}