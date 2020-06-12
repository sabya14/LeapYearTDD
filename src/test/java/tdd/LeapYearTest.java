package tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeapYearTest {

    @Test
    public void yearDivisibleByFourShouldBeLeapYear() {
        int leapYear = 2020;
        int notLeapYear = 2019;
        assertTrue(LeapYear.isLeapYear(leapYear));
        assertFalse(LeapYear.isLeapYear(notLeapYear));
    }
}