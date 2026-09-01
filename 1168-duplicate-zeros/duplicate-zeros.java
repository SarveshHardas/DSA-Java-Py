class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length;

        for(int i = 0; i < n; i++){
            if(arr[i] == 0){
                int j = n-1;
                while(j > i){
                    arr[j] = arr[j-1];
                    j--;
                }
                i++;
            }
        }
    }
}