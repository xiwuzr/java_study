package exercise;

public class leet_136 {
}
class Solution136 {
    /**
     * 位运算，按位取反，异或操作"^"
     * @param nums
     * @return
     */
    public int singleNumber(int[] nums) {
        int sum=0;
        for(int num:nums){
            sum ^=num;
        }
        return sum;
    }
}