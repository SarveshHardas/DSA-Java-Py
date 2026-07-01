import java.util.Stack;

class Solution {
	public ArrayList<Integer> nextLargerElement(int[] arr) {
		// code here
		Stack<Integer> stack = new Stack<>();
		ArrayList<Integer> ans = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) {
			ans.add(-1);
		}
		
		for (int i = arr.length - 1; i >= 0; i--) {
			while (!stack.isEmpty() && stack.peek() <= arr[i]) {
				stack.pop();
				
			}
			if (!stack.empty()) {
				ans.set(i, stack.peek());
			}
			
			stack.push(arr[i]);
		}
		
		return ans;
	}
}
