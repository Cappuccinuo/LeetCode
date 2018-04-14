// 2018.4.13
class Solution {
    public int firstUniqChar(String s) {
        int firstIndex = s.length();
        for (char c = 'a'; c <= 'z'; c++) {
            int index = s.indexOf(c);
            if (index != -1 && s.lastIndexOf(c) == index) {
                firstIndex = Math.min(firstIndex, index);
            }
        }
        return firstIndex == s.length() ? -1 : firstIndex;
    }
}



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