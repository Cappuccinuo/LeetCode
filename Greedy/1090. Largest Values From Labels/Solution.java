class Solution {
    public int largestValsFromLabels(int[] values, int[] labels, int num_wanted, int use_limit) {
        Map<Integer, Integer> labelMap = new HashMap<>();
        int i;
        int len = values.length;
        int result = 0;
        Pair[] pairs = new Pair[len];
        for (i = 0; i < len; i++) {
            pairs[i] = new Pair(values[i], labels[i]);
        }
        Arrays.sort(pairs, new Comparator<Pair>(){
            @Override
            public int compare(Pair p1, Pair p2) {
                return p2.value - p1.value;
            }
        });
        int count = 0;
        for (i = 0; i < len && count < num_wanted; i++) {
            if (labelMap.getOrDefault(pairs[i].label, 0) >= use_limit) {
                continue;
            }
            result += pairs[i].value;
            labelMap.put(pairs[i].label, labelMap.getOrDefault(pairs[i].label, 0) + 1);
            count++;
        }
        return result;
    }
}

class Pair {
    int value;
    int label;
    Pair (int v, int l) {
        value = v;
        label = l;
    }
}