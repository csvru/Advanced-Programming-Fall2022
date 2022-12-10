package tools.date;

public class Date {
    private int year;
    private int month;
    private int day;

    /**
     * Construct a date with year, month, day values.
     *
     * @param year  The year number.
     * @param month The month number.
     * @param day   The day number
     */
    public Date(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Getting the year number of the date.
     *
     * @return The year value.
     */
    public int getYear() {
        return this.year;
    }

    /**
     * Setting the year value of the date.
     *
     * @param year The year value.
     */
    public void setYear(int year) {
        this.year = year;
    }

    /**
     * Getting the month number of the date.
     *
     * @return The month value.
     */
    public int getMonth() {
        return this.month;
    }

    /**
     * Setting the month value of the date.
     *
     * @param month The month value.
     */
    public void setMonth(int month) {
        this.month = month;
    }

    /**
     * Getting the day number of the date.
     *
     * @return The day value.
     */
    public int getDay() {
        return this.day;
    }

    /**
     * Setting the day value of the date.
     *
     * @param day The day value.
     */
    public void setDay(int day) {
        this.day = day;
    }

    /**
     * Checking the validity of the date.
     *
     * @return `true` for a valid date, `false` for a invalid date.
     */
    public boolean isValid() {
        if(this.year < 1 || this.year > 9999) return false;
        if (this.day < 1 || this.day > 31) return false;
        if (this.month < 1 || this.month > 12) return false;
        return this.getMonthDays() >= this.day;
    }

    /**
     * Checking whether the year is a leap year.
     *
     * @return `true` for leap year, `false` for non leap year.
     */
    public boolean isLeapYear() {
        if (this.year % 400 == 0) {
            return true;
        }
        if (this.year % 4 != 0) {
            return false;
        }
        return this.year % 100 != 0;
    }

    /**
     * Getting the count of days in the month of the date.
     *
     * @return Count of days.
     */
    public int getMonthDays() {
        return Date.getMonthDays(this.month, this.isLeapYear());
    }

    /**
     * Getting the count of days in a month.
     *
     * @param month      The month.
     * @param isLeapYear The year is leap or not?
     * @return Count of days.
     */
    public static int getMonthDays(int month, boolean isLeapYear) {
        // we can replace this code with 'switch expression'
        switch (month) {
            case 4, 6, 9, 11: // These months are 30-days.
                return 30;
            case 2: // This month is 29-days in a leap year and 28-days in a non-leap year.
                return isLeapYear ? 29 : 28;
            default: // other months are 31-days.
                return 31;
        }
    }

    /**
     * Getting the count of the days in the year of the date.
     *
     * @return Count of days.
     */
    public int getYearDays() {
        return this.isLeapYear() ? 366 : 365;
    }

    /**
     * Getting the count of days between the date and another date.
     * @param from Another date.
     * @return Count of days between the date and the another date.
     */
    public int diff(Date from) {
        return DateRange.diff(this, from);
    }

    /**
     *
     * @return String presentation of a date.
     */
    @Override
    public String toString() {
        return this.year + "/" + this.month + "/" + this.day;
    }
}
