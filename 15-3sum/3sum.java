class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;
        List<List<Integer>> ans = new ArrayList<>();
        HashSet<List<Integer>> set = new HashSet<>();
        
        for(int i = 0; i < n; i++){
            int j = i+1;
            int k = n - 1;

            while(j < k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0){
                    List<Integer> trip = new ArrayList<>();

                    trip.add(nums[i]);
                    trip.add(nums[j]);
                    trip.add(nums[k]);

                    if(!set.contains(trip)){
                        ans.add(trip);
                        set.add(trip);
                    }
                    j++;
                    k--;
                }else if(sum < 0){
                    j++;
                }else{
                    k--;
                }
            }
        }

        return ans;
    }
}