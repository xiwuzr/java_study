package server.toStudent;

import java.sql.*;

public class GetPwd {
    private String tableName;
    Connection conn=null;

    public GetPwd(String tableName, Connection conn) {
        this.tableName = tableName;
        this.conn = conn;
    }

    public GetPwd(){}

    public String getPwd(String id){
        String str="";
        PreparedStatement ps;
        String sql="select pwd from "+tableName+" where id=?";
        try {
            ps=conn.prepareStatement(sql);
            ps.setString(1,id);
            ps.execute();
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                str=rs.getString(1);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return str;

    }

}
