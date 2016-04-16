public class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> list = new ArrayList<List<String>>();
        backtrack(list,new ArrayList<>(),s);
        return list;
    }
	private void backtrack(List<List<String>> list, List<String> sublist, String s) {
		if(s.length() == 0) {
			list.add(new ArrayList<String>(sublist));
		}		
		else {
			for(int i = 1; i<=s.length();i++) {
				if(isPalindrome(s.substring(0, i))) {
					sublist.add(s.substring(0, i));
					backtrack(list, sublist, s.substring(i));
					sublist.remove(sublist.size()-1);
		        }
			}
		}
	}
    public boolean isPalindrome(String s) {
        if(s==null||s.length()==0)
            return true;
      
        for(int i = 0,j = s.length()-1;i<j;i++,j--) {
            if(s.charAt(i)!=s.charAt(j))
                return false;
        }
        return true;
    }
}
