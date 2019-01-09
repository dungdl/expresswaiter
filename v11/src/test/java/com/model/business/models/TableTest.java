package com.model.business.models;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TableTest {
    @Test
    public void testIdTable() {
        //C0
        Table table = new Table("id", "Table 1", false, 0);
        assertEquals("id", table.getId());
    }

    @Test
    public void testEnoughInfo() {
        //C1
        Table tableNoName = new Table(null, "Table1", false, 0);
        assertNotNull(tableNoName.getId());
    }

    @Test
    public void testId() {
        //C1
        Table tableFalseId = new Table("id", "Table1", false, -1);
        assertTrue(tableFalseId.getFloor_id() > 0);
    }

    @Test
    public void testTableName() {
        //C2
        Table tableFalseName = new Table("0_00", null, false, 1);
        assertNotNull("Name is null", tableFalseName.getName());
    }

    @Test
    public void testTableId() {
        //C2
        Table tableFalseName = new Table(null, "Table1", false, 1);
        assertNotNull("Id is null", tableFalseName.getId());
    }
}