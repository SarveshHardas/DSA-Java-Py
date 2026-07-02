import java.util.HashSet;

class Solution {
    public ArrayList<Integer> missingRange(int[] arr, int low, int high) {
        // code here
        Set<Integer> map = new HashSet<>();
        for(int x: arr){
            map.add(x);
        }
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = low; i < high + 1; i++){
            if(map.contains(i) == false){
                ans.add(i);
            }
        }
        
        return ans;
    }
}