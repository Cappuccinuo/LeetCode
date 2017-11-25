class Solution {
    public String convertToBase7(int num) {
        if (num == 0) {
            return "0";
        }
        
        boolean neg = false;
        if (num < 0) {
            neg = true;
            num = -num;
        }
        StringBuilder sb = new StringBuilder();

        while (num != 0) {
            sb.append(String.valueOf(num % 7));
            num = num / 7;
        }
        
        if (neg) {
            sb.append("-");
        }
        
        return sb.reverse().toString();
    }
}