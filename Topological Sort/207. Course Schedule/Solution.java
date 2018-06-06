class Solution {
    Map<Integer, List<Integer>> map;
    Map<Integer, Integer> inDegree;
    
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        map = new HashMap<>();
        inDegree = new HashMap<>();
        getDegreeAndMapping(numCourses, prerequisites);
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree.get(i) == 0) {
                queue.offer(i);
            }
        }
        int count = 0;
        while (!queue.isEmpty()) {
            int course = queue.poll();
            count++;
            for (Integer i : map.get(course)) {
                inDegree.put(i, inDegree.get(i) - 1);
                if (inDegree.get(i) == 0) {
                    queue.offer(i);
                }
            }
        }
        return count == numCourses;
    }
    
    private void getDegreeAndMapping(int numCourses, int[][] prerequisites) {
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new LinkedList<>());
            inDegree.put(i, 0);
        }
        for (int i = 0; i < prerequisites.length; i++) {
            inDegree.put(prerequisites[i][0], inDegree.get(prerequisites[i][0]) + 1);
            map.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }
    }
}