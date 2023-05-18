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

//        Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//        Integer sum = numbers.reduce(10, (x, y) -> x + y);
//        System.out.println("sum: " + sum);


        GetDateTime getDateTime = new GetDateTime();
        List<LocalTime> timeList =  getDateTime.getDateRandomTime(startTime, endTime, startDate, endDate);
        List<LocalDate> dateList = getDateTime.getDatesBetweenTwoDates(startDate, endDate);

        DateTimeFormatter formatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");

//        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm");

        List<LocalDateTime> dateTimeList = IntStream.iterate(0, i -> i+1)
                .limit(dateList.size())
                .mapToObj(i -> LocalDateTime.of(dateList.get(i), timeList.get(i)))
                .collect(Collectors.toList());


//        System.out.println(timeList.size());
//        System.out.println(dateList.size());
//        for(int i=0; i<dateList.size(); i++) {
//            System.out.println(dateTimeList.get(i));
//        }
//        String str =  dateTimeList.get(0).format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

        List<String> dateTimeStringList = dateTimeList.stream().map(t -> t.format(formatter)).collect(Collectors.toList());

//        for(int i=0; i<dateList.size(); i++) {
//            System.out.println(dateTimeStringList.get(i));
//        }
        return dateTimeStringList;
    }

}
