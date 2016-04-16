int rob(int* nums, int numsSize) {
    if(numsSize==0)
        return 0;
    else if(numsSize==1)
    	return nums[0];
    else if(numsSize==2)
    	return nums[0]>nums[1]?nums[0]:nums[1];
    else
        return max(rob1(nums,numsSize-1),rob1(nums+1,numsSize-1));
}
int max(int a,int b) {
    return a>b?a:b;
}
int rob1(int* nums, int numsSize) {
    if(numsSize==0)
        return 0;
    if(numsSize==1)
    	return nums[0];
    else if(numsSize==2)
    	return nums[0]>nums[1]?nums[0]:nums[1];
    else
    {
    	int i;
    	int dp1,dp2,dp;

    	dp1=nums[0];
    	dp2=nums[0]>nums[1]?nums[0]:nums[1];
    	for(i=2;i<numsSize;i++)
    	{
    	    dp=dp2>dp1+nums[i]?dp2:dp1+nums[i];
    	    dp1=dp2;
    	    dp2=dp;
    	}
    	return dp;
    }
}
