class Solution {
    public List<List<String>> partition(String s) {
        List<List<String>> result = new LinkedList<>();
        DFS(result, new LinkedList<String>(), 0, s);
        return result;
    }
    
    private void DFS(List<List<String>> result, List<String> current, int index, String s) {
        if (index == s.length()) {
            result.add(new LinkedList<>(current));
            return;
        }
        
        for (int i = index; i < s.length(); i++) {
            if (isPalindrome(s.substring(index, i + 1))) {
                current.add(s.substring(index, i + 1));
                DFS(result, current, i + 1, s);
                current.remove(current.size() - 1);
            }
        }
    }
    
    private boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length() - 1;
        while (start < end) {
            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}