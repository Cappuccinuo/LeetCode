class Solution {
    public String gcdOfStrings(String str1, String str2) {
        return GCD(str1, str2);
    }
    
    private String GCD(String str1, String str2) {
        if (str1.equals("")) {
            return str2;
        }
        if (str2.equals("")) {
            return str1;
        }
        if (str1.equals(str2)) {
            return str1;
        }
        if (str1.length() > str2.length()) {
            int i;
            for (i = 0; i < str2.length(); i++) {
                if (str1.charAt(i) != str2.charAt(i)) {
                    return "";
                }
            }
            return GCD(str1.substring(str2.length()), str2);
        }
        else if (str1.length() < str2.length()) {
            return GCD(str2, str1);
        }
        else {
            return "";
        }
    }
}