class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int tot = 0;
        for(int i = 0; i < k; i++){
            tot += cardPoints[i];
        }

        int best = tot;

        int i = k-1;
        int j = cardPoints.length - 1;

        while( i >= 0){
            tot += cardPoints[j] - cardPoints[i];
            best = Math.max(best,tot);
            i--;
            j--;
        }

        return best;
    }
}