import java.util.HashSet;

class Solution {
    static int countDistinct(int arr[]) {
        // code here
        Set<Integer> freq = new HashSet<>();
        for(int a: arr){
            freq.add(a);
        }
        
        return freq.size();
    }
}