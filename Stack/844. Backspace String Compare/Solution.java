class Solution {
    public boolean backspaceCompare(String S, String T) {
        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();
        
        String res1 = getResult(s1, S);
        String res2 = getResult(s2, T);
        return res1.equals(res2);
    }
    
    private String getResult(Stack<Character> stack, String str) {
        for (char c : str.toCharArray()) {
            if (c == '#') {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else {
                stack.push(c);
            }
        }
        return new String(stack.toString());
    }
}