package tools.date;

public class DateRange {
    /**
     * Finding count of previous leap years before a date.
     *
     * @param date A date to find its previous leap years.
     * @return Count of leap years.
     */
    static int countOfLeapYears(Date date) {
        int previousYear = date.getYear() - 1;
        return (previousYear / 4) - (previousYear / 100) + (previousYear / 400);
    }

    /**
     * Finding count of previous non-leap years before a date.
     *
     * @param date The date.
     * @return Count of non-leap years.
     */
    static int countOfNonLeapYears(Date date) {
        return date.getYear() - DateRange.countOfLeapYears(date);
    }

    /**
     * Finding all days from 0000-00-00 (origin) to the desired date.
     *
     * @param date The date.
     * @return Count of days.
     */
    static int allDays(Date date) {
        int leapYears = DateRange.countOfLeapYears(date);
        int nonLeapYears = DateRange.countOfNonLeapYears(date);
        int monthDays = 0;
        for (int i = 1; i < date.getMonth(); i++) {
            monthDays += Date.getMonthDays(i, date.isLeapYear());
        }
        return leapYears * 366 + nonLeapYears * 365 + monthDays + date.getDay();
    }

    /**
     *
     * @param date1 The first date.
     * @param date2 The second date.
     * @return Count of days between the first date and the second date.
     */
    public static int diff(Date date1, Date date2) {
        int date1Days = DateRange.allDays(date1);
        int date2Days = DateRange.allDays(date2);
        return date1Days - date2Days;
    }
}
