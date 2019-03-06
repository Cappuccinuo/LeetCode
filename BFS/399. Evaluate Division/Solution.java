// 3.5
// BFS
import javafx.util.Pair;

class Solution {
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        Map<String, List<Pair>> graph = new HashMap<>();
        int i;
        int len = values.length;
        for (i = 0; i < len; i++) {
            String[] equation = equations[i];
            String a = equation[0];
            String b = equation[1];
            
            if (!graph.containsKey(a)) {
                graph.put(a, new LinkedList<>());
            }
            if (!graph.containsKey(b)) {
                graph.put(b, new LinkedList<>());
            }
            graph.get(a).add(new Pair(b, values[i]));
            graph.get(b).add(new Pair(a, 1.0 / values[i]));
        }
        len = queries.length;
        double[] result = new double[len];
        
        i = 0;
        for (String[] query : queries) {
            result[i] = BFS(query, graph);
            if (result[i] != -1) {
                graph.get(query[0]).add(new Pair(query[1], result[i]));
                graph.get(query[1]).add(new Pair(query[0], 1.0 / result[i]));
            }
            i++;
        }
        
        return result;
    }
    
    private double BFS(String[] query, Map<String, List<Pair>> graph) {
        String a = query[0];
        String b = query[1];
        
        if (!graph.containsKey(a) || !graph.containsKey(b)) {
            return -1.0;
        }
        
        Queue<Pair> queue = new LinkedList<>();
        Set<Pair> visited = new HashSet();
        Pair<String, Double> start = new Pair(a, 1.0);
        queue.offer(start);
        visited.add(start);
        
        while (!queue.isEmpty()) {
            Pair front = queue.poll();
            String d = (String)front.getKey();
            double val = (double)front.getValue();
            if (d.equals(b)) {
                return val;
            }
            for (Pair nei : graph.get(d)) {
                if (visited.contains(nei)) {
                    continue;
                }
                Pair<String, Double> temp = new Pair(nei.getKey(), val * (double)nei.getValue());
                queue.offer(temp);
                visited.add(temp);
            }
        }
        
        return -1.0;
    }
}

// Union-Find
class Solution {
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        int equationLen = equations.length;
        int queryLen = queries.length;
        
        double[] result = new double[queryLen];
        
        int i;
        UnionFind uf = new UnionFind();
        for (i = 0; i < equationLen; i++) {
            String[] equation = equations[i];
            String a = equation[0];
            String b = equation[1];
            double val = values[i];
            uf.init(a);
            uf.init(b);
            uf.union(a, b, val);
        }
        
        for (i = 0; i < queryLen; i++) {
            String[] query = queries[i];
            String a = query[0];
            String b = query[1];
            if (!uf.validNode(a) || !uf.validNode(b)) {
                result[i] = -1.0;
                continue;
            }
            
            String root_a = uf.find(a);
            String root_b = uf.find(b);
            if (!root_a.equals(root_b)) {
                result[i] = -1.0;
                continue;
            }
            
            result[i] = uf.getResult(a, b);
        }
        
        return result;
    }
}

class UnionFind {
    Map<String, String> father;
    Map<String, Double> distanceToFather;
    
    UnionFind() {
        father = new HashMap<>();
        distanceToFather = new HashMap<>();
    }
    
    void init(String x) {
        if (!father.containsKey(x)) {
            father.put(x, x);
            distanceToFather.put(x, 1.0);
        }
    }
    
    void union(String a, String b, double factor) {
        String root_a = find(a);
        String root_b = find(b);
        if (root_a != root_b) {
            father.put(root_a, root_b);
            distanceToFather.put(root_a, distanceToFather.get(b) * factor / distanceToFather.get(a));
        }
    }
    
    String find(String x) {
        if (father.get(x).equals(x)) {
            return x;
        }
        Stack<String> stack = new Stack<>();
        while (!father.get(x).equals(x)) {
            stack.push(x);
            x = father.get(x);
        }
        String prevParent = x;
        while (!stack.isEmpty()) {
            String temp = stack.pop();
            father.put(temp, x);
            distanceToFather.put(temp, distanceToFather.get(prevParent) * distanceToFather.get(temp));
            prevParent = temp;
        }
        return x;
    }
    
    boolean validNode(String x) {
        return father.containsKey(x);
    }
    
    double getResult(String a, String b) {
        return distanceToFather.get(a) / distanceToFather.get(b);
    }
}

//////

class Solution {
    public double[] calcEquation(String[][] equations, double[] values, String[][] queries) {
        Map<String, List<Pair>> map = new HashMap<>();
        for (int i = 0; i < equations.length; i++) {
            String[] equation = equations[i];
            double val = values[i];
            if (!map.containsKey(equation[0])) {
                map.put(equation[0], new LinkedList<Pair>());
            }
            map.get(equation[0]).add(new Pair(equation[1], val));
            if (!map.containsKey(equation[1])) {
                map.put(equation[1], new LinkedList<Pair>());
            }
            map.get(equation[1]).add(new Pair(equation[0], val == 0 ? 0 : 1 / val));
        }
        int index = 0;
        double[] result = new double[queries.length];
        Arrays.fill(result, -1);
        for (String[] query : queries) {
            if (!map.containsKey(query[0]) || !map.containsKey(query[1])) {
                result[index++] = -1;
                continue;
            }
            
            Queue<Pair> queue = new LinkedList<>();
            Set<String> visited = new HashSet();
            String src = query[0];
            String dst = query[1];

            queue.offer(new Pair(src, 1));
            
            while (!queue.isEmpty()) {
                Pair front = queue.poll();
                visited.add(front.val);
                
                if (front.val.equals(dst)) {
                    result[index] = front.division;
                    break;
                }
                
                for (Pair p : map.get(front.val)) {
                    String s = p.val;
                    
                    if (!visited.contains(s)) {
                        queue.offer(new Pair(s, front.division * p.division));
                    }
                }
            }
            index++;
        }
        return result;
    }
}

class Pair {
    String val;
    double division;
    Pair(String v, double d) {
        this.val = v;
        this.division = d;
    }
}