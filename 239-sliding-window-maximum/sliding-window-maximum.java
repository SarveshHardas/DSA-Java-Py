class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int n = nums.length;
        int[] ans = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        int a = 0;
        for (int right = 0; right < n; right++) {
            while (!deque.isEmpty() &&
                   nums[deque.peekLast()] <= nums[right]) {
                deque.pollLast();
            }
            deque.offerLast(right);

            int left = right - k + 1;
            while (!deque.isEmpty() &&
                   deque.peekFirst() < left) {
                deque.pollFirst();
            }
            if (right >= k - 1) {
                ans[a++] = nums[deque.peekFirst()];
            }
        }

        return ans;
    }
}