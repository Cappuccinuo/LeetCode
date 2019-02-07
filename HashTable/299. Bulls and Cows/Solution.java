class Solution {
    public String getHint(String secret, String guess) {
        int[] sc = new int[10];
        int[] gc = new int[10];
        int cow = 0;
        int bull = 0;
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bull++;
            }
            else {
                sc[secret.charAt(i) - '0']++;
                gc[guess.charAt(i) - '0']++;
            }
        }
        for (int i = 0; i < 10; i++) {
            cow += Math.min(sc[i], gc[i]);
        }
        return bull + "A" + cow + "B";
    }
}

class Solution {
    public String getHint(String secret, String guess) {
        Map<Integer, Character> index = new HashMap<>();
        Map<Character, Integer> frequency = new HashMap<>();
        
        char[] s = secret.toCharArray();
        for (int i = 0; i < s.length; i++) {
            index.put(i, s[i]);
            frequency.put(s[i], frequency.getOrDefault(s[i], 0) + 1);
        }
        
        int bull = 0;
        char[] g = guess.toCharArray();
        for (int i = 0; i < g.length; i++) {
            if (!frequency.containsKey(g[i])) {
                continue;
            }
            if (index.get(i) == g[i]) {
                bull++;
                frequency.put(g[i], frequency.get(g[i]) - 1);
                g[i] = '#';
            }
        }
        int cow = 0;
        for (int i = 0; i < g.length; i++) {
            if (!frequency.containsKey(g[i])) {
                continue;
            }
            if (frequency.get(g[i]) > 0) {
                cow++;
                frequency.put(g[i], frequency.get(g[i]) - 1);
                if (frequency.get(g[i]) == 0) {
                    frequency.remove(g[i]);
                }
            }
        }
        String result = bull + "A" + cow + "B";
        return result;
    }
}