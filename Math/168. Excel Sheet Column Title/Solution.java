class Solution {
    public String convertToTitle(int n) {
        StringBuilder sb = new StringBuilder();
        while (n > 0) {
            n--;
            int temp = n % 26;
            char c = (char)('A' + temp);
            sb.append(c);
            n = n / 26;
        }
        return sb.reverse().toString();
    }
}

class Solution {
    public String convertToTitle(int n) {
        String result = "";
        while (n != 0) {
            char ch = (char)(((n - 1) % 26) + 65);
            n = (n - 1) / 26;
            result = ch + result; 
        }
        return result;
    }
}