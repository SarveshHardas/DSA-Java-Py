import java.util.HashSet;

class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        Set<Integer> set_a = new HashSet<>();
        Set<Integer> set_b = new HashSet<>();
        Set<Integer> ans = new HashSet<>();
        ArrayList<Integer> anslist = new ArrayList<>();
        for(int x: a){
            set_a.add(x);
        }
        
        for(int y: b){
            set_a.add(y);
        }
        
        for(int z: set_a){
            ans.add(z);
        }
        for(int w: set_b){
            ans.add(w);
        }
        
        for(int i : ans){
            anslist.add(i);
        }
        
        return anslist;
    }
}