package exercise;

import java.util.Stack;

public class leet_13 {


    public static void main(String[] args) {
        Solution13 a=new Solution13();
        System.out.println(a.romanToInt("IIX"));
    }

}

class Solution13 {
    public int romanToInt(String s) {
        Stack <Character> sta=new Stack<>();
        int b=0;
        int top=0;
        char ch=' ';
        int num1=0,num2=0;
        for(int i=0;i<s.length();i++){
            sta.add((char)s.charAt(i));
        }
        for(int i=0;i<s.length();i++)
        {
            if(i==0)
            {
                top=num((char)sta.pop());
                b+=top;
                num1=top;
            }
            else
            {
                num2=num((char)sta.pop());
                if(num2<num1)
                {
                    b-=num2;
                }
                else{
                    b+=num2;
                }
                num1=num2;
            }
//            if(i==s.length()-1)
//            {
//                int cc=num((char)sta.pop());
//                if(cc<num1)
//                {
//                    b-=cc;
//                }
//                else{
//                    b+=cc;
//                }
//            }
//            else
//            {
//                num1=num((char)sta.pop());
//                num2=num((char)sta.peek());
//                if(num1>=num2){
//                    b+=num1;
//                }
//                else
//                {
//                    b-=num1;
//                }
//            }
        }
        return b;
    }
    public int num(char ch){
        int b=0;
        switch(ch){
            case 'I':b=1;break;
            case 'V':b=5;break;
            case 'X':b=10;break;
            case 'L':b=50;break;
            case 'C':b=100;break;
            case 'D':b=500;break;
            case 'M':b=1000;break;
        }
        return b;
    }

}