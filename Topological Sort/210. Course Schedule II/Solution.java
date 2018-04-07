// 2018.4.7 Topological Sort
class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        List[] edges = new List[numCourses];
        int[] degree = new int[numCourses];
        getInDegree(prerequisites, degree);
        getAllEdges(numCourses, prerequisites, edges);
        
        Queue<Integer> queue = new LinkedList<>();
        putInDegreeZero(queue, degree);
        int[] result = new int[numCourses];
        int count = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int current = queue.poll();
                result[count++] = current;
                for (Integer neighbor : (List<Integer>)edges[current]) {
                    degree[neighbor]--;
                    if (degree[neighbor] == 0) {
                        queue.offer(neighbor);
                    }
                }
            }
        }
        if (count == numCourses) {
            return result;
        }
        return new int[0];
    }
    
    public void getInDegree(int[][] prerequisites, int[] degree) {
        for (int i = 0; i < prerequisites.length; i++) {
            degree[prerequisites[i][0]]++;
        }
    }
    
    public void getAllEdges(int numCourses, int[][] prerequisites, List[] edges) {
        for (int i = 0; i < numCourses; i++) {
            edges[i] = new ArrayList<>();
        }
        for (int i = 0; i < prerequisites.length; i++) {
            edges[prerequisites[i][1]].add(prerequisites[i][0]);
        }
    }
    
    public void putInDegreeZero(Queue<Integer> queue, int[] degree) {
        for (int i = 0; i < degree.length; i++) {
            if (degree[i] == 0) {
                queue.offer(i);
            }
        }
    }
}