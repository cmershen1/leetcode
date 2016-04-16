public class Solution {
    public void moveZeroes(int[] nums) {
        int temp=0;
        for(int i=0;i<nums.length;i++) {
            if(nums[i]!=0)
                nums[temp++]=nums[i];
        }
        for(;temp<nums.length;temp++) {
        	nums[temp]=0;
        }
    }
}
