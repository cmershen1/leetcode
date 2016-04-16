朴素解法：
public class Solution {
    public int[] singleNumber(int[] nums) {
        HashSet<Integer> set=new HashSet<Integer>();
        for(int num:nums) {
        	if(set.contains(num))
        		set.remove(num);
        	else
        		set.add(num);        		
        }
        int[] array=new int[2];
        int i=0;
        for(int num:set)
        	array[i++]=num;
        	
        return array;
        
        
    }
}
位运算解法：
public class Solution {
    public int[] singleNumber(int[] nums) {
        int[] res = new int[2];
        int r = 0;
        for(int i=0;i<nums.length;i++) {
        	r = r^nums[i];
        }
        res[0] = 0;
        res[1] = 0;
        int mask = r & (~(r-1));
        for(int i=0;i<nums.length;i++){
            if((mask & nums[i])!=0){
                res[0] = res[0] ^ nums[i];
            }else {
                res[1] = res[1] ^ nums[i];
            }
        }
        return res;
    }
}
