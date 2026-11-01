class Solution {
    public int reversePairs(int[] nums) {
        int[] arr = Arrays.copyOf(nums, nums.length);
        int n = arr.length;

        if (n < 2) {
            return 0;
        }

        return mergeSort(arr, 0, n - 1);
    }

    private int mergeSort(int[] arr, int l, int r) {
        if (l >= r) {
            return 0;
        }

        int mid = l + (r - l) / 2;
        int pairs = 0;

        pairs += mergeSort(arr, l, mid);
        pairs += mergeSort(arr, mid + 1, r);
        pairs += countCrossPairs(arr, l, mid, r);
        mergeSortedHalves(arr, l, mid, r);

        return pairs;
    }

    private int countCrossPairs(int[] arr, int left, int mid, int right) {
        int pairs = 0;
        int rightPtr = mid + 1;

        for (int leftPtr = left; leftPtr <= mid; leftPtr++) {
            long leftValue = arr[leftPtr];
            while (rightPtr <= right && leftValue > 2L * arr[rightPtr]) {
                rightPtr++;
            }

            pairs += rightPtr - (mid + 1);
        }

        return pairs;
    }

    private void mergeSortedHalves(int[] arr, int l, int mid, int r) {
        int[] merged = new int[r - l + 1];
        int first = l;
        int second = mid+1;
        int write = 0;

        while(first <= mid && second <= r){
            if(arr[first] <= arr[second]){
                merged[write++] = arr[first++];
            }else{
                merged[write++] = arr[second++];
            }
        }

        while(first <= mid){
            merged[write++] = arr[first++];
        }

        while(second <= r){
            merged[write++] = arr[second++];
        }

        for(int i = 0; i < merged.length; i++){
            arr[l + i] = merged[i];
        }
    }
}