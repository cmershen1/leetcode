public class Solution {
	private class MyComparator implements Comparator<Integer> {
		public int compare(Integer o1, Integer o2) {
			// TODO Auto-generated method stub
			String s1=o1.toString()+o2.toString();
			String s2=o2.toString()+o1.toString();
			return s2.compareTo(s1);
		}
	}
    public String largestNumber(int[] nums) {
        List<Integer> list = new ArrayList<Integer>();
        for(int num:nums)
        	list.add(num);
        Collections.sort(list, new MyComparator());
        String result = "";
        for(Integer i:list)
        	result+=String.valueOf(i);
        if(result.startsWith("00"))
        	result = "0";
        return result;
    }
}
