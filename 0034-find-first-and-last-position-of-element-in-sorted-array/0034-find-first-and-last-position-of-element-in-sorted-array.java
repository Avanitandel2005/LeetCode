class Solution {
    public int[] searchRange(int[] nums, int target) {
        int res[]=new int[2];
        res[0]=-1;
        res[1]=-1;

           for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                res[1]=i;
                if (res[0]==-1){
                res[0]=i;
                }
            }
           }

        // for(i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         res[0]=i;
        //         break;
        //     }
        // }
        //  for(i=0;i<nums.length;i++){
        //     if(nums[i]==target){
        //         res[1]=i;
        //     }
        //  }
        return res;
    }
}