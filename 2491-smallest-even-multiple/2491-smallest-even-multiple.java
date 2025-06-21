class Solution {
    public int smallestEvenMultiple(int n) {
        if(n==0) return 0;
        if((n*2 > n) && (n%2==0)) return n;
        return n*2;
        
    }
}