class Solution {
    public boolean canPermutePalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        //int even = 0;
        //int odd = 0;
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (Integer i : map.values()) {
            /*
            if (i % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
            */
            count += i % 2;
        }
        //return (odd < 2 && even != 0) || (odd == 1 && even == 0);
        return count <= 1;
    }
}