int majorityElement(int* nums, int numsSize) {
    int i,mainElement,repeatTimes = 0;  
    
    //每次若不相同则减小这个计数，若相同则增加  
    for(i = 0;i<numsSize;i++) {  
        if(repeatTimes == 0){  
            mainElement = nums[i];  
            repeatTimes = 1;  
        }  
        else{  
            if(mainElement == nums[i])  
                repeatTimes++;  
            else  
                repeatTimes--;  
        }  
    }  
    return mainElement;  
}
