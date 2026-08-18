class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Set<Integer> set2 = new HashSet<>();
        for(int n: nums2){
            set2.add(n);
        }

        Set<Integer> res = new HashSet<>();
        for(int n: nums1){
            if(set2.contains(n)){
                res.add(n);
            }
        }

        int[] res_array = new int[res.size()];
        int i = 0;
        for(int n: res){
            res_array[i++] = n;
        }

        return res_array;
    }
}