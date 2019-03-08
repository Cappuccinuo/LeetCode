class Solution {
    public String reorganizeString(String S) {
        char[] letters = S.toCharArray();
        int len = letters.length;
        int[] map = new int[26];
        int max = 0;
        int maxIndex = -1;
        for (char c : letters) {
            map[c - 'a']++;
            if (map[c - 'a'] > max) {
                maxIndex = c - 'a';
            }
            max = Math.max(map[c - 'a'], max);
        }
        if (max > (len + 1) / 2) {
            return "";
        }
        char[] res = new char[len];
        int i = 0;
        while (map[maxIndex] > 0) {
            res[i] = (char)(maxIndex + 'a');
            map[maxIndex]--;
            i += 2;
        }
        int j;        
        for (j = 0; j < 26; j++) {
            char c = (char)(j + 'a');
            while (map[j] > 0) {
                if (i >= len) {
                    i = 1;
                }
                res[i] = c;
                map[j]--;
                i += 2;
            }
        }
        return new String(res);
    }
}

class Solution {
    public String reorganizeString(String S) {
        int N = S.length();
        int count[] = new int[26];
        for (char ch : S.toCharArray()) {
            count[ch - 'a']++;
        }
        PriorityQueue<newChar> pq = new PriorityQueue<>( (n1, n2) ->
                            (n1.count == n2.count ? n1.ch - n2.ch : n2.count - n1.count));
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                if (count[i] > (N + 1) / 2) {
                    return "";
                }
                pq.offer(new newChar(count[i], (char)('a' + i)));
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while (pq.size() >= 2) {
            newChar n1 = pq.poll();
            newChar n2 = pq.poll();
            
            sb.append(n1.ch);
            sb.append(n2.ch);
            if (--n1.count > 0) {
                pq.offer(n1);
            }
            if (--n2.count > 0) {
                pq.offer(n2);
            }
        }
        
        if (pq.size() > 0) {
            sb.append(pq.poll().ch);
        }
        
        return sb.toString();
    }
}

class newChar {
    int count;
    char ch;
    newChar(int c, char ch) {
        this.count = c;
        this.ch = ch;
    }
}