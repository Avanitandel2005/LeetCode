class Solution {
    public int maxAdjacentDistance(int[] nums) {
        int n=nums.length;
        int max =0;

        for(int i=0;i<n;i++){
            int next = (i + 1) % n;
            int diff =Math.abs(nums[i]-nums[next]);

            if(diff>max){
                max=diff;
            }
        }

        return max;

    
    }
}