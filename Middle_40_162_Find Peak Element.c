int findPeakElement(int* nums, int numsSize) {
    if(numsSize == 1) 
		return 0;
	else if(numsSize == 2)
		return nums[0]<nums[1];
	else {
		int mid=(numsSize-1)/2;
		if(mid == 0 && nums[0]>nums[1])
			return 0;
		else if(mid == numsSize-1 && nums[numsSize-1] > nums[numsSize-2])
			return numsSize-1;
	    else if(nums[mid] > nums[mid-1] && nums[mid] > nums[mid+1])
        	return mid;
       	else if(nums[mid] >= nums[mid-1] && nums[mid] <= nums[mid+1])
       		return findPeakElement(&nums[mid+1],numsSize-mid-1)+mid+1;
       	else 
       		return findPeakElement(nums,numsSize-mid-1);
	}
}
