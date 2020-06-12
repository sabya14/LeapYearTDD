package tdd;

public class LeapYear {
    public static Boolean isLeapYear(int leapYear) {
        if (leapYear % 4 == 0) {
            return leapYear % 100 != 0;
        }
        return false;
    }
}
