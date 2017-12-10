public class Solution1 {
    public String reverseWords(String s) {
        String[] words = s.split("\\s+");
        Map<Integer, String> map = new HashMap<>();
        for (int i = 0; i < words.length; i++) {
            map.put(words.length - i - 1, words[i].trim());
        }
        StringBuilder sb = new StringBuilder();
        for (Integer i : map.keySet()) {
            if (i == words.length) {
                sb.append(map.get(i));
            }
            sb.append(map.get(i) + " ");
        }
        return sb.toString().trim();
    }
}

public class Solution2 {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(words));
        return String.join(" ", words);
    }
}