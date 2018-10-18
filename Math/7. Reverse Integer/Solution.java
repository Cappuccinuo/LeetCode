class Solution {
    public int reverse(int x) {
        long result = 0;
        
        while (x != 0) {
            result = result * 10 + x % 10;
            x = x / 10;
            if (result > Integer.MAX_VALUE || result < Integer.MIN_VALUE) {
                return 0;
            }
        }
        return (int) result;
    }
}

class Solution {
    public int reverse(int x) {
        boolean negative = x < 0;
        String str = String.valueOf(x);
        str = negative ? reverse(str.substring(1)) : reverse(str);
        if (negative) {
            if (0 - Long.parseLong(str) < Integer.MIN_VALUE) {
                return 0;
            }
            else {
                return 0 - Integer.parseInt(str);
            }
        }
        else {
            if (Long.parseLong(str) > Integer.MAX_VALUE) {
                return 0;
            }
            else {
                return Integer.parseInt(str);
            }
        }
    }
    
    private String reverse(String str) {
        char[] array = str.toCharArray();
        int start = 0;
        int end = array.length - 1;
        while (start < end) {
            char temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            start++;
            end--;
        }
        return new String(array);
    }
}