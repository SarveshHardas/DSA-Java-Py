class Solution {
    public boolean backspaceCompare(String s, String t) {
        int curr = 0;

        StringBuilder s_builder = new StringBuilder();
        StringBuilder t_builder = new StringBuilder();

        while(curr < s.length()){
            if(s.charAt(curr) == '#'){
                if(s_builder.length() > 0){
                    s_builder.deleteCharAt(s_builder.length() - 1);
                }
            }else{
                s_builder.append(s.charAt(curr));
            }

            curr++;
        }
        
        curr = 0;
        while(curr < t.length()){
            if(t.charAt(curr) == '#'){
                if(t_builder.length() > 0){
                    t_builder.deleteCharAt(t_builder.length() - 1);
                }
            }else{
                t_builder.append(t.charAt(curr));
            }
            curr++;
        }

        return s_builder.toString().equals(t_builder.toString());
    }
}