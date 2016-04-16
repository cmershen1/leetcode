方法1略。
方法2：
void sortColors(int* nums, int numsSize) {
    int red=0,white=0,blue=0;
    for(int i = 0;i<numsSize;i++) {
    	if(nums[i] == 0)
    		red++;
    	else if(nums[i] == 1)
    		white++;
    	else
    		blue++;
    }
    for(int i=0;i < numsSize;i++) {
    	if(red > 0) {
    		red--;
    		nums[i]=0;
    	}
    	else if(white > 0) {
    		white--;
    		nums[i]=1;
    	}
    	else
    		nums[i]=2;
    }
}
方法3：
void sortColors(int* nums, int numsSize) {
    int Insert_Red=0,Insert_White=0;
    for(int i=0;i<numsSize;i++) {
      if(nums[i]==1) {    
           nums[i]=nums[Insert_White];
           nums[Insert_White++]=1;
      }
      else if(nums[i]==0) {   
           nums[i]=nums[Insert_White];
           nums[Insert_White++]=nums[Insert_Red];
           nums[Insert_Red++]=0;
      }
     
    }
}
