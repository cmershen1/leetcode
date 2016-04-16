class Solution {
public:
    bool isPalindrome(ListNode* head) {
        int length=0;
        for(ListNode* p=head;p;p=p->next,length++);//length is the length of linklist
    	int* array=new int[length];
    	int i=0;
    	for(ListNode* p=head;p;p=p->next)
    		array[i++]=p->val;
    	return isPalindromeArray(array,length);
    }
    bool isPalindromeArray(int* array,int length)
    {
    	if(length==0||length==1) 
    		return true;
    	else if(*array!=*(array+length-1))
    		return false;
    	else
    		return isPalindromeArray(array+1,length-2);
    }
};
