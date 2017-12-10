class Solution {
    public List<String> generatePossibleNextMoves(String s) {
        List<String> list = new ArrayList<>();
        if (s.length() <= 1) {
            return list;
        }
        String ans = "";
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1) && s.charAt(i) == '+') {
                ans = flip(i, s);
                list.add(ans);
            }
        }
        return list;
    }
    
    public String flip(int i, String s) {
        String res = "";
        res += s.substring(0, i) + "--" + s.substring(i + 2, s.length());
        return res;
    }
}