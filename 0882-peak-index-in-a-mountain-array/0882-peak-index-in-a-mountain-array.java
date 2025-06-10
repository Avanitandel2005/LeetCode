class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        if(n==1) return 0;
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        
        int left = 0;
        int right = arr.length-1;

        while(left<=right){
            int mid = left+(right-left)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]){
                return mid;
            }
            if(arr[mid+1]>arr[mid]) left=mid;
            else right=mid;
        }
        return left;
        
    }
}