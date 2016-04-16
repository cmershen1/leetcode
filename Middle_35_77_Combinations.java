public class Solution {
    public static List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        backtrack(list,new ArrayList<Integer>(),n,k,1,n);
        return list;
    }
    private static void backtrack(List<List<Integer>> list, List<Integer> sublist, int n, int k, int start,int totaln) {
    	if(k == 0) 
    		list.add(new ArrayList<Integer>(sublist));
    	else {
    		for(int i = start;i < start + n;i++) {
    			sublist.add(i);
    			backtrack(list,sublist,totaln-i,k-1,i+1,totaln);
    			sublist.remove(sublist.size()-1);
    		}
    	}
    }
}
