package exercise;

public class leet_70 {

}

class Solution70 {
    public int climbStairs(int n) {
       // return size1(n);//递归方法
        return size2(n);

    }
    public int size2(int n){
        int[]aa=new int[n+1];
        if(n==0||n==1)
        {
            return 1;
        }
        if(n==2)
        {
            return 2;
        }
        aa[0]=1;
        aa[1]=1;
        aa[2]=2;
        for(int i=3;i<=n;i++){
            aa[i]=aa[i-1]+aa[i-2];
        }

        return aa[n];
    }

    public int size1(int n){
        if(n==1)
        {
            return 1;
        }else if(n==2){
            return 2;
        }else if(n==0){
            return 0;
        }else
        {
            return 1+size1(n-1)+2+size1(n-2);
        }
    }
}
