package sql_java_workHour;

import TimeDate.collect_reduce;

import java.time.LocalDateTime;
import java.util.List;

public class Sql_inert_main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

         String sql = "INSERT IGNORE INTO employee VALUES (null, '정서원', 1, '세컴고')";
        Class workHour =  Class.forName("sql_java_workHour.mysqlConnection");

        mysqlConnection Insert = (mysqlConnection) workHour.newInstance();

        String startDate = "2023-01-01";
        String endDate = "2023-04-30";

        for(int i=0; i<1200000; i++) {

//            String startTime = "09-30";
//            String endTime = "10-30";
//
//            List<String> startDateTime =  collect_reduce.workTimeDate(startDate,endDate,startTime,endTime);
//
//            startTime = "18-00";
//            endTime = "20-00";
//
//            List<String> endDateTime = collect_reduce.workTimeDate(startDate,endDate,startTime,endTime);

            //for (int j = 0; j < startDateTime.size(); j++) {

//                if((Math.random()*100)>=20) {

             //    }
            //}

            Insert.insert(sql);

        }

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);
        System.out.println("sucessful");

    }

}