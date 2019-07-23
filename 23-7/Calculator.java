package Java.month7;

import java.util.Stack;

public class Calculator {
    public static void main(String[] args) {
        Stack numStack=new Stack();
        Stack operStack=new Stack();
        String expr="(20+(5-3)*2-1)*3";
        int index=0;//记录操作位置
        int num1=0,num2=0;
        String str="";
        char ch=' ';
        while(true){
            ch=expr.substring(index,index+1).charAt(0);
            if(isoper(ch)||ch=='('||ch==')')//如果是运算符
            {
                if(operStack.isEmpty()||ch=='(')
                {
                    //如果栈是空的直接加进去
                    operStack.add(ch);
                }
                //如果栈不为空
                else {
                    if(ch==')')
                    {
                        while((char)operStack.peek()!='(')
                        {
                            num1=(int)numStack.pop();
                            num2=(int)numStack.pop();
                            numStack.add(cal(num1,num2,(char)operStack.pop()));
                        }
                        operStack.pop();
//                        System.out.println(operStack);//******************************
//                        System.out.println(numStack);

                    }
                    else
                    {
                        //当前符号的优先级大于栈顶的优先级
                        if(bos(ch)>bos((char)operStack.peek())||(char)operStack.peek()=='(')
                        {
                            operStack.add(ch);
                        }
                        else {
                            while(bos(ch)<=bos((char)operStack.peek())&&(char)operStack.peek()!='('/*&&numStack.size()>=2*/)
                            {
//                                System.out.println("111111");
                                num1=(int)numStack.pop();
                                num2=(int)numStack.pop();
                                numStack.add(cal(num1,num2,(char)operStack.pop()));

                                if(operStack.isEmpty()||numStack.isEmpty()||(char)operStack.peek()=='(')
                                {
                                    break;
                                }
                            }
                            operStack.add(ch);
                        }
                    }
                }

            }
            else
            {
                //多位数

                str+=ch;
                if(index==expr.length()-1)
                {
                    numStack.add(Integer.parseInt(str));
                }
                else
                {
                    // ch=expr.substring(index,index+1).charAt(0);
                    char ch1=' ';
                    ch1=expr.substring(index+1,index+2).charAt(0);
                    if(isoper(ch1)||ch1==')')
                    {
                        numStack.add(Integer.parseInt(str));
                        str="";
                    }





//                System.out.println(ch-48+"*");//vkuvkukuv*******************************
                }
                //numStack.add(ch-48);


            }
            index++;
            if(index>=expr.length())
            {
                break;
            }
        }
//        System.out.println(numStack);//**********************************************
        while(true){
            if(operStack.isEmpty())
            {
                break;
            }else{
                num1=(int)numStack.pop();
//                System.out.println(numStack.size()+"****");
                num2=(int)numStack.pop();
//                System.out.println(numStack.size());
                numStack.add(cal(num1,num2,(char)operStack.pop()));
//                System.out.println(numStack.size());
            }
        }
        System.out.println(numStack.pop());
//        System.out.println(numStack.isEmpty());
    }
    public static boolean isoper(char a)
    {
        return a=='+'||a=='-'||a=='*'||a=='/' ;
    }
    public static int bos(char ch){
        int a=0;
        if(ch=='+'||ch=='-')
        {
            a=0;
        }else{
            a=1;
        }
        return a;
    }
    public static int cal(int num1,int num2,char ch)
    {
        int a=0;
        switch (ch){
            case '+':a=num1+num2;break;
            case '-':a=num2-num1;break;
            case '*':a=num2*num1;break;
            case '/':a=num2/num1;break;
        }
        return a;
    }
}
