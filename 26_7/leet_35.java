package exercise;

public class leet_35 {
}

class Solution35 {
    public int searchInsert(int[] nums, int target) {
        int i = 0;
        int k=0;
        for (k = 0; k < nums.length; k++) {
            if ( nums[ k ] == target ) {
                return k;
            }else if(nums[k]<target)
            {
                continue;
            }else{
                break;
            }
        }
        return k;

    }
}
