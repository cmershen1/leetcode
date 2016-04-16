public class Solution {
    public String reverseWords(String s) {
    	s=s.trim();
        String[] words = s.split(" ");
        String result = "";
        for(int i = words.length-1;i>0;i--) {
        	if(!words[i].equals(""))
        		result=result+words[i]+" ";
        }
        if(words.length!=0)
        	result+=words[0];
        return result;
    }
}
