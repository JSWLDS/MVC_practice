package sql_java_workHour;

import TimeDate.collect_reduce;
import sql_java_workHour.mysqlConnection;

import java.util.List;

public class sql_inert {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {


        Class workHour =  Class.forName("sql_java_workHour.mysqlConnection");

        mysqlConnection Insert = (mysqlConnection) workHour.newInstance();

        String startDate = "2023-01-01";
        String endDate = "2023-04-30";






        int cnt = 1;
        for(int i=0; i<10000; i++) {



            String startTime = "09-30";
            String endTime = "10-30";


            List<String> startDateTime =  collect_reduce.workTimeDate(startDate,endDate,startTime,endTime);

            startTime = "18-00";
            endTime = "20-00";

            List<String> endDateTime = collect_reduce.workTimeDate(startDate,endDate,startTime,endTime);

            int k=0;
            for (int j = 0; j < startDateTime.size(); j++) {

                if((Math.random()*100)>=20) {

                    Insert.insert(i + 1, k + 1, startDateTime.get(j), endDateTime.get(j));
                    System.out.println(cnt++);
                    k++;

                 }
            }

        }


    }
}