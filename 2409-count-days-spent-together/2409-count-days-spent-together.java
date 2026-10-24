class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice,
                                 String arriveBob, String leaveBob) {

        int arriveA = toDayOfYear(arriveAlice);
        int leaveA = toDayOfYear(leaveAlice);
        int arriveB = toDayOfYear(arriveBob);
        int leaveB = toDayOfYear(leaveBob);

        int start = Math.max(arriveA, arriveB);
        int end = Math.min(leaveA, leaveB);

        return Math.max(0, end - start + 1);
    }

    private int toDayOfYear(String date) {
        String[] parts = date.split("-");

        int month = Integer.parseInt(parts[0]);
        int day = Integer.parseInt(parts[1]);

        int[] daysInMonth = {
            31, 28, 31, 30, 31, 30,
            31, 31, 30, 31, 30, 31
        };

        int total = day;

        for (int i = 0; i < month - 1; i++) {
            total += daysInMonth[i];
        }

        return total;
    }
}
