class Solution {
    public int romanToInt(String s) {
        int[] map = new int[400];
        map['I'] = 1;
        map['V'] = 5;
        map['X'] = 10;
        map['L'] = 50;
        map['C'] = 100;
        map['D'] = 500;
        map['M'] = 1000;
        
        int result = 0;
        
        for (int i = 0; i < s.length() - 1; i++) {
            if (map[s.charAt(i)] >= map[s.charAt(i + 1)]) {
                result += map[s.charAt(i)];
            }
            else {
                result -= map[s.charAt(i)];
            }
        }
        result += map[s.charAt(s.length() - 1)];
        return result;
    }
}