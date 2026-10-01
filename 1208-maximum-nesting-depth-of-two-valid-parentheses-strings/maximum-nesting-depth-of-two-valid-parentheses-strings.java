class Solution {
    public int[] maxDepthAfterSplit(String seq) {
        int count = 0;
        int[] ans = new int[seq.length()];

        for(int i = 0; i < seq.length(); i++){
            char ch = seq.charAt(i);
            if( ch == '(' ){
                ans[i] = count % 2;
                count++;
            }else{
                ans[i] = (count - 1) % 2;
                count--;
            }
        }

        return ans;
    }
}