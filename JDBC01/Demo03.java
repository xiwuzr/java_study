package testJDBC.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

/**
 * 占位符的应用
 *
 */
public class Demo03 {
    public static void main(String[] args) {
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test?&serverTimezone=UTC",
                    "root","123456");
            System.out.println(conn);
//            Statement stmt=conn.createStatement();
//            String str=" insert into student (id,name,age,score) values (2,'xez',15,97)";
//            stmt.execute(str);
            PreparedStatement pst= conn.prepareStatement
                    (" insert into student (id,name,age,score) values (4,?,?,?)");
            //pst.setObject();使用于所有类型
            pst.setString(1,"popo");
            pst.setInt(2,16);
            pst.setInt(3,100);
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
