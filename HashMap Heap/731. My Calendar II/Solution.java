class MyCalendarTwo {
    TreeMap<Integer, Integer> calendar;
    public MyCalendarTwo() {
        calendar = new TreeMap<>();
    }
    
    public boolean book(int start, int end) {
        calendar.put(start, calendar.getOrDefault(start, 0) + 1);
        calendar.put(end, calendar.getOrDefault(end, 0) - 1);
        int consecutive = 0;
        for (int d : calendar.values()) {
            consecutive += d;
            if (consecutive >= 3) {
                calendar.put(start, calendar.getOrDefault(start, 0) - 1);
                calendar.put(end, calendar.getOrDefault(end, 0) + 1);
                if (calendar.get(start) == 0) {
                    calendar.remove(start);
                }
                return false;
            }
        }
        return true;
    }
}

/**
 * Your MyCalendarTwo object will be instantiated and called as such:
 * MyCalendarTwo obj = new MyCalendarTwo();
 * boolean param_1 = obj.book(start,end);
 */