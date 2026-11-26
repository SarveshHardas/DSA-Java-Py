class Solution {
    public boolean canAliceWin(int n) {
        int removal = 10;

        while(n >= removal){
            n -= removal;
            removal -= 1;
        }

        if(removal % 2 == 0){
            return false;
        }

        return true;
    }
}