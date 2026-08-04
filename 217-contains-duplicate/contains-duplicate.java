class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> freq = new HashSet<>();

        for(int x: nums){
            if(freq.contains(x)){
                return true;
            }else{
                freq.add(x);
            }
        }

        return false;
    }
}