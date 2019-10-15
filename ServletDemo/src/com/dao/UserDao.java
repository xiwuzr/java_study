package com.dao;

import com.User;
import com.Util.JDBCUtil;
import org.omg.CORBA.Request;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {
    static Connection conn = JDBCUtil.getConnection();
    public User loginCheck(String uname, String pwd){
        String sql = "select * from user where name=? and pwd = ?";
        ResultSet rs = null;
        User user = null;
        try {
            if(conn==null){
                System.out.println("111111111111111");
            }
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,uname);
            ps.setString(2,pwd);
            rs = ps.executeQuery();
            while (rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setUname(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return user;
    }

    public List<User> getAll(){
        String sql = "select * from user";
        ResultSet rs = null;
        List<User> list = null;
        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            rs = ps.executeQuery();
            if (rs != null) {
                list = new ArrayList<>();

                while (rs.next()) {
                    User user = new User();
                    user.setId(rs.getInt("id"));
                    user.setUname(rs.getString("name"));
                    list.add(user);
                }
            }
            System.out.println(list);
            System.out.println(list.size());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return list;
    }

    public void addUser(User user){
        String sql="insert into user values(?,?,?)";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,user.getId());
            ps.setString(2,user.getUname());
            ps.setString(3,user.getPwd());
            ps.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void changeUser(int id,String name,String pwd){
        String sql="update user set name=?,pwd=? where id=?";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setString(1,name);
            ps.setString(2,pwd);
            ps.setInt(3,id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
    public void del(int id){
        String sql="delete from user where id=?";
        try {
            PreparedStatement ps=conn.prepareStatement(sql);
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public User get(int id) {
        String sql = "select * from user where id=?";
        PreparedStatement ps;
        List<User> list=null;
        ResultSet rs=null;

        {
            try {
                ps = conn.prepareStatement(sql);
                ps.setInt(1,id);
                rs=ps.executeQuery();
                if(rs!=null){
                    list=new ArrayList<>();
                    while(rs.next()){
                        User user=new User(rs.getInt("id"),rs.getString("name"),rs.getString("pwd"));
                        list.add(user);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        if(list!=null)
            return list.get(0);
        else
            return null;
    }

}
