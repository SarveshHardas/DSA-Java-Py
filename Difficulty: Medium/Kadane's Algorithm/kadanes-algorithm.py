class Solution:
    def maxSubarraySum(self, arr):
        # Code here
        curr_sum = arr[0]
        max_sum = arr[0]

        for i in arr[1:]:
            curr_sum = max(i,curr_sum+i)
            max_sum = max(max_sum,curr_sum)
        
        return max_sum