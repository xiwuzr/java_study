package testJDBC.test01;

import java.sql.*;

public class Demo05 {
    public static void main(String[] args) {
        Connection conn=null;
        PreparedStatement pst=null;
        ResultSet rs=null;
        try {
            // Class.forName("com.mysql.jdbc.Driver");
            conn= DriverManager.getConnection("jdbc:mysql://localhost:3306/test?&serverTimezone=UTC",
                    "root","123456");
            System.out.println(conn);
            conn.setAutoCommit(false);

            Statement st=conn.createStatement();
            for(int i=0;i<20000;i++){
                st.execute(" insert into student (id,name,age,score) values ("+i+",'xez "+i+"',10,20)");
            }
            st.executeBatch();//批处理
            conn.commit();//提交
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
