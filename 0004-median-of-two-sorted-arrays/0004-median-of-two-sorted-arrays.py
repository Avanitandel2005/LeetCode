class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):

        nums = nums1 + nums2
        nums = sorted(nums)
        mid = len(nums)//2
        if len(nums) % 2 != 0:
            return nums[mid]
        else:
            mid = nums[mid]+nums[mid-1]
            return mid/2.0



        
