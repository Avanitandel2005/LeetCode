class Solution {
    public int averageValue(int[] nums) {
        int count=0;
        int sum=0;
        int avg=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]%3==0 && nums[i]%2==0){
                count+=1;
                sum+=nums[i];
            
                if(count==0) return 0;
                else {
                    avg = sum/count;
                }
            }
        }
        return avg;
        
    }
}