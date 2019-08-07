package server.toStudent;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Change {
    public static void changePwd(String uId,String pwd2,Connection conn){
        String sql="update student set  pwd=? where id=?";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setObject(1, pwd2);
            ps.setObject(2, uId);
            ps.execute();
            System.out.println("修改成功");
        } catch (SQLException e) {

            System.out.println("修改失败");
            e.printStackTrace();
        }

    }

}
