int removeDuplicates(int* nums, int numsSize) {
    int start = 0;
    for(int i = 0;i < numsSize;i++) {
        if(i == 0 || i == 1) 
            nums[start++] = nums[i];
        else {
            if(nums[i] != nums[start-2]) 
                nums[start++] = nums[i];
        }
    }
    return start;   
}
