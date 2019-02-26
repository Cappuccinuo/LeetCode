class Solution {
    public List<String> findRepeatedDnaSequences(String s) {
        if (s.length() <= 10) {
            return new LinkedList<String>();
        }
        Map<Character, Integer> map = new HashMap<>();
        map.put('A', 0);
        map.put('C', 1);
        map.put('G', 2);
        map.put('T', 3);
        
        Set<Integer> set = new HashSet();
        Set<String> result = new HashSet();

        int end = 10;
        int start = 0;
        int current = 0;
        int len = s.length();
        char[] letters = s.toCharArray();
        
        int i;
        for (i = 0; i < 10; i++) {
            char c = letters[i];
            int val = map.get(c);
            current = (current << 2) | val;
        }
        set.add(current);
        
        while (end < len) {
            char c = letters[end];
            start++;
            end++;
            int val = map.get(c);
            current = current & 0x3FFFF;
            current = (current << 2) | val;

            if (set.contains(current)) {
                result.add(s.substring(start, end));
            }
            else {
                set.add(current);
            }
        }
        
        return new LinkedList<>(result);
    }
}