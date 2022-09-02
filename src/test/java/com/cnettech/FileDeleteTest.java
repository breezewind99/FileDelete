package com.cnettech;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class FileDeleteTest
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        Database database = new Database();
        database.tbl_dash_Monitoring_update("01","01","01","01","01","1");
        assertTrue( true );
    }
}
