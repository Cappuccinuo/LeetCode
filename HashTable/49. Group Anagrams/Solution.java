class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new LinkedList<>();
        if (strs == null || strs.length == 0) {
            return result;
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String newStr = new String(arr);
            if (map.containsKey(newStr)) {
                map.get(newStr).add(str);
            }
            else {
                List<String> temp = new LinkedList<>();
                temp.add(str);
                map.put(newStr, temp);
            }
        }
        
        for (List<String> list : map.values()) {
            result.add(list);
        }
        
        return result;
    }
}

class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new LinkedList<>();
        if (strs == null || strs.length == 0) {
            return result;
        }
        
        Map<String, List<String>> map = new HashMap<>();
        int[] count = new int[26];
        
        for (String str : strs) {
            Arrays.fill(count, 0);
            
            char[] letters = str.toCharArray();
            for (char letter : letters) {
                count[letter - 'a']++;
            }
            
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append(count[i]);
                sb.append("#");
            }
            
            String key = sb.toString();
            if (!map.containsKey(key)) {
                map.put(key, new LinkedList<>());
            }
            map.get(key).add(str);
        }
        
        for (String k : map.keySet()) {
            result.add(map.get(k));
        }
        
        return result;
    }
}