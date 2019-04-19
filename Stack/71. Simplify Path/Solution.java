class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        
        String[] strs = path.split("/");
        
        int i;
        int len = strs.length;
        
        for (i = 0; i < len; i++) {
            String str = strs[i];

            if (str.equals(".") || str.equals("")) {
                continue;
            }
            else if (str.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            }
            else {
                stack.push(str);
            }
        }
        
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.insert(0, "/" + stack.pop());
        }

        if (sb.length() == 0) {
            sb.append("/");
        }
        
        return sb.toString();
    }
}