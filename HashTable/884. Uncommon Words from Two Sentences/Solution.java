class Solution {
    public String[] uncommonFromSentences(String A, String B) {
        Map<String, Integer> amap = new HashMap<>();
        Map<String, Integer> bmap = new HashMap<>();
        
        String[] astrs = A.split("\\s+");
        String[] bstrs = B.split("\\s+");
        
        for (String astr : astrs) {
            amap.put(astr, amap.getOrDefault(astr, 0) + 1);
        }
        
        for (String bstr : bstrs) {
            bmap.put(bstr, bmap.getOrDefault(bstr, 0) + 1);
        }
        
        List<String> result = new LinkedList<>();
        for (String astr : astrs) {
            if (!bmap.containsKey(astr) && amap.get(astr) == 1) {
                result.add(astr);
            }
        }
        for (String bstr : bstrs) {
            if (!amap.containsKey(bstr) && bmap.get(bstr) == 1) {
                result.add(bstr);
            }
        }
        String[] ans = new String[result.size()];
        int index = 0;
        for (String res : result) {
            ans[index++] = res;
        }
        return ans;
    }
}