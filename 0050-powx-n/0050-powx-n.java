class Solution {
    public double myPow(double x, int n) {
        return pow(x,(long)n);
    }
    public double pow(double x,long n){
        if(n==0) return 1;

        if(n<0) return 1.0/pow(x,-n);

        double half = pow(x,n/2);
        if(n%2 == 1) return x*half*half;
        else return half*half;
    }
}
