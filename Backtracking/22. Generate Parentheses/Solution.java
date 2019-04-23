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

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new LinkedList<>();
        DFS(result, "", 0, 0, n);
        return result;
    }
    
    private void DFS(List<String> result, String current, int left, int right, int n) {
        if (left < right || left > n || right > n) {
            return;
        }
        
        if (left == n && right == n) {
            result.add(current);
            return;
        }
        
        DFS(result, current + "(", left + 1, right, n);
        DFS(result, current + ")", left, right + 1, n);
    }
}