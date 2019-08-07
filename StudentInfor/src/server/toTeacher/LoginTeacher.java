package server.toTeacher;

import app.TeacherView;
import dao.students.LinkMysql;

import java.sql.Connection;
import java.util.Scanner;

public class LoginTeacher {
    public static void logTeacher(){
        String uId,uPwd;
        Scanner sc=new Scanner(System.in);
        System.out.println("-------请输入你的id：");
        uId=sc.nextLine();
        System.out.println("-------请输入密码：");
        uPwd=sc.nextLine();
        if(isUsuer(uId,uPwd)){
            System.out.println("登陆成功");
            TeacherView.showMineList(uId);
        }else{
            System.out.println("登陆失败，密码错误");
        }


    }

    static boolean isUsuer(String uId,String pwd){
        String st=null;
        LinkMysql lm=new LinkMysql();
        Connection conn=lm.createLink();

        GetPwdT gpt=new GetPwdT("teacher",conn);
        st=gpt.getPwd(uId);
        if(st==""){
            System.out.println("没有此用户");
        }
        return pwd.equals(st);

    }
}
