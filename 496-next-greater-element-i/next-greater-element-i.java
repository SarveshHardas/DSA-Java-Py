class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        Deque<Integer> stack = new ArrayDeque<>();
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums2) {
            while (!stack.isEmpty() && stack.peek() < n) {
                map.put(stack.peek(), n);
                stack.pop();
            }
            stack.push(n);
        }

        int[] ans = new int[nums1.length];
        for (int i = 0; i < nums1.length; i++) {
            if (!map.containsKey(nums1[i])) {
                ans[i] = -1;
            } else {
                ans[i] = map.get(nums1[i]);
            }
        }

        return ans;
    }
}