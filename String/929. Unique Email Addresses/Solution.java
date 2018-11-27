class Solution {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet();
        for (String email : emails) {
            set.add(filter(email));
        }
        return set.size();
    }
    
    private String filter(String email) {
        StringBuilder sb = new StringBuilder();
        int atIndex = email.indexOf("@");
        String prev = email.substring(0, atIndex);
        String tail = email.substring(atIndex + 1);
        if (prev.indexOf("+") != -1) {
            prev = prev.substring(0, prev.indexOf("+"));
        }
        for (char c : prev.toCharArray()) {
            if (c == '.') {
                continue;
            }
            sb.append(c);
        }
        sb.append("@");
        sb.append(tail);
        return sb.toString();
    }
}