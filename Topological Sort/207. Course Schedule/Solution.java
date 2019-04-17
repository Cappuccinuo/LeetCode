class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, Set<Integer>> graph = constructGraph(prerequisites, numCourses);
        return topologicalSort(graph, numCourses);
    }
    
    private Map<Integer, Set<Integer>> constructGraph(int[][] prerequisites, int numCourses) {
        Map<Integer, Set<Integer>> graph = new HashMap<>();
        int i;
        for (i = 0; i < numCourses; i++) {
            graph.put(i, new HashSet());
        }
        
        for (int[] prerequisite : prerequisites) {
            int from = prerequisite[0];
            int to = prerequisite[1];
            graph.get(from).add(to);
        }
        
        return graph;
    }
    
    private boolean topologicalSort(Map<Integer, Set<Integer>> graph, int numCourses) {
        Map<Integer, Integer> indegree = getIndegree(graph, numCourses);
        Queue<Integer> queue = new LinkedList<>();
        putZeroIndegreeInQueue(indegree, queue, numCourses);
        List<Integer> path = new LinkedList<>();
        updateNeighbours(graph, indegree, queue, path);
        return path.size() == numCourses;
    }
    
    private Map<Integer, Integer> getIndegree(Map<Integer, Set<Integer>> graph, int numCourses) {
        Map<Integer, Integer> indegree = new HashMap<>();
        int i;
        for (i = 0; i < numCourses; i++) {
            indegree.put(i, 0);
        }
        
        for (Integer key : graph.keySet()) {
            for (Integer neighbour : graph.get(key)) {
                indegree.put(neighbour, indegree.get(neighbour) + 1);
            }
        }
        return indegree;
    }
    
    private void putZeroIndegreeInQueue(Map<Integer, Integer> indegree, Queue<Integer> queue, int numCourses) {
        int i;
        for (i = 0; i < numCourses; i++) {
            if (indegree.get(i) == 0) {
                queue.offer(i);
            }
        }
    }
    
    private void updateNeighbours(Map<Integer, Set<Integer>> graph, Map<Integer, Integer> indegree,
                                 Queue<Integer> queue, List<Integer> path) {
        while (!queue.isEmpty()) {
            int front = queue.poll();
            path.add(front);
            for (Integer neighbour : graph.get(front)) {
                if (indegree.get(neighbour) == 0) {
                    continue;
                }
                indegree.put(neighbour, indegree.get(neighbour) - 1);
                if (indegree.get(neighbour) == 0) {
                    queue.offer(neighbour);
                }
            }
        }
    }
}


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