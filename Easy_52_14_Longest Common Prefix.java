public class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0)
        	return "";
        else if(strs.length==1)
        	return strs[0];
        else
        {
        	int sublen=0;
        	while(true)
        	{
        	    if(strs[0].length()==0)
        	        return "";
        	    if(sublen==strs[0].length())
        	        return strs[0];
        		char prefix=strs[0].charAt(sublen);
        		for(String str:strs)
        		{
        		    if(str.length()==sublen || str.charAt(sublen)!=prefix)
        				return str.substring(0,sublen);
        		}
        		sublen++;
        	}
        }
    }
}
