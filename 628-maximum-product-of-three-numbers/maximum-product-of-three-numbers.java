class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>(nums.length);

        for (int num : nums) {
            list.add(num);
        }

        Collections.sort(list);
        int prod1 = list.get(n - 1) * list.get(n - 2) * list.get(n - 3);
        int prod2 = list.get(0) * list.get(1) * list.get(n - 1);

        return Math.max(prod1, prod2);
    }
}