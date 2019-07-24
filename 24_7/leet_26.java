package exercise;
import java.util.*;
public class leet_26 {
    public static void main(String[] args) {
        int[] a=new int[]{1,12};
        Solution26 aa=new Solution26();

        System.out.println(aa.removeDuplicates(a));
    }


}
class Solution26 {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0)
        {
            return 0;
        }
        int i=0,j=nums.length-1;
        while(i<j)
        {
            while(i<j&&nums[i]!=nums[i+1])
            {
                i++;
            }
            while(i<j&&nums[j]==nums[j-1])
            {
                j--;
            }
            if(i<j)
            {
                int k;
                k=nums[i];
                nums[i]=nums[j];
                nums[j]=k;
                j--;
            }


        }
        int n=0;
        if(i==j)
        {
            n = j + 1;
        }
        else
        {
            n=1;
        }
        Arrays.sort(nums,0,n);
        for(int kk:nums)
        {
            System.out.print(kk+" ");
        }
        System.out.println("\n");
        return n;
    }
}
