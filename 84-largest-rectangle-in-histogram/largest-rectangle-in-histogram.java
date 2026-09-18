class Solution {
    public int largestRectangleArea(int[] heights) {
        Deque<Integer> stack = new ArrayDeque<>();
        int best = 0;

        for (int i = 0; i <= heights.length; i++) {
            int currHeight = 0;

            if (i == heights.length) {
                currHeight = 0;
            } else {
                currHeight = heights[i];
            }

            while (!stack.isEmpty() && heights[stack.peek()] > currHeight) {
                int index = stack.pop();
                int height = heights[index];
                int width = 0;

                if (stack.isEmpty()) {
                    width = i;
                } else {
                    width = i - stack.peek() - 1;
                }

                int area = height * width;
                best = Math.max(best, area);
            }
            stack.push(i);
        }
        return best;
    }
}