ʹ�õݹ飺
bool isPowerOfThree(int n) {
        return (n==0||n==1)?n:((n%3)?false:isPowerOfThree(n/3));
}
��ʹ�õݹ飺
bool isPowerOfThree(int n) {
    return ( n>0 &&  1162261467%n==0);
}
