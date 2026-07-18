class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int[] x: image){
            for(int i = 0; i < x.length/2; i++){
                int temp = x[i];
                x[i] = x[x.length-i-1];
                x[x.length-i-1] = temp;
            }

            for(int i = 0; i < x.length; i++){
                x[i] ^= 1;
            }
        }

        return image;
    }
}