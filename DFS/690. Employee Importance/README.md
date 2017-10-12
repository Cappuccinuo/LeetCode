Time spent : 30 min

Solution : EmployeeList id -> Totalimportance

GIVEN: a list of Employee, an employee id

RETURNS: the total importance value of this 

​                  employee and all his subordinates

EXAMPLES:

Input: [[1, 5, [2, 3]], [2, 3, []], [3, 3, []]], 1

Output: 11(5 + 3 + 3 = 11)

DESIGN STRATEGY: Use observer template of Employee



1. We can call the given id employee manager, and get his information first

   **Note : the problem doesn't say anything about the id order, so it might start from 2 or 3..**

   `for (Employee e : employees) {`

   ​	`if (e.id == id) {`

   ​	`...`

   ​	`}`

   `}`

2. Then get his subordinates, which is a list

   `List<Integer> sub = e.subordinates;`

3. View the ID(s) in sub list new manager(s), calculate their importance recursively, using getImportance() function

   `sum += getImportance(employees, sub.get(i));`

4. Finally, sum is the total importance.