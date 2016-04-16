public class Solution {
	public  boolean canFinish(int numCourses, int[][] prerequisites) {
    	Map<Integer, Set<Integer>> adjList = new HashMap<Integer,Set<Integer>>();
    	int[] indegree = new int[numCourses];
    	for(int i = 0; i<numCourses;i++)
    		adjList.put(i, new HashSet<Integer>());
    	for(int[] edge : prerequisites) {
    		if(!adjList.get(edge[0]).contains(edge[1])) {
	    		adjList.get(edge[0]).add(edge[1]);
	    		indegree[edge[1]]++;
    		}
    	}
		int topoVertical = findZeroIndegree(indegree);
    	while(topoVertical!=-1) {
    		indegree[topoVertical] = -1; // -1 stands for visited
    		for(Integer vertical : adjList.get(topoVertical)) {
    			indegree[vertical]--;
    		}
    		adjList.remove(topoVertical);
    		topoVertical = findZeroIndegree(indegree);
    	}   	
    	return isAllVisited(indegree);
    }
	private int findZeroIndegree(int[] indegree) {
		for(int i = 0;i<indegree.length;i++)
			if(indegree[i]==0)
				return i;
		return -1;
	}
	private boolean isAllVisited(int[] indegree) {
		for(int i : indegree)
			if(i!=-1)
				return false;
		return true;
	}
}
