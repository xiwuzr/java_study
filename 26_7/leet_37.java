package exercise;

public class leet_37 {
    public static void main(String[] args) {
        Solution37 s=new Solution37();
        System.out.println(s.countAndSay(5));
    }
}

class Solution37 {
    public String countAndSay(int n) {
        if(n==1)
        {
            return "1";
        }
        String aa=new String("1");
        char a[]=aa.toCharArray();
        for(int i=1;i<n;i++)
        {
            StringBuilder sb1=new StringBuilder();
            StringBuilder sb2=new StringBuilder();

            for(int k=0;k<a.length;k++)
            {
                System.out.println(a.length);
                if(k==0||a[k-1]==a[k])
                {
                    sb2.append(a[k]);
                }
                else
                {
                    char ch1=(char)(sb2.length()+48);
                    char ch2=sb2.charAt(0);
                    sb1.append(ch1).append(ch2);
                    sb2.delete(0,sb2.length());
                    sb2.append(a[k]);
                }
            }
            char ch1=(char)(sb2.length()+48);
            char ch2=sb2.charAt(0);
            sb1.append(ch1).append(ch2);
            sb2.delete(0,sb2.length());
            a=sb1.toString().toCharArray();
            sb1.delete(0,sb1.length());
        }
        return new String(a);
    }
}
