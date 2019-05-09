class Solution {
    public List<List<String>> findDuplicate(String[] paths) {
        List<List<String>> result = new LinkedList<>();
        if (paths == null || paths.length == 0) {
            return result;
        }
        Map<String, List<String>> map = new HashMap<>();
        for (String path : paths) {
            String[] parts = path.split("\\s+");
            String root = parts[0];
            int i;
            for (i = 1; i < parts.length; i++) {
                String content = parts[i].substring(parts[i].indexOf("("), parts[i].indexOf(")"));
                if (!map.containsKey(content)) {
                    map.put(content, new LinkedList<>());
                }
                map.get(content).add(root + "/" + parts[i].substring(0, parts[i].indexOf("(")));
            }
        }
        for (String key : map.keySet()) {
            if (map.get(key).size() == 1) {
                continue;
            }
            result.add(map.get(key));
        }
        return result;
    }
}