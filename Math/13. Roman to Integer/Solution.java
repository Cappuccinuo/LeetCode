class Solution {
    public int romanToInt(String s) {
        Map<Character, Integer> vals = new HashMap<>();
        vals.put('I', 1);
        vals.put('V', 5);
        vals.put('X', 10);
        vals.put('L', 50);
        vals.put('C', 100);
        vals.put('D', 500);
        vals.put('M', 1000);
        
        char[] array = s.toCharArray();
        int i;
        int res = 0;
        int len = array.length;
        for (i = 0; i < len; i++) {
            int current = vals.get(array[i]);
            int next = (i == len - 1) ? 0 : vals.get(array[i + 1]);
            res += current < next ? -current : current;
        }
        return res;
    }
}