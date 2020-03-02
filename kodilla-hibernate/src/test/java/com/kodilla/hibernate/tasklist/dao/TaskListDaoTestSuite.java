package com.kodilla.hibernate.tasklist.dao;

import com.kodilla.hibernate.tasklist.TaskList;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TaskListDaoTestSuite {
    @Autowired
    private TaskListDao taskListDao;

    @Test
    public void testFindByListName() {
        //GIVEN
        TaskList taskList1 = new TaskList("tasklist1", "first description");
        TaskList taskList2 = new TaskList("tasklist2", "second description");
        taskListDao.save(taskList1);
        taskListDao.save(taskList2);

        //WHEN
        String listname1 = taskList1.getListName();
        List<TaskList> readTasks = taskListDao.findByListName(listname1);

        //THEN
        Assert.assertEquals("tasklist1", readTasks.get(0).getListName());

        //Cleanup
        taskListDao.delete(taskList1);
        taskListDao.delete(taskList2);

    }




}