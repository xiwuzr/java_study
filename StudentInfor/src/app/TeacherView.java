package app;

import dao.students.LinkMysql;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

import static app.View.mineView;


public class TeacherView {

    public static void showMineList(String uId) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请选择操作：");
        System.out.println("1、查看所有排名");
        System.out.println("2、添加学生信息");
        System.out.println("3、删除学生信息");
       // System.out.println("4、修改密码");
        System.out.println("4、退出登陆");
        System.out.println("______________");
        int a;
        a=sc.nextInt();
        switch(a){
            case 1:app.StudentView.showAll();showMineList(uId);//查看所有排名；
            case 2:addStudent();showMineList(uId);//添加学生信息；
            case 3:delStudent();showMineList(uId);//删除学生信息
            //case 4:;//修改密码
            case 4:mineView();
            default:
                System.out.println("输入有误，请重新输入");
                showMineList(uId);
        }
    }
   static void addStudent(){
       Scanner sc = new Scanner(System.in);
       String id,pwd,name;
       int math,English;
       System.out.println("请输入学生ID：");
       id=sc.nextLine();
       System.out.println("请输入学生姓名：");
       name=sc.nextLine();
       System.out.println("请设置初始密码：");
       pwd=sc.nextLine();
       System.out.println("请输入学生数学成绩：");
       math=sc.nextInt();
       System.out.println("请输入学生英语成绩：");
       English=sc.nextInt();

       LinkMysql lm=new LinkMysql();
       Connection conn=lm.createLink();
       String sql="insert into student value (?,?,?,?,?,?)";
       try {
           PreparedStatement ps=conn.prepareStatement(sql);
           ps.setObject(1,id);
           ps.setObject(2,pwd);
           ps.setObject(3,name);
           ps.setObject(4,math);
           ps.setObject(5,English);
           ps.setObject(6,math+English);
           ps.execute();
           System.out.println("操作成功");
       } catch (SQLException e) {
           e.printStackTrace();
       }
   }
   static void delStudent(){
       Scanner sc = new Scanner(System.in);
       LinkMysql lm=new LinkMysql();
       Connection conn=lm.createLink();
       System.out.println("请输入要删除学生的id：");
       String id=sc.nextLine();
       String sql="delete from student where id=?";
       try {
           PreparedStatement ps=conn.prepareStatement(sql);
           ps.setObject(1,id);
           ps.execute();
           System.out.println("删除完成");
       } catch (SQLException e) {
           e.printStackTrace();
       }


   }
}
