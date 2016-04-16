public class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	Arrays.sort(nums);
    	for(int i = 0;i<nums.length-3;i++) {
    		for(int j = nums.length-1;j-i>=3;j--) {
    			int sum1 = nums[i]+nums[j];
    			int m1 = i+1,m2 = j-1;
    			while(m1<m2) {
    				int sum = sum1+nums[m1]+nums[m2];
    				if(sum == target) {
    					List<Integer> sublist = new ArrayList<Integer>();
    					sublist.add(nums[i]);
    					sublist.add(nums[m1]);
    					sublist.add(nums[m2]);
    					sublist.add(nums[j]);
    					if(!list.contains(sublist))
    					    list.add(sublist);
                        m1++;
    				}
    				else if(sum > target)
    					m2--;
    				else // sum < target
    					m1++;
    			}
    		}
    	}
    	return list;
    }
}  
