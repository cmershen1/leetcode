int reverse(int x) {
    long n=0;
    while(x) {
        n=n*10+x%10;
        x/=10;
    }
    return n==(int)n?(int)n:0;
}
