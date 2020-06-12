package tdd;

public class LeapYear {
    public static Boolean isLeapYear(int leapYear) {
        if (divisibleBy4000(leapYear)) return false;
        if (divisibleBy4(leapYear)) {
            if (divisibleBy100(leapYear)) {
                return !divisibleByOnly100andNotDivisible400(leapYear);
            }
            return true;
        }
        return false;
    }

    private static boolean divisibleBy4(int leapYear) {
        return leapYear % 4 == 0;
    }

    private static boolean divisibleBy100(int leapYear) {
        return leapYear % 100 == 0;
    }

    private static boolean divisibleByOnly100andNotDivisible400(int leapYear) {
        return leapYear % 100 == 0 && leapYear % 400 != 0;
    }

    private static boolean divisibleBy4000(int leapYear) {
        return leapYear % 4000 == 0;
    }
}
