class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();

        mergeSort(nums, 0, nums.length - 1);

        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            if (n == target) {
                ans.add(i);
            }
        }

        return ans;
    }

    public void mergeSort(int[] nums, int l, int r) {
        if (l >= r) {
            return;
        }
        int mid = l + (r - l) / 2;

        mergeSort(nums, l, mid);
        mergeSort(nums, mid + 1, r);

        merge(nums, l, mid, r);

    }

    public void merge(int[] nums, int left, int mid, int right) {
        int n1 = mid - left + 1;
        int n2 = right - mid;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; ++i) {
            leftArr[i] = nums[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArr[j] = nums[mid + 1 + j];
        }

        int i = 0;
        int j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                nums[k] = leftArr[i];
                i++;
            } else {
                nums[k] = rightArr[j];
                j++;
            }

            k++;
        }

        while (i < n1) {
            nums[k] = leftArr[i];
            k++;
            i++;
        }

        while (j < n2) {
            nums[k] = rightArr[j];
            k++;
            j++;
        }
    }
}