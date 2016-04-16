public class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
    	List<List<Integer>> list=new ArrayList<List<Integer>>();
    	backtrack(list,new ArrayList<Integer>(),k,n,1);
        return list;
    }
    private void backtrack(List<List<Integer>> list,List<Integer> sublist,int k,int n,int start) {
    	if(k == 1 ) {
    	    if(n < 10) {
        		List<Integer> sublist2=new ArrayList<Integer>(sublist);
        		sublist2.add(n);
        		list.add(sublist2);
        		return;
    	    }
    	}
    	else {
    		for(int i=start;i<(double)n/(double)k;i++) {
    			sublist.add(i);
    			backtrack(list,sublist,k-1,n-i,i+1);
    			sublist.remove(sublist.size()-1);
    		}
    	}    	
    }
}
