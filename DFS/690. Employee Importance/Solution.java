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