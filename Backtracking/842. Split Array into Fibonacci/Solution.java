class Solution {
    public List<Integer> splitIntoFibonacci(String S) {
        List<Integer> result = new ArrayList<>();
        helper(S, result, 0);
        return result;
    }
    
    private boolean helper(String S, List<Integer> result, int idx) {
        if (S.length() == idx && result.size() >= 3) {
            return true;
        }
        
        for (int i = idx; i < S.length(); i++) {
            if (i > idx && S.charAt(idx) == '0') {
                break;
            }
            long num = Long.parseLong(S.substring(idx, i + 1));
            if (num > Integer.MAX_VALUE) {
                break;
            }
            if (result.size() >= 2 && num > result.get(result.size() - 1) + result.get(result.size() - 2)) {
                break;
            }
            if (result.size() <= 1 || num == result.get(result.size() - 1) + result.get(result.size() - 2)) {
                result.add((int)num);
                if (helper(S, result, i + 1)) {
                    return true;
                }
                result.remove(result.size() - 1);
            }
        }
        return false;
    }
}