package exercise;

public class leet67 {
    public static void main(String[] args) {
        Solution67 aa=new Solution67();
        System.out.println(aa.addBinary("11111111111111011111","1010101010111111111111111111111111111111"));
    }                                                                      // 0                   111111111111111011110
}
class Solution67 {
    public String addBinary(String a, String b) {
        int len_a=a.length();
        int len_b=b.length();
        int len_s=Math.max(len_a,len_b);
        char sums[]=new char[len_s+1];
        int sum=0;
        for(int i=len_s;i>=0;i++)
        {

            if(len_b==0||len_a==0)
            {
                break;
            }
            else
            {
                int a1=a.charAt(len_a-1)-'0';
                int a2=b.charAt(len_b-1)-'0';
                int a3=a1+a2+sum;
                if(a3>1){
                    sum=1;
                }else
                    sum=0;
                sums[len_s]=(char)(a3%2+'0');
                len_s--;
                len_a--;
                len_b--;
            }
        }
        if(len_a==0)
        {
            while(len_b!=0){
                int a2=b.charAt(len_b-1)-'0';
                int a3=a2+sum;
                if(a3>1){
                    sum=1;
                }else
                    sum=0;
                sums[len_s]=(char)(a3%2+'0');
                len_b--;
                len_s--;
            }
        }
        if(len_b==0)
        {
            while(len_a!=0){
                int a1=a.charAt(len_a-1)-'0';
                int a3=a1+sum;
                if(a3>1){
                    sum=1;
                }else
                    sum=0;
                sums[len_s]=(char)(a3%2+'0');
                len_a--;
                len_s--;
            }
        }
        sums[0]=(char)(sum+'0');
        if(sums[0]=='0')
        {
            return new String(sums,1,sums.length-1);
        }else{
            return new String(sums);
        }
    }
}