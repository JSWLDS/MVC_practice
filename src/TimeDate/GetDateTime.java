package TimeDate;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class GetDateTime {
    public List<LocalDate> getDatesBetweenTwoDates(String startDate, String endDate) {

        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate start_date = LocalDate.parse(startDate, formatter);
        LocalDate end_date = LocalDate.parse(endDate,formatter);


        int numOfDaysBetween = (int) ChronoUnit.DAYS.between(start_date, end_date)+1;
        return IntStream.iterate(0, i -> i + 1)
                .limit(numOfDaysBetween)
                .mapToObj(i -> start_date.plusDays(i))
                .collect(Collectors.toList());
    }


    public  List<LocalTime> getDateRandomTime(String startTime, String endTime, String startDate, String endDate) {

        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("HH-mm");

        LocalTime start_Time = LocalTime.parse(startTime, formatter);
        LocalTime end_Time = LocalTime.parse(endTime,formatter);

        int numOfTimeBetween = (int) ChronoUnit.MINUTES.between(start_Time, end_Time)+1;

        List<LocalTime> timeList = IntStream.iterate(0, i -> i + 1)
                .limit(numOfTimeBetween)
                .mapToObj(i -> start_Time.plusMinutes(i))
                .collect(Collectors.toList());

        int time_length = timeList.size();
        int dateListSize = getDatesBetweenTwoDates(startDate, endDate).size();
        List<LocalTime> randomTimeList = IntStream.iterate(0, i -> i+1)
                .limit(dateListSize)
                .mapToObj(i -> timeList.get((int) (Math.random()*time_length)))
                .collect(Collectors.toList());

        return randomTimeList;

    }
}
