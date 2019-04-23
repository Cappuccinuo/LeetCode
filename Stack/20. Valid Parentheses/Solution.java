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

class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        char[] letters = s.toCharArray();
        for (char letter : letters) {
            if (letter == '(' || letter == '[' || letter == '{') {
                stack.push(letter);
            }
            else {
                if (!stack.isEmpty()) {
                    if (!checkEqual(stack.pop(), letter)) {
                        return false;
                    }
                }
                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    
    private boolean checkEqual(char a, char b) {
        return a == '(' && b == ')' ||
            a == '[' && b == ']' ||
            a == '{' && b == '}';
    }
}