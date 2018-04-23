class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] letters = s.toCharArray();
        for (char letter : letters) {
            if (!stack.isEmpty()) {
                char top = stack.peek();
                if (isMatch(letter, top)) {
                    stack.pop();
                    continue;
                }
            }
            stack.push(letter);
        }

        return stack.isEmpty();
    }
    
    private boolean isMatch(char letter, char top) {
        return letter == ')' && top == '(' 
            || letter == ']' && top == '['
            || letter == '}' && top == '{';
    }
}