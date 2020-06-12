package tdd;

public class LeapYear {
    public static Boolean isLeapYear(int leapYear) {
        if (leapYear % 4 == 0) {
            if (leapYear % 100 == 0) {
                if (leapYear % 400 == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }
}
