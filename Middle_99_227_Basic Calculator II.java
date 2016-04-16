public class Solution {
    public int calculate(String s) {
    	s=s.replace(" ","");
        String[] nums = s.split("[\\+\\-\\*\\/]");
        List<Integer> numberList = new ArrayList<>();
        for(String num : nums)
        	numberList.add(Integer.parseInt(num));
        int index = 0;
        for (int i = 0; i<s.length(); i++) {
        	char ch = s.charAt(i);
        	if (ch == '+' || ch == '-') 
        		index++;
        	else if (ch == '*' || ch == '/') {
        		int op1 = numberList.get(index);
        		int op2 = numberList.get(index+1);
        		numberList.remove(index);
        		numberList.remove(index);
        		numberList.add(index, operate(op1,ch,op2));
        	}
        }

        int result = numberList.get(0); index = 1;
        for(int i = 0;i<s.length();i++) {
        	char ch = s.charAt(i);
        	if(ch == '+' || ch == '-') 
        		result = operate(result, ch, numberList.get(index++));
        }
        return result;
        
    }
    private Integer operate(int a, char op, int b) {
    	if(op=='+')
    		return a+b;
    	else if(op=='-')
    		return a-b;
    	else if(op=='*')
    		return a*b;
    	else 
    		return a/b;
    }
}
