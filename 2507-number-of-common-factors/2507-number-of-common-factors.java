class Solution {
    public int commonFactors(int a, int b) {
        int count=0;
        for(int i=1;(a>b ? i<=b : i<=a);i++){
            if ((a%i==0) && (b%i==0)){ 
                count+=1;
            }
        }
        return count;
        
    }
}