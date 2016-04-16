public class Solution {
    public int hIndex(int[] citations) {
        int count=0,length = citations.length;
        int start=0,end=length-1,mid=0;
        while(start<=end) {
            mid = (start+end) / 2;
            if(citations[mid] >= length-mid) {
                if(mid==0 || citations[mid-1]<length-mid+1)
                    return length-mid;
                else if(citations[mid-1]>=length-mid)
                    end=mid-1;
            }
            else
                start=mid+1;
        }
        return 0;       
    }
}
