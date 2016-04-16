public class Solution {
    public  List<Integer> diffWaysToCompute(String input) {
    	List<Integer> list=new ArrayList<Integer>();
    	if(isNumeric(input))  // if input is an integer 		
    		list.add(Integer.parseInt(input));
    	else {
	    	for(int i=0;i<input.length();i++) {
	    		char op=input.charAt(i);
	    		if(op == '+' || op == '-' || op == '*') {
	    			List<Integer> leftList = diffWaysToCompute(input.substring(0,i));
	    			List<Integer> rightList = diffWaysToCompute(input.substring(i+1)); 			
	    			for(Integer j : leftList)
	    				for(Integer k : rightList)
	    					list.add(operate(j,op,k));
	    		}
	    	}
    	}
    	return list;
    }
    private  Integer operate(int a, char op, int b) {
    	if(op=='+')
    		return a+b;
    	else if(op=='-')
    		return a-b;
    	else
    		return a*b;
    }
    public boolean isNumeric(String str){
       for(int i=str.length();--i>=0;){
          int chr=str.charAt(i);
          if(chr<48 || chr>57)
             return false;
       }
       return true;
    } 
}
