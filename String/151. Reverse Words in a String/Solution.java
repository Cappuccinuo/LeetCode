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

public class Solution3 {
    public String reverseWords(String s) {
        String[] afterSplit = s.trim().split("\\s+");
        int start = 0;
        int end = afterSplit.length - 1;
        while (start < end) {
            String temp = afterSplit[start];
            afterSplit[start] = afterSplit[end];
            afterSplit[end] = temp;
            start++;
            end--;
        }
        StringBuilder sb = new StringBuilder();
        for (String str : afterSplit) {
            sb.append(str);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}

public class Solution4 {
    public String reverseWords(String s) {
        if (s.length() == 0) {
            return "";
        }
        String[] afterSplit = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = afterSplit.length - 1; i >= 0; i--) {
            sb.append(afterSplit[i]).append(" ");
        }
        return sb.toString().trim();
    }
}