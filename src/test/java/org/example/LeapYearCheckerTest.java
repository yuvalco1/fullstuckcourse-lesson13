package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearCheckerTest {

    @Test
    void is2020LeapYear() {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        assertTrue(leapYearChecker.isLeapYear(2020));
    }

    @Test
    void is2021LeapYear() {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        assertFalse(leapYearChecker.isLeapYear(2021));
    }

    @Test
    void is2060LeapYear() {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        assertTrue(leapYearChecker.isLeapYear(2060));
    }


    @Test
    void testLeapYearDivisibleBy4NotDivisibleBy100() {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        assertTrue(leapYearChecker.isLeapYear(2040));
    }

    @Test
    void testLeapYearDivisibleBy4DivisibleBy100NotDivisibleBy400() {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        assertFalse(leapYearChecker.isLeapYear(2100));
    }

    @Test
    void testLeapYearDivisibleBy4DivisibleBy100DivisibleBy400() {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        assertTrue(leapYearChecker.isLeapYear(2000));
    }

    @Test
    void testNonLeapYear() {
        LeapYearChecker leapYearChecker = new LeapYearChecker();
        assertFalse(leapYearChecker.isLeapYear(2017));
    }

}