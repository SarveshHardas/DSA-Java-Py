class Solution {
    public int calculateScore(int a, int b) {
        String binary_a = Integer.toBinaryString(a);
        String binary_b = Integer.toBinaryString(b);

        int s1 = 0;
        int s2 = 0;
        for(int i = 0 ; i < binary_a.length() ; i++){
            if(binary_a.charAt(i) == '1'){
                s1++;
            }
        }

        for(int i = 0 ; i < binary_b.length() ; i++){
            if(binary_b.charAt(i) == '1'){
                s2++;
            }
        }

        if(s1 >= s2) return s1 * s2;

        return s2/s1;
    }
}