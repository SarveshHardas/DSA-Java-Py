class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();

        for(int n: nums){
            set.add(n);
        }
        int i = k;

        while(i <= 1000){
            if(!set.contains(i)){
                return i;
            }
            i = i + k;
        }

        return k;
    }
}