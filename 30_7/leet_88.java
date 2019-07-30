package exercise;

public class leet_88 {
}

class Solution88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(m==0){
            nums1=nums2;
        }
        while(m>0&&n>0){
            if(nums1[m-1]<nums2[n-1]){
                nums1[m+n-1]=nums2[n-1];
                n--;
            }
            else{
                nums1[n+m-1]=nums1[m];
                m--;
            }
        }
        if(m==0){
            while(n>0){
                nums1[n-1]=nums2[n];
                n--;
            }
        }
        if(n==0){
            while(m>0){
                nums1[m-1]=nums1[m];
                m--;
            }
        }
    }
}
