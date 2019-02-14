class Solution {
    Character[] values = new Character[]{'A', 'C', 'G', 'T'};
    
    public int minMutation(String start, String end, String[] bank) {
        if (start.equals(end)) {
            return 0;
        }
        
        Set<String> dict = new HashSet();
        for (String b : bank) {
            dict.add(b);
        }
                
        Set<String> visited = new HashSet();
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        visited.add(start);
        
        int mutation = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                String front = queue.poll();
                if (front.equals(end)) {
                    return mutation;
                }

                for (String neighbour : getNeighbour(front, dict)) {
                    if (!visited.contains(neighbour)) {
                        queue.offer(neighbour);
                        visited.add(neighbour);
                    }
                }
            }
            mutation++;
        }
        
        return -1;
    }
    
    private List<String> getNeighbour(String str, Set<String> dict) {
        char[] array = str.toCharArray();
        List<String> result = new LinkedList<>();
        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            for (int k = 0; k < values.length; k++) {
                if (values[k] == c) {
                    continue;
                }
                array[i] = values[k];
                String newStr = new String(array);
                if (dict.contains(newStr)) {
                    result.add(newStr);
                }
                array[i] = c;
            }
        }
        return result;
    }
}