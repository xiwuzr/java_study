package exercise;

public class leet_167 {
}

class Solution167 {
    public int[] twoSum(int[] numbers, int target) {
        int a=0;int b=numbers.length-1;
        while(a<b&&a!=b){
            if(numbers[a]+numbers[b]>target){
                b--;
            }
            if(numbers[a]+numbers[b]<target){
                a++;
            }
            if(numbers[a]+numbers[b]==target){
                break;
            }
        }
        return new int[]{a+1,b+1};

    }
}
