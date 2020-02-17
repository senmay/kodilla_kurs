package com.kodilla.patterns.singleton;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

public class LoggerTestSuite {

    @BeforeClass   //GIVEN
    public static void fillingLogs() {
        Logger.getInstance().log("Log nr 1");
        Logger.getInstance().log("Log nr 2");
    }

    @Test
    public void testGetLastLog() {

        // WHEN
        String lastLog = Logger.getInstance().getLastLog();
        //THEN
        Assert.assertEquals("Log nr 2", lastLog);
    }
}
