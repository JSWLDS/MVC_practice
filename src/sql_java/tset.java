package sql_java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class tset {
    public static void main(String[] args) {

        String startDate = "2023-01-01";
        String endDate = "2023-04-30";
        String startTime = "09:30";
        String endTime = "10:30";

        DateTimeFormatter dateFormatter =  DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter timeFormatter =  DateTimeFormatter.ofPattern("HH:mm");


        LocalDate start_date = LocalDate.parse(startDate, dateFormatter);
        LocalDate end_date = LocalDate.parse(endDate,dateFormatter);

        LocalTime start_Time = LocalTime.parse(startTime, timeFormatter);
        LocalTime end_Time = LocalTime.parse(endTime,timeFormatter);






        LocalDateTime dateTime = LocalDateTime.of(start_date, start_Time);


        System.out.println(dateTime);



    }
}
//        for (int i=0; i<a; i++){
//            System.out.println("@@@@@@@@");
//            for (int j=0; j<b; j++){
//System.out.println(j);
//                System.out.println(arr[i][j]);
//            }
//        }
//        System.out.println(cnt);
//    }
//}