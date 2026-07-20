class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        int m = grid.length;
        int n = grid[0].length;
        int[] ans = new int[m * n];
        int l = 0;
        k %= (m * n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                ans[l] = grid[i][j];
                l += 1;
            }
        }

        reverse(ans,0,l-1);
        reverse(ans,0,k-1);
        reverse(ans,k,l-1);

        List<List<Integer>> res = new ArrayList<>();
        int idx = 0;
        for(int i = 0; i < m; i++){
            List<Integer> temp = new ArrayList<>();
            for(int j = 0; j < n; j++){
                temp.add(ans[idx]);
                idx += 1;
            }
            res.add(temp);
        }

        return res;
    }

    private int[] reverse(int[] arr, int i, int j){
        while(i<j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i += 1;
            j -= 1;
        }

        return arr;
    }
}