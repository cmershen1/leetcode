public class Solution {
    public String convertToTitle(int n) {
        if(n<27)
        	return new Character((char) (n+64)).toString();
        else {
        	if(n%26!=0)
        		return convertToTitle(n/26)+new Character((char) ((n%26)+64)).toString();
        	else
        		return convertToTitle(n/26-1)+new Character('Z').toString();
        }
    }
}
