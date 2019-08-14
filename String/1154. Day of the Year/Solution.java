class Solution {
    public int dayOfYear(String date) {
        int[] days = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] values = date.split("-");
        int month = Integer.parseInt(values[1]);
        int day = Integer.parseInt(values[2]);

        int count = 0;
        int i;
        for (i = 1; i < month; i++) {
            count += days[i - 1];
        }
        count += day;
        if (centuryYear(values[0]) && month > 2) {
            count += 1;
        }
        return count;
    }
    
    public boolean centuryYear(String year) {
        int yearValue = Integer.parseInt(year);
        if (yearValue % 4 != 0) {
            return false;
        }
        if (yearValue % 100 == 0 && yearValue % 400 == 0) {
            return true;
        }
        if (yearValue % 100 != 0) {
            return true;
        }
        return false;
    }
}