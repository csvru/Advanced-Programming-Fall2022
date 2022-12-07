package tools.date;

public class DateRange {
    static int countOfLeapYears(Date date) {
        int years = date.getYear() - 1;
        return (years / 4) - (years / 100) + (years / 400);
    }

    static int countOfNonLeapYears(Date date) {
        return date.getYear() - DateRange.countOfLeapYears(date);
    }

    static int allDays(Date date) {
        int leapYears = DateRange.countOfLeapYears(date);
        int nonLeapYears = DateRange.countOfNonLeapYears(date);
        int monthDays = 0;
        for (int i = 1; i < date.getMonth(); i++) {
            monthDays += Date.getMonthDays(i, date.isLeapYear());
        }
        return leapYears * 366 + nonLeapYears * 365 + monthDays + date.getDay();
    }

    public static int diff(Date date1, Date date2) {
        int date1Days = DateRange.allDays(date1);
        int date2Days = DateRange.allDays(date2);
        return date1Days - date2Days;
    }
}
