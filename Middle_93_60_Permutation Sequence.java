public class Solution {
	private String current = "";
    public String getPermutation(int n, int k) {
        List<Integer> list = new ArrayList<Integer>();
        for(int i = 1;i<=n;i++)
        	list.add(i);
        backtrack(list, n, k);
        return current;
    }
    private void backtrack(List<Integer> list, int n, int k) {
		if(list.isEmpty())
			return;
		else {
		    int groups = factorial(n-1);
			int groupid = (k-1)/groups;
			current+=String.valueOf(list.get(groupid));
			list.remove(groupid);
			backtrack(list, n-1, k-groupid*groups);
		}
	}
    public int factorial(int num){
        int sum=1;
        for(int i=1;i<=num;i++){
            sum *= i;
        }
        return sum;
    }
}
