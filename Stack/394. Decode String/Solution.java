class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<String> strStack = new Stack<>();
        String result = "";
        int index = 0;
        while (index < s.length()) {
            char curr = s.charAt(index);
            if (Character.isDigit(curr)) {
                int count = 0;
                while (Character.isDigit(s.charAt(index))) {
                    count = 10 * count + (s.charAt(index) - '0');
                    index++;
                }
                numStack.push(count);
            }
            
            else if (curr == '[') {
                strStack.push(result);
                result = "";
                index++;
            }
            
            else if (curr == ']') {
                int mulTime = numStack.pop();
                String preStr = strStack.pop();
                StringBuilder sb = new StringBuilder(preStr);
                for (int i = 0; i < mulTime; i++) {
                    sb.append(result);
                }
                result = sb.toString();
                index++;
            }
            
            else {
                result += s.charAt(index);
                index++;
            }
        }
        return result;
    }
}