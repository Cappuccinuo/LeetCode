// 2018.5.28
// BFS
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int result = 0;
        
        Map<Integer, Employee> map = new HashMap<>();
        for (int i = 0; i < employees.size(); i++) {
            map.put(employees.get(i).id, employees.get(i));
        }
        
        Queue<Employee> queue = new LinkedList<>();
        queue.offer(map.get(id));
        
        while (!queue.isEmpty()) {
            Employee front = queue.poll();
            result += front.importance;
            for (int subordinate : front.subordinates) {
                queue.offer(map.get(subordinate));
            }
        }
        
        return result;
    }
}


/*
// Employee info
class Employee {
    // It's the unique id of each node;
    // unique id of this employee
    public int id;
    // the importance value of this employee
    public int importance;
    // the id of direct subordinates
    public List<Integer> subordinates;
};
*/
class Solution {
    public int getImportance(List<Employee> employees, int id) {
        int sum = 0;
        for (Employee e : employees) {
            if (e.id == id) {
                sum += e.importance;
                List<Integer> sub = e.subordinates;
                for (int i = 0; i < sub.size(); i++) {
                    sum += getImportance(employees, sub.get(i));
                }
            }
        }
        return sum;
    }   
}