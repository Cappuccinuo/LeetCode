/*
 * // This is the custom function interface.
 * // You should not implement it, or speculate about its implementation
 * class CustomFunction {
 *     // Returns f(x, y) for any given positive integers x and y.
 *     // Note that f(x, y) is increasing with respect to both x and y.
 *     // i.e. f(x, y) < f(x + 1, y), f(x, y) < f(x, y + 1)
 *     public int f(int x, int y);
 * };
 */
class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> result = new LinkedList<>();
        int i = 1;
        int j = 1000;
        while (i < 1001 && j > 0) {
            int val = customfunction.f(i, j);
            if (val < z) {
                i++;
            }
            else if (val > z) {
                j--;
            }
            else {
                List<Integer> list = new LinkedList<>();
                list.add(i);
                list.add(j);
                result.add(list);
                i++;
                j--;
            }
        }
        return result;
    }
}

class Solution {
    public List<List<Integer>> findSolution(CustomFunction customfunction, int z) {
        List<List<Integer>> result = new LinkedList<>();
        int i, j;
        for (i = 1; i <= 1000; i++) {
            int start = 1;
            int end = 1000;
            while (start + 1 < end) {
                j = start + (end - start) / 2;
                int val = customfunction.f(i, j);
                if (val < z) {
                    start = j;
                } 
                else {
                    end = j;
                }
            }
            if (customfunction.f(i, start) == z) {
                List<Integer> list = new LinkedList<>();
                list.add(i);
                list.add(start);
                result.add(list);
            }
            if (customfunction.f(i, end) == z) {
                List<Integer> list = new LinkedList<>();
                list.add(i);
                list.add(end);
                result.add(list);
            }
        }
        return result;
    }
}