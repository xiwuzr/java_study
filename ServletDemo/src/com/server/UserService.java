package com.server;

import com.User;
import com.dao.UserDao;

import java.util.List;

public class UserService {
    UserDao ud=new UserDao();
    //检查信息
    public User loginCheckService(String uname, String pwd) {
        User user = ud.loginCheck(uname,pwd);
        return user;
    }
    //查看所有人
    public List<User> getAll(){
        return ud.getAll();
    }
    //添加用户
    public void addUser(User user){
        ud.addUser(user);
    }
    public void changeUser(int id,String name,String pwd){
        ud.changeUser(id,name,pwd);
    }
    public void del(int id){
        ud.del(id);
    }
    public User get(int id){
        return ud.get(id);
    }
}
