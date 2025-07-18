class Solution {
    public boolean judgeSquareSum(int c) {
        int start=0;
        int end =(int) Math.sqrt(c);
        while(start<=end){
            long sum= (long)(start*start)+(long)(end*end);
            if(sum==c){
                return true;
            }
            if(sum<c){
                start++;
            }
            if(sum>c){
                end--;
            }
        }
        
        return false;
        }

}