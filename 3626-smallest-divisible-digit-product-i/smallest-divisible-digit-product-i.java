class Solution {
    public int smallestNumber(int n, int t) {
        while (n > 0) {
            int local = n;
            int prod = 1;
            while (local != 0) {
                prod = prod * (local % 10);
                local /= 10;
            }

            if (prod % t == 0) {
                return n;
            }

            n++;
        }

        return n;
    }
}