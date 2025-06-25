class Solution {
    public int numberOfMatches(int n) {
        if(n==0) return 0;
        int sum=0;
        while(n>1){
            int match=n/2;
            n=n-match;
            sum+=match;
        }
        return sum;
        
    }
}