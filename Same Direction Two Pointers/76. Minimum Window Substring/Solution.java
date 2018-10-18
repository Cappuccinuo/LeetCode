class Solution {
    public String minWindow(String s, String t) {
        int[] map = new int[256];
        int totalChar = 0;
        for (char c : t.toCharArray()) {
            map[c]++;
            if (map[c] == 1) {
                totalChar++;
            }
        }
        
        int start = 0;
        int end = 0;
        int count = 0;
        int len = s.length();
        String ans = "";
        int min = s.length() + 1;
        int[] freq = new int[256];
        
        while (start < len) {
            while (end < len && count < totalChar) {
                char c = s.charAt(end);
                freq[c]++;
                if (freq[c] == map[c]) {
                    count++;
                }
                end++;
            }
            if (count >= totalChar) {
                if (end - start < min) {
                    ans = s.substring(start, end);
                    min = end - start;
                }
            }
            
            
            char c = s.charAt(start);
            start++;
            if (freq[c] == map[c]) {
                count--;
            }
            freq[c]--;
        }
        
        return ans;
    }
}

class Solution {
    public String minWindow(String s, String t) {
        int[] map = new int[256];
        int totalChar = 0;
        for (char c : t.toCharArray()) {
            map[c]++;
            if (map[c] == 1) {
                totalChar++;
            }
        }
        
        int start = 0;
        int end = 0;
        int count = 0;
        int len = s.length();
        String ans = "";
        int min = s.length() + 1;
        int[] freq = new int[256];
        
        while (end < len) {
            char c = s.charAt(end);
            end++;
            freq[c]++;
            if (freq[c] == map[c]) {
                count++;
            }
            
            while (count >= totalChar) {
                if (end - start < min) {
                    ans = s.substring(start, end);
                    min = end - start;
                }
                char ch = s.charAt(start);
                start++;
                if (freq[ch] == map[ch]) {
                    count--;
                }
                freq[ch]--;
            } 
        }
        
        return ans;
    }
}