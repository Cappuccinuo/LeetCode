class Solution {
    public int firstUniqChar(String s) {
        int index = -1;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for (char ch : s.toCharArray()) {
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }
        for (char ch : s.toCharArray()) {
            if (map.get(ch) == 1) {
                index = s.indexOf(ch);
                break;
            }
        }
        return index;
    }
}