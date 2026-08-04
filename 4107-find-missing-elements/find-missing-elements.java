class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        Arrays.sort(nums);
        List<Integer> sorted_nums = new ArrayList<>();
        List<Integer> ans = new ArrayList<>();
        for (int x : nums) {
            sorted_nums.add(x);
        }

        for (int i = 0; i < sorted_nums.size(); i++) {
            if (sorted_nums.get(i) != sorted_nums.get(0) + i) {
                sorted_nums.add(i, sorted_nums.get(0) + i);
                ans.add(sorted_nums.get(0) + i);
            }
        }

        return ans;
    }
}