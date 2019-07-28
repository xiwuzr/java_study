package exercise;

//import java.math.BigInteger;

public class leet_66 {
    public static void main(String[] args) {
        Solution66 so=new Solution66();
        int a[]=(so.plusOne(new int[]{9,9,9}));
        for(int kk:a){
            System.out.println(kk);
        }
    }
}

class Solution66 {
    public int[] plusOne(int[] digits) {
        StringBuilder a=new StringBuilder();
        for(int kk:digits){
            a.append((int)kk);
        }
        String k=a.toString();
        java.math.BigInteger in=new java.math.BigInteger(k);
        java.math.BigInteger c=new java.math.BigInteger("1");
        in=in.add(c);
        String st=in.toString();
        int aa[]=new int[st.length()];
        for(int i=0;i<st.length();i++){
            aa[i]=st.charAt(i)-'0';
        }
        return aa;
    }
}
