int climbStairs(int n) {
    int i,sum1=1,sum2=2,sum=0;
    if(n==1||n==2)
        return n;
    else {
        for(i=2;i<n;i++) {
            sum=sum1+sum2;
            sum1=sum2;
            sum2=sum;
        }
        return sum;
    }
}
