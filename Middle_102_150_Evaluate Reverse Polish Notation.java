public class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> stack = new Stack<Integer>();
        for(String token : tokens) {
        	if(token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
        		int num1 = stack.pop();
        		int num2 = stack.pop();
        		stack.push(operate(num2,token,num1));
        	}
        	else
        		stack.push(Integer.parseInt(token));
        }
        return stack.peek();
    }
    private int operate(int a, String op, int b) {
		if(op.equals("+"))
			return a+b;
		else if(op.equals("-"))
			return a-b;
		else if(op.equals("*"))
			return a*b;
		else {
			return a/b;
		}
	}
     
}
