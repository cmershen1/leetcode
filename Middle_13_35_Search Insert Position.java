public class Solution {
    public int searchInsert(int[] nums, int target) {
        int start = 0,end = nums.length - 1;
        int mid = 0;
        while(start <= end) {
        	mid = (start + end) / 2;
        	if(nums[mid] == target)
        		return mid;
        	else if(nums[mid] > target) { //target lies between start and mid
        		if(mid == 0 || nums[mid - 1] < target)
        			return mid;
        		else
        			end=mid-1;
        	}
        	else { //target lies between mid and end
        		if(mid == nums.length-1 || nums[mid + 1] > target)
        			return mid+1;
        		else
        			start=mid+1;
        	}       		
        }
		return mid;	        
    }
}
