import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class jv48_dates_and_times {
    static void main() {
        LocalDate date  = LocalDate.now();
        LocalTime time  = LocalTime.now();
        LocalDateTime datetime = LocalDateTime.now();

        Instant instant = Instant.now(); //gets time in UTC


        System.out.println(date);
        System.out.println(time);
        System.out.println(datetime);
        System.out.println(instant);
    }
}
