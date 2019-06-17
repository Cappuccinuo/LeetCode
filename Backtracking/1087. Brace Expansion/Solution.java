class Solution {
    public String[] expand(String S) {
        TreeSet<String> set = new TreeSet<>();
        DFS(S, 0, "", set);
        return set.toArray(new String[set.size()]);
    }
    
    private void DFS(String S, int index, String res, TreeSet<String> set) {
        if (index == S.length()) {
            set.add(res);
            return;
        }
        
        char c = S.charAt(index);
        if (c == '{') {
            int nextCurly = S.indexOf('}', index);
            String possible = S.substring(index + 1, nextCurly);
            for (String str : possible.split(",")) {
                DFS(S, nextCurly + 1, res + str, set);
            }
        }
        else {
            DFS(S, index + 1, res + c, set);
        }
    }
}


class Solution {
    public String[] expand(String S) {
        Queue<String> queue = new LinkedList<>();
        int i = 0;
        int len = S.length();
        while (i < len) {
            char c = S.charAt(i);
            if (c == '{') {
                int nextCurly = S.indexOf('}', i);
                updateQueue(S.substring(i + 1, nextCurly), queue);
                i = nextCurly;
            }
            else {
                updateQueue(S.substring(i, i + 1), queue);
            }
            i++;
        }
        
        String[] result = new String[queue.size()];
        i = 0;
        while (!queue.isEmpty()) {
            result[i++] = queue.poll();
        }
        Arrays.sort(result);
        return result;
    }
    
    private void updateQueue(String str, Queue<String> queue) {
        String[] strs = str.split(",");
        int size = queue.size();
        if (size == 0) {
            for (String s : strs) {
                queue.offer(s);
            }
        }
        else {
            int i;
            for (i = 0; i < size; i++) {
                String front = queue.poll();
                for (String s : strs) {
                    queue.offer(front + s);
                }
            }
        }
    }
}