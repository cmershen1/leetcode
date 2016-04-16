public class Solution {
    public int maxProduct(int[] nums) {
        int length = nums.length;
        if(length==0)
        	return 0;
        int[] dpmax = new int[length];
        int[] dpmin = new int[length];
        dpmax[0] = nums[0];
        dpmin[0] = nums[0];
        int max = dpmax[0];
        for(int i = 1;i<length;i++) {
        	dpmax[i] = max(nums[i],dpmax[i-1]*nums[i],dpmin[i-1]*nums[i]);
        	dpmin[i] = min(nums[i],dpmax[i-1]*nums[i],dpmin[i-1]*nums[i]);
        	if(dpmax[i]>max)
        		max=dpmax[i];
        }
        return max;
    }
    private int max(int a,int b,int c) {
		return a>b?(a>c?a:c):(b>c?b:c);
	}
    private int min(int a,int b,int c) {
		return a<b?(a<c?a:c):(b<c?b:c);
	}
}
