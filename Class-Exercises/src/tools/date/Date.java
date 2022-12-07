package tools.date;

public class Date {
    private int year;
    private int month;
    private int day;

    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return this.month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return this.day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public boolean isValid() {
        if (this.day < 1 || this.day > 31) return false;
        if (this.month < 1 || this.month > 12) return false;
        return this.getMonthDays() >= this.day;
    }

    public boolean isLeapYear() {
        if (this.year % 400 == 0) {
            return true;
        }
        if (this.year % 4 != 0) {
            return false;
        }
        return this.year % 100 != 0;
    }

    public int getAllMonth() {
        return this.year * 12 + this.month;
    }

    public int getMonthDays() {
        return Date.getMonthDays(this.month, this.isLeapYear());
    }

    public static int getMonthDays(int month, boolean isLeapYear){
        // we can replace this code with 'switch expression'
        switch (month) {
            case 1, 3, 5, 7, 8, 10, 12: // These months are 31-days.
                return 31;
            case 2: // This month is 29-days in a leap year and 28-days in a non-leap year.
                return isLeapYear ? 29 : 28;
            default: // other months are 30-days.
                return 30;
        }
    }

    public int getYearDays() {
        return this.isLeapYear() ? 366 : 365;
    }

    public int getAllDays() {
        return this.getYearDays() + this.getMonthDays() + this.day;
    }

    public static int diff(Date date1, Date date2) {
        int date1Days = DateRange.allDays(date1);
        int date2Days = DateRange.allDays(date2);
        return date1Days - date2Days;
    }

    @Override
    public String toString() {
        return this.year + "/" + this.month + "/" + this.day;
    }
}

