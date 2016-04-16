bool canJump(int* nums, int numsSize) {
    int i,j,pos=numsSize-1;
    for(j=numsSize-2;j>-1;j--){
        if(nums[j]>=pos-j){
            pos = j;
        }
    }
    return !pos;
}
