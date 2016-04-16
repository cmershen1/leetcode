public class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> list = new LinkedList<List<Integer>>();
        for(int i = 0;i<nums.length-2;i++) {
        	if(i>0 && nums[i]==nums[i-1]) 
        		continue;
        	int j=i+1,k=nums.length-1;
        	while(j<k) {
        		if(j>i+1 && nums[j]==nums[j-1]) {
        			j++;
        			continue;
        		}
        		if(k<nums.length-1&&nums[k]==nums[k+1]) {
        			k--;
        			continue;
        		}
        		int sum = nums[i]+nums[j]+nums[k];
        		if(sum==0) {
        			List<Integer> sublist = new LinkedList<Integer>();
        			sublist.add(nums[i]);
        			sublist.add(nums[j]);
        			sublist.add(nums[k]);
        			list.add(sublist);
        			j++;
        		}
        		else if(sum>0) {
        			k--;
        		}
        		else {
        			j++;
        		}
        			
        	}
        }
        return list;
    }
}
