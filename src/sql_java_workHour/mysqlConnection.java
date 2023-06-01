package sql_java_workHour;

import java.sql.*;

public class mysqlConnection {
    public void insert(String sql) {

        String url = "jdbc:mysql://localhost:3306/test";
        String userName = "myjsw";
        String password = "1234";
        String table_name = "employee";
        PreparedStatement pstatement = null;
        Connection connection = null;
        try {
            // Driver 클래스 인스턴스 생성하여 반환함.
            // Driver 클래스 : Connetion 클래스의 연결 데이터를 Connetion 클래스에 전달함.
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 생성된 드라이버 인스턴스는 connection에 mysql 연결 정보를 제공
            connection = DriverManager.getConnection(url, userName, password);

            // statement류 객체는 connection 인스턴스에게서 전달받은 database를 통해 mysql database에 접근하여 query문 실행할 수 있다.
            pstatement = connection.prepareStatement(sql);

            pstatement.executeUpdate();


        } catch (SQLException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } finally {
            if (pstatement != null) {
                try {
                    pstatement.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }

            if (connection != null) {
                try {
                    connection.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
