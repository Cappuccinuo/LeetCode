// 2018.5.19
class Solution {
    public List<String> findStrobogrammatic(int n) {
        return getAllStrobogrammatic(n, n);
    }
    
    private List<String> getAllStrobogrammatic(int n, int m) {
        if (n == 0) {
            return new LinkedList<String>(Arrays.asList(""));
        }
        if (n == 1) {
            return new LinkedList<String>(Arrays.asList("0", "1", "8"));
        }
        
        List<String> recur = getAllStrobogrammatic(n - 2, m);
        List<String> result = new LinkedList<String>();
        
        for (int i = 0; i < recur.size(); i++) {
            String str = recur.get(i);
            
            if (n != m) {
                result.add("0" + str + "0");
            }
            result.add("1" + str + "1");
            result.add("6" + str + "9");
            result.add("8" + str + "8");
            result.add("9" + str + "6");
        }
        return result;
    }
}