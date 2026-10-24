class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int aliceStart = getDay(arriveAlice, days);
        int aliceEnd = getDay(leaveAlice, days);
        int bobStart = getDay(arriveBob, days);
        int bobEnd = getDay(leaveBob, days);
        int start = Math.max(aliceStart, bobStart);
        int end = Math.min(aliceEnd, bobEnd);

        if (start > end) {
            return 0;
        }

        return end - start + 1;
    }

    public int getDay(String date, int[] days) {
        String[] parts = date.split("-");

        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);

        for (int i = 0; i < month - 1; i++) {
            day += days[i];
        }

        return day;
    }
}