public class Solution {
    /**
     * @param s: an expression includes numbers, letters and brackets
     * @return: a string
     */
    public String expressionExpand(String s) {
        // write your code here
        if (s == null || s.length() == 0) {
            return "";
        } 
        Stack<String> stack = new Stack<>();
        String result = "";
        
        char[] array = s.toCharArray();
    
        for (char ch : array) {
            if (ch != ']') {
                stack.push(ch + "");
            }
            else {
                String str = "";
                while (!stack.peek().equals("[")) {
                    str = stack.pop() + str;
                }
                
                stack.pop();
                
                String num = "";
                while (!stack.isEmpty() && isNum(stack.peek())) {
                    num = stack.pop() + num;
                }
                int count = Integer.parseInt(num);
                
                if (count != 0) {
                    String newStr = "";
                    for (int i = 0; i < count; i++) {
                        newStr += str;
                    }
                    stack.push(newStr);
                }
            }
        }
        while (!stack.isEmpty()) {
            result = stack.pop() + result;
        }
        return result;
    }
    
    private boolean isNum(String str) {
        return str.charAt(0) >= '0' && str.charAt(0) <= '9';
    }
}

public class Solution {
    /**
     * @param s: an expression includes numbers, letters and brackets
     * @return: a string
     */
    public String expressionExpand(String s) {
        // write your code here
        if (s == null || s.length() == 0) {
            return "";
        }
        
        Stack<String> tempStr = new Stack<>();
        Stack<Integer> counts = new Stack<>();
        String result = "";
        
        int i = 0;
        int count = 0;
        
        while (i < s.length()) {
            if (Character.isDigit(s.charAt(i))) {
                while (Character.isDigit(s.charAt(i))) {
                    count = count * 10 + s.charAt(i) - '0';
                    i++;
                }
                counts.push(count);
                count = 0;
            }
            else if (s.charAt(i) == '[') {
                tempStr.push(result);
                result = "";
                i++;
            }
            else if (s.charAt(i) == ']') {
                String str = tempStr.pop();
                int cnt = counts.pop();
                while (cnt-- > 0) {
                    str = str + result;
                }
                result = str;
                i++;
            }
            else {
                result += s.charAt(i);
                i++;
            }
        }
        
        return result;
    }
}