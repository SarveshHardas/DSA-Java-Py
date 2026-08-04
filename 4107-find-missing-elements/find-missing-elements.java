class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        int n = nums.length;
        int min = nums[0];
        int max = nums[0];

        for(int x: nums){
            max = Math.max(x,max);
            min = Math.min(x,min);
        }

        int[] arr = new int[max+1];

        for(int x: nums){
            arr[x]++;
        }

        for(int i = min; i < max; i++){
            if(arr[i] == 0){
                ans.add(i);
            }
        }

        return ans;
    }
}