public class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> subsets = new ArrayList<List<Integer>>();
        int count = 1<<nums.length;
        for(int j=0;j<count;j++) {
        	List<Integer> subset = new ArrayList<Integer>();
        	int index=0;
        	int i=j;
        	while(i!=0) {
        		if(i%2==1)
        			subset.add(nums[index]);
        		index++;
        		i=i>>1;
        	}
        	subsets.add(subset);
        }
        return subsets;
    }
}
