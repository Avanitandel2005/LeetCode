class Solution {
    public boolean isPerfectSquare(int num) {
        if(num<2) return true;

        int left = 2;
        int right = num/2;

        while(left<=right){
            int mid = left+(right-left)/2;

            long guess =(long) mid*mid;

            if(guess==num) return true;

            else if(guess>num) right=mid-1;

            else left=mid+1; 

        }
        return false;

    }
}