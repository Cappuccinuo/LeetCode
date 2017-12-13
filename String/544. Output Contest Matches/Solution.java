class Solution {
    public String findContestMatch(int n) {
        String[] contest = new String[n];
        for (int i = 0; i < n; i++) {
            contest[i] = String.valueOf(i + 1);
        }
        while (n > 1) {
            for (int i = 0; i < n / 2; i++) {
                contest[i] = "(" + contest[i] + "," + contest[n - i - 1] + ")";
            }
            n = n / 2;
        }
        return contest[0];
    }
}