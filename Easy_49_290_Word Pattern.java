public class Solution {
    public boolean wordPattern(String pattern, String str) {
        HashMap<Character,String> map=new HashMap();
        HashMap<String,Character> map2=new HashMap();
        String[] words=str.split(" ");
        if(pattern.length()!=words.length)
            return false;
        for(int i=0;i<pattern.length();i++) {
        	Character key=pattern.charAt(i);
        	String word=words[i];
        	if(!map.containsKey(key)) 	{
        		if(!map2.containsKey(word))
        		{
	    			map.put(key, word);
	    			map2.put(word, key);
        		}
        		else
        			return false;
        	}       		
        	else if (!(map.get(key).equals(word) && map2.get(word).equals(key)))
        		return false;
        }
        return true;
    }
    
}
