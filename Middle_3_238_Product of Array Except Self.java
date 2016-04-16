朴素解法：
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int product=1,product2=1;
        int zerocount=0;
        for(int num:nums)
        {
            if(num==0)
        	    zerocount++;
        	if(zerocount==2)
        		break;
			product*=num;
        	product2*=(num==0)?1:num;
        }
        if(zerocount==0){
	        for(int i=0;i<nums.length;i++)
	        	nums[i]=product/nums[i];
	        return nums;  
        }
        else if(zerocount==1)
        {
        	int[] array=new int[nums.length];
        	for(int j=0;j<nums.length;j++)
        		array[j]=(nums[j]==0)?product2:0;
        	return array;
        }
        else
        	return new int[nums.length];      
    }
}
不用除的巧妙算法：
public class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] res = new int[nums.length];
        res[res.length-1] = 1;
        for(int i=nums.length-2; i>=0; i--) {
            res[i] = res[i+1] * nums[i+1];
        }
        
        int left = 1;
        for(int i=0; i<nums.length; i++) {
            res[i] *= left;
            left *= nums[i];
        }
        return res;
    }
}
