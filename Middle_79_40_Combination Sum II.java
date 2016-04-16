public class Solution {
    public  List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
    	List<List<Integer>> list = new ArrayList<List<Integer>>();
    	backtrack(list, new ArrayList<Integer>(), candidates, target, 0);
    	return list;
    }
    private  void backtrack(List<List<Integer>> list, List<Integer> sublist, int[] candidates, int target, int startPos) {
    	if(target == 0) {
    		list.add(new ArrayList<Integer>(sublist));
    		return;
    	}
    	else {
    		for(int i = startPos; i < candidates.length; i++) {
    		    int temp = candidates[i];
    			if(temp <= target) {
    				int iCount = 1;
    				while(i+1!=candidates.length&&candidates[i]==candidates[i+1]) {
    					iCount++;
    					i++;
    				}
    				for(int j = 1;j<=iCount;j++) {
    					for(int k = 0;k<j;k++)
    						sublist.add(temp);
	    				backtrack(list,sublist,candidates,target-temp*j,i+1);
	    				for(int k = 0;k<j;k++)
	    					sublist.remove(sublist.size()-1);
    				}
    			}
    		}
    	}
    }
}
