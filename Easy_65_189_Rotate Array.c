void rotate(int* nums, int numsSize, int k) {
    if(k>=numsSize)
        k=k%numsSize;
    reverse(nums,numsSize-k);
    reverse(nums+numsSize-k,k);
    reverse(nums,numsSize);
}
void reverse(int* a,int n)
{   	
    int i,t;
	for(i=0;i<n/2;i++) {
		t=*(a+i);
		*(a+i)=*(a+n-i-1);
		*(a+n-i-1)=t;
	}
}
