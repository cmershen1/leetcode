方法一：
public class Solution {
	public int numSquares(int n) {
        int[] dp = new int[n+1];
        for(int i = 0;i<=n;i++)
            dp[i]=i;
        for(int i = 1;i*i <= n;i++) 
        	dp[i*i]=1;
        for(int i=1;i<=n;i++) {
        	for(int j=1;i+j*j<=n;j++) {
        		dp[i+j*j]=Math.min(dp[i+j*j], dp[i]+1);
        	}
        }
        return dp[n];
    }
}
方法二：
public class Solution {
	public int numSquares(int n) {
        while(n%4 == 0)
            n/=4;
        if(n%8 == 7)
            return 4;
        for (int a=0; a*a<=n; ++a) {
            int b = (int)Math.sqrt(n - a*a);
            if (a*a + b*b == n)
                return func(a) + func(b);
        }
        return 3;
    }
    private int func(int a) {
        return a==0?0:1;
    }
}
