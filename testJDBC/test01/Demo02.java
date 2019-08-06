package testJDBC.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Demo02 {
    public static void main(String[] args) {
        try {
           // Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test?&serverTimezone=UTC",
                    "root","123456");
            System.out.println(conn);
            Statement stmt=conn.createStatement();
            String str=//" insert into student (id,name,age,score) values (2,'xez',15,97)";
                    "delete from student where id>10";
            stmt.execute(str);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



