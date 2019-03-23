class Solution {
    public List<String> restoreIpAddresses(String s) {
        List<String> result = new LinkedList<>();
        DFS(s, result, new LinkedList<>(), 0);
        return result;
    }
    
    private void DFS(String s, List<String> result, List<String> current, int index) {
        if (current.size() > 4) {
            return;
        }
        if (current.size() == 4 && index == s.length()) {
            StringBuilder sb = new StringBuilder();
            for (String str : current) {
                sb.append(str);
                sb.append(".");
            }
            result.add(sb.substring(0, sb.length() - 1).toString());
            return;
        }
        int i;
        for (i = index; i < s.length(); i++) {
            String possible = s.substring(index, i + 1);
            if (inBound(possible)) {
                current.add(possible);
                DFS(s, result, current, i + 1);
                current.remove(current.size() - 1);
            }
        }
    }
    
    private boolean inBound(String val) {
        if (val.length() > 3) {
            return false;
        }
        if (val.startsWith("0") && val.length() > 1) {
            return false;
        }
        int v = Integer.parseInt(val);
        return v >= 0 && v < 256;
    }
}