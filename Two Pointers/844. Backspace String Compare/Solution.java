class Solution {
    public boolean backspaceCompare(String S, String T) {
        int back = 0;
        int sLen = S.length();
        int tLen = T.length();
        int i = sLen - 1;
        int j = tLen - 1;
        
        while (true) {
            back = 0;
            while (i >= 0 && (back > 0 || S.charAt(i) == '#')) {
                back += S.charAt(i) == '#' ? 1 : -1;
                i--;
            }
            back = 0;
            while (j >= 0 && (back > 0 || T.charAt(j) == '#')) {
                back += T.charAt(j) == '#' ? 1 : -1;
                j--;
            }
            
            if (i == -1 && j == -1) {
                return true;
            }
            
            if (i == -1 || j == -1) {
                return false;
            }
            
            if (S.charAt(i) != T.charAt(j)) {
                return false;
            }
            
            i--;
            j--;
        }
    }
}


class Solution {
    public boolean backspaceCompare(String S, String T) {
        return build(S).equals(build(T));
    }
    
    private String build(String str) {
        Stack<Character> stack = new Stack<>();
        char[] array = str.toCharArray();
        
        for (char c : array) {
            if (c != '#') {
                stack.push(c);
            }
            else if (!stack.isEmpty()) {
                stack.pop();
            }
        }

        return String.valueOf(stack);
    }
}

class Solution {
    public boolean backspaceCompare(String S, String T) {
        int back;
        int i = S.length() - 1;
        int j = T.length() - 1;
        
        while (true) {
            back = 0;
            while (i >= 0 && (back > 0 || S.charAt(i) == '#')) {
                if (S.charAt(i) == '#') {
                    back++;
                }
                else {
                    back--;
                }
                i--;
            }
            back = 0;
            while (j >= 0 && (back > 0 || T.charAt(j) == '#')) {
                if (T.charAt(j) == '#') {
                    back++;
                }
                else {
                    back--;
                }
                j--;
            }
            if (i >= 0 && j >= 0 && S.charAt(i) == T.charAt(j)) {
                i--;
                j--;
            }
            else {
                return i == -1 && j == -1;
            }
        }
    }
}