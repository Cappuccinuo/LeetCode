// 2018.4.12
/**
 * Definition for undirected graph.
 * class UndirectedGraphNode {
 *     int label;
 *     List<UndirectedGraphNode> neighbors;
 *     UndirectedGraphNode(int x) { label = x; neighbors = new ArrayList<UndirectedGraphNode>(); }
 * };
 */
public class Solution {
    public UndirectedGraphNode cloneGraph(UndirectedGraphNode node) {
        if (node == null) {
            return null;
        }
        
        // find all nodes
        List<UndirectedGraphNode> nodes = findAllNodes(node);
        
        // mapping old nodes to new nodes
        Map<UndirectedGraphNode, UndirectedGraphNode> map = copyNodes(nodes);
        
        // connect all edges
        connectNeighbors(nodes, map);
        
        return map.get(node);
    }
    
    private List<UndirectedGraphNode> findAllNodes(UndirectedGraphNode node) {
        List<UndirectedGraphNode> nodes = new ArrayList<>();
        Queue<UndirectedGraphNode> queue = new LinkedList<>();
        Set<UndirectedGraphNode> hash = new HashSet();
        
        // 1. add start node to queue & hash
        queue.offer(node);
        hash.add(node);
        nodes.add(node);
        
        // 2. bfs
        while (!queue.isEmpty()) {
            UndirectedGraphNode head = queue.poll();
            for (UndirectedGraphNode neighbor : head.neighbors) {
                if (hash.contains(neighbor)) {
                    continue;
                }
                nodes.add(neighbor);
                queue.offer(neighbor);
                hash.add(neighbor);
            }
        }
        return nodes;
    }
    
    private Map<UndirectedGraphNode, UndirectedGraphNode> copyNodes(List<UndirectedGraphNode> nodes) {
        Map<UndirectedGraphNode, UndirectedGraphNode> map = new HashMap<>();
        for (UndirectedGraphNode node : nodes) {
            map.put(node, new UndirectedGraphNode(node.label));
        }
        return map;
    }
    
    private void connectNeighbors(List<UndirectedGraphNode> nodes, Map<UndirectedGraphNode, UndirectedGraphNode> map) {
        for (UndirectedGraphNode node : nodes) {
            for (UndirectedGraphNode neighbor : node.neighbors) {
                UndirectedGraphNode newNode = map.get(node);
                UndirectedGraphNode newNeighbor = map.get(neighbor);
                newNode.neighbors.add(newNeighbor);
            }
        }
    }
}