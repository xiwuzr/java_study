package exercise;

public class leet_27 {
    public int removeElement(int[] nums, int val) {
        if(nums.length==0)
        {
            return 0;
        }
        int a=0;
        int i=0,j=nums.length-1;
        while(i!=j&&i<j)
        {

            while(nums[j]==val&&i<j)
            {
                j--;
            }
            while(nums[i]!=val&&i<j)
            {
                i++;
            }

            if(i!=j)
            {
                int k=nums[i];
                nums[i]=nums[j];
                nums[j]=k;
            }
        }
        if(nums[i]==val)
        {
            return i;
        }
        else
        {
            return i+1;
        }
    }

    public static void main(String[] args) {
        leet_27 ss=new leet_27();
        int num[]=new int[]{1,2,2,4};
        int aa=2;
        System.out.println(ss.removeElement(num,aa));
    }


}
