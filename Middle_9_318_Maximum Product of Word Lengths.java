public class Solution {
    public int maxProduct(String[] words) {
    	int maxPdc=0;
    	int[] letters=new int[words.length];
    	for(int i=0;i<words.length;i++)
    		for(int j=0;j<words[i].length();j++)
    			letters[i]=letters[i]|1<<(words[i].charAt(j)-'a');
    	for(int i=0;i<words.length;i++) {
    		for(int j=i+1;j<words.length;j++) {
    			if((letters[i]&letters[j]) == 0) {
    				int tempPdc=words[i].length()*words[j].length();
    				if(tempPdc>maxPdc)
    					maxPdc=tempPdc;
    			}
    		}
    	}
    	return maxPdc;            
    }
}
