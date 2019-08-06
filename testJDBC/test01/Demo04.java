package testJDBC.test01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Demo04 {
    public static void main(String[] args) {
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            Connection conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test?&serverTimezone=UTC",
                    "root","123456");
            System.out.println(conn);
            String sql="select id,name,age from student where id>?";
            PreparedStatement pst= conn.prepareStatement(sql);//使用占位符
            pst.setObject(1,2);
           ResultSet rs=pst.executeQuery();
           while(rs.next()){
               System.out.println(rs.getInt(1)+"---"+rs.getString(2)+"---"+rs.getInt(3));
           }
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }//没有释放资源！！！！
    }
}
