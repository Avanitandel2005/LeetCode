class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> result = new ArrayList<>();
        int n=nums.length;
        int i=0;
        
        while(i<n){
            int start=nums[i];
            while(i+1<n && nums[i+1]==nums[i]+1){
                i++;
            }
            if(start!=nums[i]){
                result.add(start+"->"+nums[i]);
            }
            else{
                result.add(String.valueOf(start));
            }
            i++;
        }

        return result;
        
    }
}