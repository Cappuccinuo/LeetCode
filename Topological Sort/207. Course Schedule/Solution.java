// 2018.4.6 Topological Sort
class Solution {
    Map<Integer, List<Integer>> map;
    Map<Integer, Integer> inorder;
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        map = new HashMap<Integer, List<Integer>>();
        inorder = new HashMap<Integer, Integer>();
        addPreToMap(prerequisites, numCourses);
        getInDegree(prerequisites, numCourses);
        for (Integer i : map.keySet()) {
            System.out.println("i: " + i + ", list: " + map.get(i));
        }
        
        for (Integer i : inorder.keySet()) {
            System.out.println("i: " + i + ", list: " + inorder.get(i));
        }
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inorder.get(i) == 0) {
                queue.offer(i);
            }
        }
        
        int count = 0;
        while (!queue.isEmpty()) {
            int course = queue.poll();
            count++;
            List<Integer> pre = map.get(course);
            for (int i = 0; i < pre.size(); i++) {
                int current = pre.get(i);
                inorder.put(current, inorder.get(current) - 1);
                if (inorder.get(current) == 0) {
                    queue.offer(current);
                }
            }
        }
        return count == numCourses;
    }
    
    public void addPreToMap(int[][] prerequisites, int numCourses) {
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new ArrayList<Integer>());
        }
        for (int i = 0; i < prerequisites.length; i++) {
            map.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
    }
    
    public void getInDegree(int[][] prerequisites, int numCourses) {
        for (int i = 0; i < numCourses; i++) {
            inorder.put(i, 0);
        }
        for (int i = 0; i < prerequisites.length; i++) {
            inorder.put(prerequisites[i][0], inorder.get(prerequisites[i][0]) + 1);
        }
    }
}