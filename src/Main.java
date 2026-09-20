import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите год: ");
        int year = scanner.nextInt();

        if (year < 1600) {
            System.out.println("Год должен быть не меньше 1600.");
            return;
        }

        CalendarService calendarService = new GregorianCalendarService();
        CalendarRenderer renderer = new CalendarRenderer();

        YearCalendar calendar = calendarService.createCalendar(year);

        renderer.print(calendar);
    }
}