class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> freq = new HashMap<>();

        for (int n : nums2) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
        }

        List<Integer> res = new ArrayList<>();
        for (int n : nums1) {
            if (freq.containsKey(n) && freq.get(n) > 0) {
                res.add(n);
                freq.put(n, freq.get(n) - 1);
            }
        }

        int[] res_arr = new int[res.size()];
        int i = 0;
        for(int r: res){
            res_arr[i++] = r;
        }

        return res_arr;
    }
}