int majorityElement(int* nums, int numsSize) {
    int i,mainElement,repeatTimes = 0;  
    
    //ÿ��������ͬ���С�������������ͬ������  
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
