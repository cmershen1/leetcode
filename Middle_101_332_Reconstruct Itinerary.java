public class Solution {
    LinkedList<String> res;
    Map<String, PriorityQueue<String>> mp;
    
    public List<String> findItinerary(String[][] tickets) {
        res = new LinkedList<String>();
        mp = new HashMap<String, PriorityQueue<String>>();
        for (String[] ticket : tickets) {
            if (!mp.containsKey(ticket[0])) {
                mp.put(ticket[0], new PriorityQueue<String>());
            }
            mp.get(ticket[0]).offer(ticket[1]);
        }
        dfs("JFK");
        return res;
    }
    
    public void dfs(String cur) {
        while (mp.containsKey(cur) && !mp.get(cur).isEmpty()) {
            dfs(mp.get(cur).poll());
        }
        res.addFirst(cur);
    }
}
