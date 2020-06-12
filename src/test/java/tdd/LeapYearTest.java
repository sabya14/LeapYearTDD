package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {


    @Test
    public void allYearsNotDivisibleByFourShouldNotBeLeapYear() {
        int notLeapYear1 = 2017;
        int notLeapYear2 = 2019;
        assertFalse(LeapYear.isLeapYear(notLeapYear1));
        assertFalse(LeapYear.isLeapYear(notLeapYear2));
    }

    @Test
    public void allYearsDivisibleByFourAndNotBy100ShouldBeLeapYear() {
        int leapYear = 2020;
        int leapYear1 = 2024;
        int notLeapYearAsDivisibleBy100 = 2100;
        assertTrue(LeapYear.isLeapYear(leapYear));
        assertTrue(LeapYear.isLeapYear(leapYear1));
        assertFalse(LeapYear.isLeapYear(notLeapYearAsDivisibleBy100));
    }

    @Test
    public void allYearsDivisibleBy100AndNotBy400ShouldNotBeLeapYear() {
        int leapYear = 2400;
        int notLeapYearDivisibleBy100ButNotBy400 = 2200;
        assertTrue(LeapYear.isLeapYear(leapYear));
        assertFalse(LeapYear.isLeapYear(notLeapYearDivisibleBy100ButNotBy400));
    }



}