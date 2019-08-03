package exercise;

public class leet_125 {
}


class Solution125 {
    public boolean isPalindrome(String s) {

        if(s.length()==0||s.length()==1){
            return true;
        }

        java.util.ArrayList tt=new java.util.ArrayList();
        int l=0,r=s.length()-1;
       for(int i=0;i<s.length();i++){
           char a=s.charAt(i);
           if((a>='A'&&a<='Z')||(a>='a'&&a<='z')||(a>='0'&&a<='9'))
           {
               tt.add(a);
           }
       }
       int i=0,j=tt.size()-1;
       int book=0;
       while(i!=j&&i<j){
           char ch1=(char)tt.get(i);
           char ch2=(char)tt.get(j);
           if((ch1>='0'&&ch1<='9')||(ch2>='0'&&ch2<='9')){
               if(ch1==ch2){
                   i++;j--;
                   continue;
               }else{
                   book=1;
                   break;
               }
           }else{
               if(ch1==ch2||ch1-ch2==32||ch2-ch1==32){
                   i++;
                   j--;
                   continue;
               }else{
                   book=1;
                   break;
               }
           }

       }
       if(book==1){
           return false;
       }else{
           return true;
       }
    }
}