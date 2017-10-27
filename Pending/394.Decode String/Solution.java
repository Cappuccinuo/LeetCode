public class Solution {
    public String decodeString(String s) {
        Stack<Integer> numberStack = new Stack<Integer>();
        Stack<String> charStack = new Stack<String>();
        String resultString = "";
        int idx = 0;
        
        while (idx < s.length()) {
            if (Character.isDigit(s.charAt(idx))) {
                int count = 0;
                while (Character.isDigit(s.charAt(idx))) {
                    count = count * 10 + (s.charAt(idx) - '0');
                    idx++;
                }
                numberStack.push(count);
            }
            
            else if (s.charAt(idx) == "[") {
                charStack.push(resultString);
                resultString = "";
                idx++;
            }
            
            else if (s.charAt(idx) == "]") {
                StringBuilder sb = new StringBuilder(charStack.pop());
                int repeatTime = numberStack.pop();
                for (int i = 0; i < repeatTime; i++) {
                    sb.append(resultString);
                }
                resultString = sb.toString();
                idx++;
            }
            
            else {
                resultString += s.charAt(idx++);
            }
        }
        return resultString;
    }
}
