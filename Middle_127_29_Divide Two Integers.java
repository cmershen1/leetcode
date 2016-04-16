public class Solution {
    public int divide(int dividend, int divisor) {
        return (dividend==-2147483648 && divisor == -1)?Integer.MAX_VALUE:dividend/divisor;
    }
}
