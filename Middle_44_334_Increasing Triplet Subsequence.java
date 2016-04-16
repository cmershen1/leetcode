public class Solution {
    public boolean increasingTriplet(int[] nums) {
    	int a1 = Integer.MAX_VALUE,a2 = Integer.MAX_VALUE;
    	for(int num : nums) {
    		if(num<=a1) 
    			a1=num;
    		else if(num<=a2)
    			a2=num;
    		else
    			return true;
    	}
        return false;
    }
}
