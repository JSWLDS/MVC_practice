package TimeDate;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        String startDate = "2023-01-01";
        String endDate = "2023-04-30";

        String startTime = "09-30";
        String endTime = "10-30";

        List<String> startDateTime =  collect_reduce.workTimeDate(startDate,endDate,startTime,endTime);

        startDateTime.forEach(e -> System.out.println(e));

        startTime = "18-00";
        endTime = "20-00";

        System.out.println("----------------------------------");
        List<String> endDateTime = collect_reduce.workTimeDate(startDate,endDate,startTime,endTime);

        endDateTime.forEach(e -> System.out.println(e));


    }
}
