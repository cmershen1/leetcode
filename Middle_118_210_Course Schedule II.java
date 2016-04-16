public class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
    	if(numCourses==1)
    		return new int[1];
        Map<Integer, Set<Integer>> adjList = new HashMap<Integer,Set<Integer>>();
    	int[] indegree = new int[numCourses];
    	for(int i = 0; i<numCourses;i++)
    		adjList.put(i, new HashSet<Integer>());
    	for(int[] edge : prerequisites) {
    		if(!adjList.get(edge[1]).contains(edge[0])) {
	    		adjList.get(edge[1]).add(edge[0]);
	    		indegree[edge[0]]++;
    		}
    	}
    	int[] order = new int[numCourses];
    	int i=0;
    	int topoVertical = findZeroIndegree(indegree);
    	while(topoVertical!=-1) {   		
    		indegree[topoVertical] = -1;
    		for(Integer vertical : adjList.get(topoVertical)) {
    			if(indegree[vertical]!=-1)
    				indegree[vertical]--;
    		}
    		adjList.remove(topoVertical);
    		order[i++]=topoVertical;
    		topoVertical = findZeroIndegree(indegree);
    	}
    	if(i==numCourses)
    		return order;
    	else
    		return new int[0];
    }

	private int findZeroIndegree(int[] indegree) {
		for(int i = 0;i<indegree.length;i++)
			if(indegree[i]==0) {
				return i;
			}
		return -1;
	}
}
