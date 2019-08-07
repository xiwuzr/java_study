package server.toStudent;

import dao.students.LinkMysql;
import model.Student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class ShowMyScore {
    public static List showMyScore(String uId){
        List<Student> stu=new ArrayList<>();
        LinkMysql lm=new LinkMysql();
        Connection conn=lm.createLink();
        String sql="select id,name,math,English from student where id=?";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,uId);
            ps.execute();
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Student a=new Student(rs.getString(1),rs.getString(2)
                        ,rs.getInt(3),rs.getInt(4));
                stu.add(a);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stu;
    }
    public static List showScore(){
        List<Student> stu=new ArrayList<>();
        LinkMysql lm=new LinkMysql();
        Connection conn=lm.createLink();
        String sql="select id,name,math,English from student order by sum desc";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.execute();
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                Student a=new Student(rs.getString(1),rs.getString(2)
                        ,rs.getInt(3),rs.getInt(4));
                stu.add(a);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stu;
    }

}
