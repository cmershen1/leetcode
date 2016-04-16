public class NumArray {
    private int[] nums;
    public NumArray(int[] nums) {
        this.nums=new int[nums.length+1];
        this.nums[0]=0;
        for(int i=0;i<nums.length;i++)
        {
            this.nums[i+1]=this.nums[i]+nums[i];
        }
    }

    public int sumRange(int i, int j) {
        if(nums.length==1)
    		return 0;
    	else
            return nums[j+1]-nums[i];
    }
}
