class Solution {
    public int openLock(String[] deadends, String target) {
        Set<String> dead = new HashSet();
        for (String deadend : deadends) {
            dead.add(deadend);
        }
        
        Queue<String> queue = new LinkedList<>();
        queue.offer("0000");
        queue.offer(null);
        
        Set<String> visited = new HashSet();
        visited.add("0000");
        
        int depth = 0;
        
        while (!queue.isEmpty()) {
            String front = queue.poll();
            if (front == null) {
                depth++;
                if (queue.peek() != null) {
                    queue.offer(null);
                }
            }
            else if (front.equals(target)) {
                return depth;
            }
            else if (!dead.contains(front)) {
                for (int i = 0; i < 4; i++) {
                    for (int d = -1; d <= 1; d += 2) {
                        int change = ((front.charAt(i) - '0') + d + 10) % 10;
                        String afterChange = front.substring(0, i) + (change + "") + front.substring(i + 1);
                        if (!visited.contains(afterChange)) {
                            queue.offer(afterChange);
                            visited.add(afterChange);
                        }
                    }
                }
            }
        }
        
        return -1;
    }
}