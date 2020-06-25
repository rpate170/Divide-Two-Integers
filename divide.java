class Solution {
    public int divide(int dividend, int divisor) {
        if(dividend == Integer.MIN_VALUE && divisor == -1){
            return Integer.MAX_VALUE;        
        }
        int x = Math.abs(dividend);
        int y = Math.abs(divisor);
        int result = 0;
        while(x-y >= 0) {
            int a=0;
            while (x - (y << 1 << a) >= 0) {
                a++;
            }
            result += 1 << a;
            x -= y << a;
        }
        return (dividend >= 0) == (divisor >= 0) ? result:-result;
    }
}