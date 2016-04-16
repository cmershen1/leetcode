public class Solution {
    public static int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        int min = 9999999;
        int length = nums.length-1;
        for(int middle = 0;middle < length; middle++) {       	
        	int i = 0,j = length, error = 9999999;
        	while(i<middle && j>middle) {
        		error = nums[i] + nums[middle] + nums[j] - target;        		
        		if(error == 0)
        			return target;
        		else if (error > 0)
        			j--;
        		else
        			i++;
        		min=Math.abs(error)<Math.abs(min)?error:min;
        	}
        	        	
        }
        return target+min;
    }
}
