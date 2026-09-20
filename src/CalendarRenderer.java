import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.YearMonth;

public class CalendarRenderer {
    private static final String[] MONTHS = {
            "Январь",
            "Февраль",
            "Март",
            "Апрель",
            "Май",
            "Июнь",
            "Июль",
            "Август",
            "Сентрябрь",
            "Октябрь",
            "Ноябрь",
            "Декабрь"
    };

    public void print(YearCalendar calendar) {
        int year = calendar.getYear();

        System.out.println();
        System.out.println("Календарь на " + year + " год");

        if (calendar.isLeapYear()) {
            System.out.println("Год високосный");
        } else {
            System.out.println("Год невисокосный");
        }

        for (int month = 1; month <= 12; month++) {
            printMonth(year, month);
        }
    }

    private void printMonth(int year, int month) {

        YearMonth yearMonth = YearMonth.of(year, month);

        System.out.println();
        System.out.println("========== " + MONTHS[month - 1] + " ==========");
        System.out.println("Пн Вт Ср Чт Пт Сб Вс");

        LocalDate firstDay = yearMonth.atDay(1);

        int firstDayOfWeek = firstDay.getDayOfWeek().getValue();

        for (int i = 1; i < firstDayOfWeek; i++) {
            System.out.print("   ");
        }

        for (int day = 1; day <= yearMonth.lengthOfMonth(); day++) {

            System.out.printf("%2d ", day);

            LocalDate currentDate = yearMonth.atDay(day);

            if (currentDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
                System.out.println();
            }
        }

        System.out.println();
    }

}
