public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
    	Map<String, List<String>> map = new HashMap<String, List<String>>();
    	for(String str : strs) {    		
    		char[] carr = str.toCharArray();  // �����ʰ���ĸ����
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
    		Collections.sort(curr); // ���б���������
    		res.add(curr);
    	}
    	return res;
    }
}
