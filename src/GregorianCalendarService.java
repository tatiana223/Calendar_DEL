import java.time.Year;

public class GregorianCalendarService implements CalendarService{
    @Override
    public YearCalendar createCalendar(int year) {
        boolean leapYear = Year.isLeap(year);

        return new YearCalendar(year, leapYear);
    }
}

