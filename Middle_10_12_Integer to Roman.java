public class Solution {
    public String intToRoman(int num) {
    	if(num >= 1 && num <= 9) {
    		switch (num) {
    			case 1:{return "I";}
    			case 2:case 3:{return "I"+intToRoman(num-1);}
    			case 4:case 9:{return "I"+intToRoman(num+1);}
    			case 5:{return "V";}
    			default:{return "V"+intToRoman(num-5);}//6,7,8
    		}
    	}
    	else if (num >= 10 && num <= 99) {
    		switch (num) {
    			case 10:{return "X";}
    			case 50:{return "L";}
    			case 40:case 90:{return "X"+intToRoman(num+10);}
    			default: {
    				if(num > 90)
    					return "X"+intToRoman(num+10);
    				else if(num > 50)
    					return "L"+intToRoman(num-50);
    				else if(num > 40 && num < 50)  //XL
    					return "X"+intToRoman(num+10);
    				else 
    					return "X"+intToRoman(num-10);
    			}
    		}
    	}
    	else if (num >= 100 && num <= 999) {
    		switch (num) {
    			case 100:{return "C";}
    			case 500:{return "D";}
    			case 400:case 900:{return "C"+intToRoman(num+100);}
    			default:{
        			if(num > 900)
        				return "C"+intToRoman(num+100);
        			else if(num > 500)
        				return "D"+intToRoman(num-500);
        			else if(num > 400 && num < 500) 
        				return "C"+intToRoman(num+100);
        			else 
        				return "C"+intToRoman(num-100);
    			}
    		}
    	}
    	else { //1000~3999
    		switch (num) {
    			case 1000:{return "M";}
    			default:{return "M"+intToRoman(num-1000);}
    		}
    	}       
    }
}
