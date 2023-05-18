package TimeDate;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class collect_reduce {
    public static List<String> workTimeDate(String startDate, String endDate, String startTime, String endTime) {

        GetDateTime getDateTime = new GetDateTime();
        List<LocalTime> timeList =  getDateTime.getDateRandomTime(startTime, endTime, startDate, endDate);
        List<LocalDate> dateList = getDateTime.getDatesBetweenTwoDates(startDate, endDate);

        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

        List<LocalDateTime> dateTimeList = IntStream.iterate(0, i -> i+1)
                .limit(dateList.size())
                .mapToObj(i -> LocalDateTime.of(dateList.get(i), timeList.get(i)))
                .collect(Collectors.toList());

        List<String> dateTimeStringList = dateTimeList.stream().map(t -> t.format(formatter)).collect(Collectors.toList());

        return dateTimeStringList;
    }

}
