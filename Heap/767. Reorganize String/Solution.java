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