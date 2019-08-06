package testJDBC.test01;

import java.sql.*;

/**
 * 与数据库建立联系
 *test?&serverTimezone=UTC
 */
public class Demo01 {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            long start=System.currentTimeMillis();
            Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/mydb?&serverTimezone=UTC",
                    "root","123456");
            long end=System.currentTimeMillis();
            System.out.println(conn);
            System.out.println("用时："+(end-start));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
