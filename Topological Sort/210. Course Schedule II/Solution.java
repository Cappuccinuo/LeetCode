// 2018.6.6
class Solution {
    Map<Integer, List<Integer>> map;
    Map<Integer, Integer> inDegree;
    
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        map = new HashMap<>();
        inDegree = new HashMap<>();
        getIndegreeAndNeighbour(numCourses, prerequisites);
        
        Queue<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegree.get(i) == 0) {
                queue.offer(i);
            }
        }
        
        int count = 0;
        int[] result = new int[numCourses];
        
        while (!queue.isEmpty()) {
            int currCourse = queue.poll();
            result[count] = currCourse;
            count++;
            for (Integer i : map.get(currCourse)) {
                inDegree.put(i, inDegree.get(i) - 1);
                if (inDegree.get(i) == 0) {
                    queue.offer(i);
                }
            }
        }
        
        if (count == numCourses) {
            return result;
        }
        
        return new int[0];
    }
    
    private void getIndegreeAndNeighbour(int numCourses, int[][] prerequisites) {
        for (int i = 0; i < numCourses; i++) {
            map.put(i, new LinkedList<>());
            inDegree.put(i, 0);
        }
        
        for (int i = 0; i < prerequisites.length; i++) {
            map.get(prerequisites[i][1]).add(prerequisites[i][0]);
            inDegree.put(prerequisites[i][0], inDegree.get(prerequisites[i][0]) + 1);
        }
    }
}

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