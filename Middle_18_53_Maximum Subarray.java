public class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum = -9999999;
		int sumk = 0;
		for(int num : nums) {
			sumk = (sumk + num > num) ? sumk + num : num;
			maxsum = (maxsum > sumk) ? maxsum : sumk;
		}
		return maxsum;
    }
}
