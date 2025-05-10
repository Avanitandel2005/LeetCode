class Solution {
    public int missingNumber(int[] nums) {

        int n=nums.length;
        for(int i=0;i<n;i++){
            int val=nums[i];
            int oval=val%(n+1);
            if(oval<n) nums[oval]=nums[oval]+(n+1);
        }
        for(int i=0;i<n;i++){
            int freq=(nums[i]/(n+1));
            if(freq==0)return i;
        }
        return n;
        
    }
}