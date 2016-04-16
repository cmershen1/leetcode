public class Solution {    
    public  List<Integer> findMinHeightTrees(int n, int[][] edges) {
    	Map<Integer, Set<Integer>> adjList = new HashMap<Integer,Set<Integer>>();
    	boolean[] isLeaf = new boolean[n];
    	int[] degrees = new int[n];
    	int nextVertical = 0, currentVerticals = n;
    	for(int i = 0; i<n;i++)
    		adjList.put(i, new HashSet<Integer>());
    	for(int[] edge : edges) {
    		adjList.get(edge[0]).add(edge[1]);
    		degrees[edge[0]]++;
    		adjList.get(edge[1]).add(edge[0]);
    		degrees[edge[1]]++;
    	}
    	while(currentVerticals > 2) {
    		for(int i = 0;i<n;i++) {
    			if(degrees[i]==1) {
    				isLeaf[i] = true;
    			}
    		}
    		for(int i = 0;i<n;i++) {
    			if(isLeaf[i]) {
    				nextVertical = adjList.get(i).iterator().next();
    				degrees[i]--;
    				degrees[nextVertical]--;
    				adjList.get(i).remove(nextVertical);
    				if(degrees[i]==0)
    					currentVerticals--;
    				adjList.get(nextVertical).remove(i);
    				if(degrees[nextVertical]==0)
    					currentVerticals--;
    				isLeaf[i] = false;
    			}
    		}
    	}
    	List<Integer> list = new ArrayList<Integer>();
    	for(Integer key : adjList.keySet()) {
    		if(adjList.get(key).size()!=0)
    			list.add(key);
    	}
    	if(n==1)
    	    list.add(0);
    	if(currentVerticals==0)
			list.add(nextVertical);
    	return list;
    }
}
这里给出discuss中一位大神给出的算法，思路是一样的，但省略了很多循环：
public class Solution {
    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
        if (n == 1) 
            return Collections.singletonList(0);
        List<Set<Integer>> adj = new ArrayList<>(n);
        for (int i = 0; i < n; i++) 
            adj.add(new HashSet<>());
        for (int[] edge : edges) {
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }
    
        List<Integer> leaves = new ArrayList<>();
        for (int i = 0; i < n; i++)
            if (adj.get(i).size() == 1) leaves.add(i);
    
        while (n > 2) {
            n -= leaves.size();
            List<Integer> newLeaves = new ArrayList<>();
            for (int i : leaves) {
                int j = adj.get(i).iterator().next();
                adj.get(j).remove(i);
                if (adj.get(j).size() == 1) newLeaves.add(j);
            }
            leaves = newLeaves;
        }
        return leaves;
    }
}
