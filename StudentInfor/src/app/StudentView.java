package app;

import dao.students.LinkMysql;
import model.Student;
import server.toStudent.Change;
import server.toStudent.GetPwd;
import server.toStudent.ShowMyScore;
import java.util.*;

import java.sql.Connection;
import java.util.Scanner;

import static app.View.mineView;
import static java.lang.System.exit;

public class StudentView {
    public static void showMineList(String uId){
        Scanner sc=new Scanner(System.in);
        System.out.println("请选择操作：");
        System.out.println("1、查看我的成绩");
        System.out.println("2、查看排名情况");
        System.out.println("3、修改密码");
        System.out.println("4、退出登陆");
        System.out.println("______________");

        int a;
        a=sc.nextInt();
        switch(a){
            case 1:showOne(uId);showMineList(uId);//查看我的成绩；
            case 2:showAll();showMineList(uId);//查看排名情况；
            case 3:changePwd(uId);showMineList(uId);//修改密码
            case 4:mineView();//
            default://退出登陆
                System.out.println("输入有误，请重新输入");
                showMineList(uId);
        }
    }
    static void showOne(String uId){
        List<Student> stus=ShowMyScore.showMyScore(uId);
        System.out.println("学生ID\t\t学生姓名\t\t数学成绩\t\t英语成绩\t\t总成绩");
        for(int i=0;i<stus.size();i++){
            Student stu=stus.get(i);
            System.out.println(stu.getId()+"\t\t\t"+stu.getName()+"\t\t\t"+stu.getMath()+"\t\t\t"+stu.getEnglish()+"\t\t\t"+stu.getSum());
        }
        System.out.println();
    }
    static void showAll(){
        List<Student> stus=ShowMyScore.showScore();
        System.out.println("学生ID\t\t学生姓名\t\t数学成绩\t\t英语成绩\t\t总成绩");
        for(int i=0;i<stus.size();i++){
            Student stu=stus.get(i);
            System.out.println(stu.getId()+"\t\t\t"+stu.getName()+"\t\t\t"+stu.getMath()+"\t\t\t"+stu.getEnglish()+"\t\t\t"+stu.getSum());
        }
        System.out.println();
    }
    static void changePwd(String uId){
        Scanner sc=new Scanner(System.in);
        String oPwd="";
        System.out.println("请输入你的初始密码：");
        oPwd=sc.nextLine();
        String st=null;

        LinkMysql lm=new LinkMysql();
        Connection conn=lm.createLink();
        GetPwd cp=new GetPwd("student",conn);
        st=cp.getPwd(uId);

        if(oPwd.equals(st)){
            System.out.println("请输入你的新密码：");
            String pwd1=sc.nextLine();
            System.out.println("请确认你的密码：");
            String pwd2=sc.nextLine();
            if(pwd1.equals(pwd2)){

                //修改密码
                Change.changePwd(uId,pwd2,conn);


            }else{
                System.out.println("密码不一致！");
            }

        }else{
            System.out.println("密码输入错误！！！");
        }
    }

}
