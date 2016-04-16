方法一：
public class Solution {
	private static int[] pows = new int[]{1,2,4,8,16,32,64,128,256,512,1024,2048,4096,8192,16384,32768,65536,131072,262144,524288,1048576,2097152,4194304,8388608,16777216,33554432,67108864,134217728,268435456,536870912,1073741824}; 
    public static int rangeBitwiseAnd(int m, int n) {
    	if(m>pows[30])
            return pows[30] + rangeBitwiseAnd(m-pows[30],n-pows[30]);
    	for(int i = 1;i < 31; i++) {
    		if(m<pows[i] && n>pows[i])
    			return 0;
    		else if(m>=pows[i] && n<pows[i+1])
    			return pows[i] + rangeBitwiseAnd(m-pows[i],n-pows[i]);
    	}
    	return m&n;
    }
}
方法二：
public class Solution {  
    public int rangeBitwiseAnd(int m, int n) {  
        int bit = 0;  
        while(m!=n) {  
            m>>=1;  
            n>>=1;  
            bit++;  
        }  
        return m<<bit;  
    }  
}  
