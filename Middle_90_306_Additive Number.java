import java.math.BigInteger;

public class Solution {
    public boolean isAdditiveNumber(String num) {
		int length = num.length();
		boolean result = false;
        for(int i = 0;i<length-1;i++){
        	//if(num.charAt(i+1)=='0')
        	//	continue;
        	String temp1 = num.substring(0, i+1);
        	if(temp1.length() > 1 && temp1.startsWith("0"))
        		continue;
        	BigInteger num1 = new BigInteger(num.substring(0, i+1)); // start: 0 ,end: i
        	for(int j= i+1;j<length-1;j++) {
        		String temp2 = num.substring(i+1,j+1);
        		if(temp2.length()>1 && temp2.startsWith("0"))
        			break;
        		BigInteger num2 = new BigInteger(num.substring(i+1,j+1));
        		BigInteger sum = num1.add(num2);
        		if(num.length()-j-1<sum.toString().length())
        			break;
        		else if(num.substring(j+1, j+1+sum.toString().length()).equals(sum.toString())) {
        			if(1+j+sum.toString().length() == num.length()) {
            			result= true;
            			break;
        			}
            		else 	
            			result = result || isAdditiveNumber(num.substring(i+1));
        		}
        	}
        }
        return result;
    }
}
