class Solution {
    public String fractionToDecimal(int numerator, int denominator) {
        if (numerator == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        if ((numerator > 0) ^ (denominator > 0)) {
            sb.append('-');
        }
        long n = Math.abs((long)numerator);
        long d = Math.abs((long)denominator);
        long left = n / d;
        sb.append(left);
        long right = n % d;
        if (right == 0) {
            return sb.toString();
        }
        sb.append('.');
        Map<Long, Integer> map = new HashMap<>();
        map.put(right, sb.length());
        while (right != 0) {
            right = right * 10;
            sb.append(right / d);
            right = right % d;
            if (map.containsKey(right)) {
                sb.insert(map.get(right), "(");
                sb.append(")");
                break;
            }
            else {
                map.put(right, sb.length());
            }
        }
        return sb.toString();
    }
}