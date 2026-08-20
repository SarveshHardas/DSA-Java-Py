class Solution {
    public int[] resultArray(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        arr1.add(nums[0]);
        arr2.add(nums[1]);
        for(int i = 2; i < n; i++){
            if(arr1.getLast() > arr2.getLast()){
                arr1.add(nums[i]);
            }else{
                arr2.add(nums[i]);
            }
        }
        int[] res = new int[n];
        int idx = 0;
        for(int a: arr1){
            res[idx++] = a;
        }
        for(int a: arr2){
            res[idx++] = a;
        }

        return res;
    }
}