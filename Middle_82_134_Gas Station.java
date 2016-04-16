public class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
    		if (gas == null) {
    			return -1;
    		}
            // Note: The Solution object is instantiated only once and is reused by each test case.
    		int count = gas.length;
    		
    		int n = 0;
    		int gasInCar = 0;
    		int begin = 0;
    		int end = 0;
    		int i = 0;
    		while (n < count - 1) {
    			gasInCar += gas[i] - cost[i];
    			if (gasInCar >=0) {//forward
    				end++;
    				i=end;
    			} else {
    				begin--;
    				if (begin < 0) {
    					begin = count - 1;
    				}
    				i = begin;
    			}
    			
    			n++;
    		}
    		
    		gasInCar += gas[i] - cost[i];
    		
    		if (gasInCar >= 0) {
    			return begin;
    		} else {
    			return -1;
    		}
    		
        }

}
