class Solution {
    public List<String> beforeAndAfterPuzzles(String[] phrases) {
        Map<String, List<Integer>> first = new HashMap<>();
        Set<String> res = new TreeSet<>();
        int index = 0;
        
        for (String phrase : phrases) {
            String[] seperate = phrase.split("\\s+");
            String front = seperate[0];

            if (!first.containsKey(front)) {
                first.put(front, new LinkedList<>());
            }
            first.get(front).add(index);
            index++;
        }
        
        index = 0;
        
        for (String phrase : phrases) {
            int last = phrase.lastIndexOf(" ");
            String end = last >= 0 ? phrase.substring(last + 1) : phrase;
            if (first.containsKey(end)) {
                List<Integer> list = first.get(end);
                for (int i : list) {
                    if (index == i) {
                        continue;
                    }
                    res.add(phrase + phrases[i].substring(end.length()));
                }
            }
            index++;
        }
        
        return new LinkedList<>(res);
    }
}