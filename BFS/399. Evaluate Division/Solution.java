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