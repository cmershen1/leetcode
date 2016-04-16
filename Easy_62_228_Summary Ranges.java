public class Solution {
    public List<String> summaryRanges(int[] nums) {
        int len=nums.length;
        List<String> answer=new ArrayList<String>();
        if(len==0)
            return answer;
        int start=0,end=0;
        while(start<len) {
            String range;
            while(end+1<len && nums[end+1]==nums[end]+1)
                end++;
            if(end!=start)
                range=new Integer(nums[start]).toString()+"->"+new Integer(nums[end]).toString();
            else 
                range=new Integer(nums[start]).toString();
            answer.add(range);
            end++;
            start=end;
        }
        return answer;
    }
}
