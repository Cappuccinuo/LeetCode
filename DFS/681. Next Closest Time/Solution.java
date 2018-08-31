class Solution {
    String result;
    int diff = Integer.MAX_VALUE;
    
    public String nextClosestTime(String time) {
        Set<Integer> digits = new HashSet();
        digits.add(Integer.parseInt(time.substring(0, 1)));
        digits.add(Integer.parseInt(time.substring(1, 2)));
        digits.add(Integer.parseInt(time.substring(3, 4)));
        digits.add(Integer.parseInt(time.substring(4, 5)));
        
        if (digits.size() == 1) {
            return time;
        }
        
        result = time;
        
        List<Integer> list = new ArrayList<>(digits);
        int minute = Integer.parseInt(time.substring(0, 2)) * 60 + Integer.parseInt(time.substring(3, 5));
        dfs(list, "", minute, 0);
        
        return result;
    }
    
    private void dfs(List<Integer> digits, String current, int target, int pos) {
        if (pos == 4) {
            int minute = Integer.parseInt(current.substring(0, 2)) * 60 + Integer.parseInt(current.substring(2, 4));
            if (minute == target) {
                return;
            }
            int d = minute - target > 0 ? minute - target : 1440 + minute - target;
            if (d < diff) {
                diff = d;
                result = current.substring(0, 2) + ":" + current.substring(2, 4);
            }
            return;
        }
        
        for (int i = 0; i < digits.size(); i++) {
            if (pos == 0 && digits.get(i) > 2) {
                continue;
            }
            if (pos == 1 && Integer.parseInt(current) * 10 + digits.get(i) > 23) {
                continue;
            }
            if (pos == 2 && digits.get(i) > 5) {
                continue;
            }
            if (pos == 3 && Integer.parseInt(current.substring(2)) * 10 + digits.get(i) > 59) {
                continue;
            }
            dfs(digits, current + digits.get(i), target, pos + 1);
        }
    }
}