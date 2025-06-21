package org.rals.jd20.junit5.bank;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @BeforeEach
    void setUp() {
        System.out.println("Setting up before each test");
    }

    @Test
    void testGetPerson() {
        Account account = new Account("John Doe", new BigDecimal("1000.00"));

        //Premise
        String expected = "John Doe";
        String actual = account.getPerson();

        assertNotNull(actual);
        assertEquals(expected, actual);
        assertTrue(actual.equals(expected));
    }

    //TDD - Test Driven Development
    // Bank dont allow duplicate accounts
    @Test
    void testAccountReference() {
        Account account1 = new Account("Jane Doe", new BigDecimal("2000.00"));
        Account account2 = new Account("Jane Doe", new BigDecimal("2000.00"));

        //Premise
        assertEquals(account1, account2);
    }
}