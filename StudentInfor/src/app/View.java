package app;

import java.util.Scanner;
import server.toStudent.*;
import static java.lang.System.exit;
import static server.toStudent.LoginStudent.logStudent;
import static server.toTeacher.LoginTeacher.logTeacher;

public class View {
    static void mineView(){
        Scanner sc=new Scanner(System.in);

        System.out.println("__________________________________");
        System.out.println("       学生信息管理系统             ");
        System.out.println("        1、进入学生端               ");
        System.out.println("        2、进入老师端               ");
        System.out.println("          3、退出                  ");
        System.out.println("___________________________________");

        int a;
        a=sc.nextInt();
        switch(a){
            case 1:logStudent();break;//进入学生端；
            case 2:logTeacher();break;//进入老师端；
            case 3:exit(1);
            default:
                System.out.println("输入有误，请重新输入");
        }
    }
    public static void main(String[] args) {
        mineView();
    }
}


