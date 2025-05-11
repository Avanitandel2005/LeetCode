class Solution {
    public double myPow(double x, int n) {
        long N=n;
        if(n>0){
            return Math.pow(x, N);
        }
        if(n<0){
            return 1.0/Math.pow(x,-N);
        }
        return 1;
    }
}