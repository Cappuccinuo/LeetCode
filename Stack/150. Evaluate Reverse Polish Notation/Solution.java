class Solution {
    public int evalRPN(String[] tokens) {
        Stack<String> stack = new Stack<>();
        String[] symbols = new String[]{"+", "-", "*", "/"};
        Set<String> operators = new HashSet(Arrays.asList(symbols));
        
        for (String token : tokens) {
            if (operators.contains(token)) {
                int second = Integer.parseInt(stack.pop());
                int first = Integer.parseInt(stack.pop());
                int result = getResult(first, second, token);
                stack.push(String.valueOf(result));
            }
            else {
                stack.push(token);
            }
        }
        
        return Integer.parseInt(stack.pop());
    }
    
    private int getResult(int first, int second, String token) {
        if (token.equals("+")) {
            return first + second;
        }
        else if (token.equals("-")) {
            return first - second;
        }
        else if (token.equals("*")) {
            return first * second;
        }
        else if (token.equals("/")) {
            return first / second;
        }
        return 0;
    }
}