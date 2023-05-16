package insertDate;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        LocalDateTime date = LocalDateTime.of(2022, 11, 12, 12,33,33);

        LocalTime start = LocalTime.of(10, 35, 40);
        LocalTime end = LocalTime.of(10, 36, 50, 800);

        Duration duration = Duration.between(start, end);

        System.out.println("Seconds: " + duration);


    }
}
