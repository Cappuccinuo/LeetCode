class Solution {
    public int calculateTime(String keyboard, String word) {
        int[] index = new int[26];
        int i;
        for (i = 0; i < keyboard.length(); i++) {
            char c = keyboard.charAt(i);
            index[c - 'a'] = i;
        }
        
        int current = 0;
        int time = 0;
        
        for (char ch : word.toCharArray()) {
            int ind = index[ch - 'a'];
            time += Math.abs(current - ind);
            current = ind;
        }
        
        return time;
    }
}

class Solution {
    public int calculateTime(String keyboard, String word) {
        int current = 0;
        int time = 0;
        
        for (char c : word.toCharArray()) {
            int index = keyboard.indexOf(c);
            time += Math.abs(current - index);
            current = index;
        }
        
        return time;
    }
}