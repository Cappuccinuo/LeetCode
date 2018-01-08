class Solution {
    public String reverseString(String s) {
        return new StringBuffer(s).reverse().toString();
    }
}

class Solution {
    public String reverseString(String s) {
        char[] arr = s.toCharArray();
        char[] result = new char[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            result[i] = arr[arr.length - 1 - i];
        }
        return new String(result);
    }
}

class Solution {
    public String reverseString(String s) {
        int head = 0;
        int tail = s.length() - 1;
        char[] reverse = s.toCharArray();
        while (head < tail) {
            reverse[head] = s.charAt(tail);
            reverse[tail--] = s.charAt(head++);
        }
        return new String(reverse);
    }
}