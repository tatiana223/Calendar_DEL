public class YearCalendar {

    private final int year;
    private final boolean leapYear;

    public YearCalendar(int year, boolean leapYear) {
        this.year = year;
        this.leapYear = leapYear;
    }

    public int getYear() {
        return year;
    }

    public boolean isLeapYear() {
        return leapYear;
    }
}
