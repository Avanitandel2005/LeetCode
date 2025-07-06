class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> res = new HashSet<>();

        int n1 = nums1.length;
        int n2 = nums2.length;
        for(int i=0;i<n1;i++){
            for(int j=0;j<n2;j++){
                if(nums1[i]==nums2[j]){
                    res.add(nums1[i]);
                }
            }
        }
        int [] result = new int[res.size()];
        int j=0;
        for(int i:res){
            result[j]=i;
            j++;
        }  
        return result;
        
    }
}