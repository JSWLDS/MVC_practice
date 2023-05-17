package insertDate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class stream{
    public static void main(String[] args) {

        String start_date = "2023-01-01";
        String end_date = "2023-04-30";

        String startTime = "09-30";
        String endTime = "10-30";


        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatter2 =  DateTimeFormatter.ofPattern("HH-mm");

        LocalDate startDate = LocalDate.parse(start_date, formatter);
        LocalDate endDate = LocalDate.parse(end_date, formatter);

        LocalTime start_Time = LocalTime.parse(startTime, formatter2);
        LocalTime end_Time = LocalTime.parse(endTime,formatter2);

        int numOfTimeBetween = (int) ChronoUnit.MINUTES.between(start_Time, end_Time)+1;

        List<LocalTime> timeList = IntStream.iterate(0, i -> i + 1)
                .limit(numOfTimeBetween)
                .mapToObj(i -> start_Time.plusMinutes(i))
                .collect(Collectors.toList());



//        ArrayList<LocalDate> dateList = (ArrayList<LocalDate>) getDatesBetweenTwoDates(startDate, endDate);

//        for(LocalTime i : timeList){
//            System.out.println(i);
//        }

    }


}
