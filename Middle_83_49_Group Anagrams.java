public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    	Map<String, List<String>> map = new HashMap<String, List<String>>();
    	for(String str : strs) {    		
    		char[] carr = str.toCharArray();  // 将单词按字母排序
    		Arrays.sort(carr);
    		String key = new String(carr);
    		List<String> list = map.get(key);
    		if(list == null) {
    			list = new ArrayList<String>();
    		}
    		list.add(str);
    		map.put(key, list);
    	}
    	List<List<String>> res = new ArrayList<List<String>>();
    	for(String key : map.keySet()) {
    		List<String> curr = map.get(key);
    		Collections.sort(curr); // 将列表按单词排序
    		res.add(curr);
    	}
    	return res;
    }
}
