public class Solution {
    public int romanToInt(String s) {
        int num=0;
    	HashMap<Character,Integer> convert=new HashMap<Character,Integer>();
    	convert.put('I', 1);
    	convert.put('V', 5);
    	convert.put('X', 10);
    	convert.put('L', 50);
    	convert.put('C', 100);
    	convert.put('D', 500);
    	convert.put('M', 1000);
    	
    	for(int i=0;i<s.length();i++) {
    		int num1=convert.get(s.charAt(i));
    		int num2=0;
    		if(i!=s.length()-1)
    			num2=convert.get(s.charAt(i+1));
    		if(num1>=num2)
    			num+=num1;
    		else {
    			num+=(num2-num1);
    			i++;
    		}
    	}
    	return num;
    }
}
