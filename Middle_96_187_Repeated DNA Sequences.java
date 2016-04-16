方法一：
public class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
    	List<String> list = new ArrayList<String>();
    	HashMap<String, Integer> dict = new HashMap<String, Integer>();
    	for(int i = 0;i<=s.length()-10;i++) {
    		String substr = s.substring(i,i+10);
    		if(!dict.containsKey(substr)) {
    			dict.put(substr, 1);
    		}
    		else {
    			int value = dict.get(substr) + 1;
    			if(value>2)
    			    continue;
    			dict.put(substr, value);
    			if(value == 2)
    				list.add(substr);
    		}
    	}
    	return list;
    }
}
方法二：
public class Solution {
    public List<String> findRepeatedDnaSequences(String DNA) {
        ArrayList<String> res = new ArrayList<String>();
        if(DNA.length()<10)    return res;
        HashSet<Integer> once = new HashSet<Integer>();
        HashSet<Integer> twice = new HashSet<Integer>();
        int[] map = new int[26];
        map['A'-'A'] = 0;
        map['C'-'A'] = 1;
        map['G'-'A'] = 2;
        map['T'-'A'] = 3;
        int enc = 0;
        for(int i=0; i<9; ++i){
            enc <<=2;
            enc |= map[DNA.charAt(i)-'A'];
        }
        for(int j=9; j<DNA.length(); ++j){
            enc <<=2;
            enc &= 0xfffff;
            enc |= map[DNA.charAt(j)-'A'];
            if(!once.add(enc) && twice.add(enc))
                res.add(DNA.substring(j-9,j+1));
        }
        return res;
    }
}
