package server.toStudent;

import app.StudentView;
import dao.students.LinkMysql;

import java.sql.Connection;
import java.util.Scanner;

public class LoginStudent {
    public static void logStudent()
    {
        String uId,uPwd;
        Scanner sc=new Scanner(System.in);
        System.out.println("-------请输入你的id：");
        uId=sc.nextLine();
        System.out.println("-------请输入密码：");
        uPwd=sc.nextLine();
        if(isUsuer(uId,uPwd)){
            System.out.println("登陆成功！");
            StudentView.showMineList(uId);

        }else{
            System.out.println("用户名或密码错误，检查后重新登陆");
        }
    }



    //验证登陆：
    static boolean isUsuer(String Id,String pwd){
        //和数据库建立联系
        String st=null;
        LinkMysql lm=new LinkMysql();
        Connection conn=lm.createLink();

        GetPwd cp=new GetPwd("student",conn);
        st=cp.getPwd(Id);
        if(st==""){
            System.out.println("没有此用户");
        }
        return pwd.equals(st);
    }

}
