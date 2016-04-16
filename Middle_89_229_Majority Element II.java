方法一：
public class Solution {
    public List<Integer> majorityElement(int[] nums) {
    	List<Integer> list = new ArrayList<Integer>();
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int num:nums) {
        	if(map.containsKey(num)) {
        		int count = map.get(num);
        		count++;
        		map.put(num,count);
        		if(count > nums.length/3 && !list.contains(num))
        			list.add(num);
        	}
        	else {
        		map.put(num, 1);
        		if(nums.length < 3)
        		    list.add(num);
        	}
        }
        return list;
    }
}
方法二：
public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        // 1, 2
        List<Integer> res = new ArrayList<>();
        if(nums==null || nums.length==0) return res;
        if(nums.length==1) {
            res.add(nums[0]);
            return res;
        }
        
        int m1 = nums[0];
        int m2 = 0;
        
        int c1 = 1;
        int c2 = 0;
        
        for(int i=1; i<nums.length; i++) {
            int x = nums[i];
            if(x==m1) ++c1;
            else if(x==m2) ++c2;
            else if(c1==0) {
                m1 = x;
                c1 = 1;
            } else if(c2==0) {
                m2 = x;
                c2 = 1;
            } else {
                --c1; --c2;
            }
        }
        c1 = 0; c2 = 0;
        for(int i=0; i<nums.length; i++) {
            if(m1 == nums[i]) ++c1;
            else if(m2 == nums[i]) ++c2;
        }
        if(c1>nums.length/3) res.add(m1);
        if(c2>nums.length/3) res.add(m2);
        return res;
    }
}
