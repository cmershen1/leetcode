public class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	backtrack(list, new ArrayList<Integer>(), candidates, target, 0);
    	return list;
    }
    private void backtrack(List<List<Integer>> list, List<Integer> sublist, int[] candidates, int target, int startPos) {
    	if(target == 0) {
    		list.add(new ArrayList<Integer>(sublist));
    	}
    	else {
    		for(int i = startPos; i < candidates.length; i++) {
    		    int temp = candidates[i];
    			if(temp <= target) {
    				sublist.add(temp);
    				backtrack(list,sublist,candidates,target-temp,i);
    				sublist.remove(sublist.size()-1);
    			}
    		}
    	}
    }
}
