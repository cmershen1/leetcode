public class Solution {    
    public int lengthOfLongestSubstring(String s) {  
        int i,j,max=0;  
        boolean[] sign = new boolean[256];  
        for(i=0,j=0;j<s.length();j++) {              
            while(sign[s.charAt(j)])  
                sign[s.charAt(i++)] = false;  
            sign[s.charAt(j)] = true;              
            max=Math.max(max,j-i+1);  
        }  
        return max;  
    } 
}  
