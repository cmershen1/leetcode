public class Solution {
	private String[][] letters = new String[][] {
		{" "},
		{},
		{"a","b","c"},
		{"d","e","f"},
		{"g","h","i"},
		{"j","k","l"},
		{"m","n","o"},
		{"p","q","r","s"},
		{"t","u","v"},
		{"w","x","y","z"}
	};
    public List<String> letterCombinations(String digits) {
        List<String> list = new ArrayList<String>();
        if(digits.length() > 0)
            backtrack(list, digits, new String(), 0);
        return list;
    }
    private void backtrack(List<String> list, String digits, String currentLetter, int index) {
		if(index == digits.length()) {
			list.add(currentLetter);
			return;
		}
		else {
			int num = digits.charAt(index) -'0';
			for(int i = 0; i < letters[num].length; i++) {
				currentLetter+=letters[num][i];
				backtrack(list, digits, currentLetter, index+1);
				currentLetter = currentLetter.substring(0,currentLetter.length()-1);
			}
		}
	}
}
