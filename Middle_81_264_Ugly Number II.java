public class Solution {
    public int nthUglyNumber(int n) {
        int l1=1,l2=1,l3=1;
        int a,b,c;
        int[] uglyNumber = new int[n+1];
        uglyNumber[1] = 1;
        for(int i = 2;i<=n;i++) {
        	a=uglyNumber[l1]*2;
        	b=uglyNumber[l2]*3;
        	c=uglyNumber[l3]*5;
            int min = min(a,b,c);
            if(min==a)
            	l1++;
            if(min==b)
            	l2++;
            if(min==c)
            	l3++;
            uglyNumber[i]=min;
        }
        return uglyNumber[n];
    }
    private  int min(int a, int b, int c) {
    	if(a<=b && a<=c)
    		return a;
    	else if(b<=a && b<=c)
    		return b;
    	else 
    		return c;
    }
}
