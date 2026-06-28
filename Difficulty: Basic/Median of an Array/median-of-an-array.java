import java.util.Arrays;
class Solution {
    public double findMedian(int[] arr) {
        // Code here.
        Arrays.sort(arr);
        if(arr.length % 2 == 1){
            return arr[arr.length/2];
        }else{
            return (float)((float)arr[arr.length/2] + (float)arr[(arr.length/2) - 1])/2;
        }
    }
}
