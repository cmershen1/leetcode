public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> result = new ArrayList<> ();
        if(nums == null) {
            return result;
        }
        Arrays.sort(nums);
        backtrack(nums, 0, result, new ArrayList<Integer> ());
        return result;
    }
    
    private void backtrack(int[] nums, int index, List<List<Integer>> result, List<Integer> sublist) {
        if(index <= nums.length) {
            result.add(new ArrayList<> (sublist));
        }
        for(int i = index; i < nums.length; i++) {
            if(i != index && nums[i] == nums[i - 1]) {
                continue;
            }
            sublist.add(nums[i]);
            backtrack(nums, i + 1, result, sublist);
            sublist.remove(sublist.size() - 1);
        }
    }
}
