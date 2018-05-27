// BFS
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int len = rooms.size();
        Queue<Integer> queue = new LinkedList<>();
        boolean[] canVisit = new boolean[len];
        queue.add(0);
        canVisit[0] = true;
        
        while (!queue.isEmpty()) {
            int front = queue.poll();
            for (int room : rooms.get(front)) {
                if (!canVisit[room]) {
                    canVisit[room] = true;
                    queue.offer(room);
                }
            }
        }
        
        for (int i = 1; i < len; i++) {
            if (!canVisit[i]) {
                return false;
            }
        }
        return true;
    }
}

// DFS
class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int len = rooms.size();
        
        Stack<Integer> stack = new Stack<>();
        boolean[] canVisit = new boolean[len];
        stack.push(0);
        canVisit[0] = true;
        
        while (!stack.isEmpty()) {
            int front = stack.pop();
            for (int room : rooms.get(front)) {
                if (!canVisit[room]) {
                    canVisit[room] = true;
                    stack.push(room);
                }
            }
        }
        
        for (int i = 1; i < len; i++) {
            if (!canVisit[i]) {
                return false;
            }
        }
        return true;
    }
}