class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        // 1971-1-1 Friday
        int initY = 1971;
        int initM = 1;
        int initD = 1;
        String[] days = new String[]{"Friday", "Saturday", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday"};
        int[] monthDays = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        int count = 0;
        int yearDiff = year - initY;
        count += yearDiff * 365;

        int i;
        for (i = initY; i < year; i++) {
            if (i % 4 == 0) {
                count += 1;
            }
        }
        for (i = initM; i < month; i++) {
            count += monthDays[i - 1];
            if (i == 2 && year % 4 == 0) {
                count += 1;
            }
        }
        
        count += (day - initD);
        return days[count % 7];
    }
}