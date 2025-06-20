class Solution {
    public int subtractProductAndSum(int n) {
        if(n==0) return 0;
        int product=1;
        int sum=0;
        while(n>0){
           int d = n%10;
            product *= d;
            sum+=d;
            n=n/10;
        }
        return product-sum;
        
    }
}