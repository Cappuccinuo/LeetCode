class Solution {
    public String baseNeg2(int N) {
        if (N == 0) {
            return "0";
        }
        StringBuilder sb = new StringBuilder();
        while (N != 0) {
            sb.insert(0, (N & 1));
            N = -(N >> 1);
        }
        return sb.toString();
    }
}