class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        List<List<String>> result = new LinkedList<>();
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strings) {
            String symbol = flag(s);
            if (!map.containsKey(symbol)) {
                map.put(symbol, new LinkedList<>());
            }
            map.get(symbol).add(s);
        }
        for (String key : map.keySet()) {
            result.add(map.get(key));
        }
        return result;
    }
    
    private String flag(String str) {
        char[] array = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length - 1; i++) {
            char a = array[i];
            char b = array[i + 1];
            int val = (b - a) > 0 ? b - a : b - a + 26;
            sb.append(val);
            sb.append("#");
        }
        return sb.toString();
    }
}