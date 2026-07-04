import java.util.*;

class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Integer> s = new Stack<>();
        
        boolean[] vis = new boolean[adj.size()];
        
        s.push(0);
        
        while(!s.isEmpty()){
            int curr = s.pop();
            if(vis[curr]){
                continue;
            }
            vis[curr] = true;
            ans.add(curr);
            
            for(int i = adj.get(curr).size()-1; i >= 0; i--){
                int child = adj.get(curr).get(i);
                if(!vis[child]){
                    s.push(child);
                }
            }
        }
        
        return ans;
    }
}