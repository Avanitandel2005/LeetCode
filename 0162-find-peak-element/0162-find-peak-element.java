class Solution {
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if(n==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;
        int left = 0;
        int right = nums.length-1;

        while(left<right){
            int mid = left+(right-left)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
                return mid;
            }
            if(nums[mid+1]>nums[mid]) left=mid;
            else right=mid;
        }
        return left;
        
        
    }
}