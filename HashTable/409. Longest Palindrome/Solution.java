// 2018.3.19

class Solution {
    public int longestPalindrome(String s) {
        Map<Character, Integer> map = new HashMap<>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            map.put(chars[i], map.getOrDefault(chars[i], 0) + 1);
        }
        int result = 0;
        boolean hasOdd = false;
        for (Integer i : map.values()) {
            if (i % 2 == 0) {
                result += i;
            }
            else {
                hasOdd = true;
                result += i - 1;
            }
        }
        return hasOdd ? result + 1 : result;
    }
}