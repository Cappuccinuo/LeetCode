class Solution {
    private List<String> result = new ArrayList<>();
    
    public List<String> generateParenthesis(int n) {
        generate("", 0, 0, 2 * n);
        return result;
    }
    
    public void generate(String current, int start, int end, int limitLen) {
        if (current.length() == limitLen) {
            result.add(current);
            return;
        }
        
        if (start < limitLen / 2) {
            generate(current + "(", start + 1, end, limitLen);
        }
        if (end < start) {
            generate(current + ")", start, end + 1, limitLen);
        }
    }
}