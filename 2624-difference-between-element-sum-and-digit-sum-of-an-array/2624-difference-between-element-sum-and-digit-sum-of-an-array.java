class Solution {
    public int differenceOfSum(int[] nums) {
        int eleSum=0;
        int digitSum=0;
        for(int i=0;i<nums.length;i++){
            int n=nums[i];
            eleSum+=nums[i];
            while(n>0){
                int digit = n%10;
                digitSum+=digit;
                n=n/10;
            }
        }
        if(digitSum>eleSum){
            return digitSum-eleSum;
        }
        else return eleSum-digitSum;
        
    }
}