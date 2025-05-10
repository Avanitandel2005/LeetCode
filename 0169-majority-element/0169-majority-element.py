class Solution(object):
    def majorityElement(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        count={}
        for num in nums:
            if num in count:
                count[num]+=1
            else:
                count[num]=1
        for num,freq in count.items():
            if freq > len(nums)//2:
                return num


        