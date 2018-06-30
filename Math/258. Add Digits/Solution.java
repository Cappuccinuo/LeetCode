class Solution {
    public int addDigits(int num) {
        return 1 + (num - 1) % 9;
    }
}

class Solution {
    public int addDigits(int num) {
        if (num == 0) {
            return 0;
        }
        return num % 9 == 0 ? 9 : num % 9;
    }
}

class Solution {
    public int addDigits(int num) {
        String numString = String.valueOf(num);
        if (numString.length() == 1) {
            return num;
        }
        while (numString.length() != 1) {
            int len = numString.length();
            int result = 0;
            for (int i = len - 1; i >= 0; i--) {
                result += numString.charAt(i) - '0';
            }
            numString = String.valueOf(result);
        }
        
        return Integer.parseInt(numString);
    }
}