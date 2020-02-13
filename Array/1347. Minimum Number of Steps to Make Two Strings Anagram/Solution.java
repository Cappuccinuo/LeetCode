class Solution {
    public int minSteps(String s, String t) {
        int[] sletters = new int[26];
        int[] tletters = new int[26];
        for (char c : s.toCharArray()) {
            sletters[c - 'a']++;
        }
        for (char c : t.toCharArray()) {
            tletters[c - 'a']++;
        }
        int i;
        for (i = 0; i < 26; i++) {
            int scount = sletters[i];
            int tcount = tletters[i];
            sletters[i] = Math.max(0, scount - tcount);
            tletters[i] = Math.max(0, scount - tcount);
        }
        
        int schange = 0;
        int tchange = 0;
        for (i = 0; i < 26; i++) {
            schange += sletters[i];
            tchange += tletters[i];
        }
        return Math.max(schange, tchange);
    }
}

class Solution {
    public int minSteps(String s, String t) {
        int[] lettersCount = new int[26];
        int i;
        int len = s.length();
        for (i = 0; i < len; i++) {
            lettersCount[s.charAt(i) - 'a']++;
            lettersCount[t.charAt(i) - 'a']--;
        }
        return Arrays.stream(lettersCount).map(Math::abs).sum() / 2;
    }
}