package testJDBC.test01;

import java.io.File;
import java.io.FileReader;
import java.sql.*;

public class Demo06 {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test?&serverTimezone=UTC",
                    "root","123456");
            System.out.println(conn);
            pst=conn.prepareStatement("insert into student (inf) value (?)");
            pst.setClob(1,new FileReader(new File("D:\\javaFileTest\\ss.txt")));
            pst.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if(rs!=null)
                    rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(pst!=null)
                    pst.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
            try {
                if(conn!=null)
                    conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }

        }
    }
}
