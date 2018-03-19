// 34ms
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^0-9a-zA-Z]", "").toUpperCase();
        if (s.length() == 0) {
            return true;
        }
        return palindromeHelper(s, 0, s.length() - 1);
    }
    
    public boolean palindromeHelper(String s, int start, int end) {
        if (end < start) {
            return false;
        }
        while (start < end) {
            if (s.charAt(start) != s.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

// 4ms
class Solution {
    public boolean isPalindrome(String s) {
        if (s.length() == 0) {
            return true;
        }
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            char start = s.charAt(i);
            char end = s.charAt(j);
            if ((start < 'A' || start > 'Z') 
                && (start < 'a' || start > 'z') 
                && (start < '0' || start > '9')) {
                i++;
                continue;
            }
            if ((end < 'A' || end > 'Z') 
                && (end < 'a' || end > 'z') 
                && (end < '0' || end > '9')) {
                j--;
                continue;
            }
            if (start != end) {
                if ((start >= 'A' && start <= 'Z') 
                    || (start >= 'a' && start <= 'z')) {
                    if (start - 'A' == end - 'a' 
                        || start - 'a' == end - 'A') {
                        i++;
                        j--;
                        continue;
                    }
                }
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}

// 2018.3.17
class Solution {
    public boolean isPalindrome(String s) {
        return Helper(s, 0, s.length() - 1);
    }
    
    private boolean Helper(String str, int start, int end) {
        while (start < end) {
            char s = str.charAt(start);
            char e = str.charAt(end);
            if (!Character.isLetterOrDigit(s)) {
                start++;
            }
            if (!Character.isLetterOrDigit(e)) {
                end--;
            }
            if (Character.isLetterOrDigit(s) && Character.isLetterOrDigit(e)) {
                if (Character.toUpperCase(s) == Character.toUpperCase(e)) {
                    start++;
                    end--;
                }
                else {
                    return false;
                }
            }
        }
        return true;
    }
}