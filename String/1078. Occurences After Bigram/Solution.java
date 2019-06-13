class Solution {
    public String[] findOcurrences(String text, String first, String second) {
        String[] words = text.split("\\s+");
        int end = 0;
        int len = words.length;
        List<String> result = new LinkedList<>();
        
        while (end < len) {
            if (end > 0) {
                String a = words[end - 1];
                String b = words[end];
                if (a.equals(first) && b.equals(second)) {
                    if (end != len - 1) {
                        result.add(words[end + 1]);
                    }
                }
            }
            end++;
        }

        return result.toArray(new String[result.size()]);
    }
}