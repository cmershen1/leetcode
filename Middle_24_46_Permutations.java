public class Solution {
    public  List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        boolean[] visited = new boolean[nums.length];
        backtrack(list,new ArrayList<Integer>(),nums,visited,nums.length);
        return list;
    }
    private  void backtrack(List<List<Integer>> list,List<Integer> sublist,int[] nums,boolean[] visited,int visitCount)
    {
    	if(visitCount == 0) 
    		list.add(new ArrayList<Integer>(sublist));
    	else
    	{
    		for(int i=0;i<nums.length;i++) {
    			if(visited[i] == false) {
    				visited[i] = true;
    				sublist.add(nums[i]);
    				backtrack(list,sublist,nums,visited,visitCount-1);
    				sublist.remove(sublist.size()-1);
    				visited[i] = false;
    			}    				
    		}
    	}
    }
}
