// O(k * 2^n) time:
// 每个解的长度平均为k, copy list的时间复杂度是O(k)
// 解空间:
// 因为元素只能用一次, 所以对于长度是k的解, 解的个数最多是C(n,k)个, 而一般情况下, 
// 解的个数远小于C(n,k), 那么问题来了, 对于长度为k的解, worst case是什么？
// int[] arr = {1,1,1,1,1,1,1,1,1,1}  target = 2 这时候解的个数才达到C(n,k),
// 注意: 即便在ret.add之前要去重, 我们也是在找到了可行解之后再检查是否是重复解, 所以
//      解空间树是包含重复解的, 所以时间复杂度也包括这些重复解
//
// 还有一点是, 题解的长度并不是固定的, 也就是k可能有多个, 所以可能是C(n,0) ~ C(n,n)
// 中的多个之和, 而我们知道C(n,0) + C(n,1) + C(n,2) + ... C(n,n) = 2^n
// 所以可以把时间复杂度算成O(k * 2^n)
class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> result = new LinkedList<>();
        Arrays.sort(candidates);
        DFS(candidates, 0, target, 0, new LinkedList<>(), result);
        return result;
    }
    
    private void DFS(int[] candidates, int index, int target, int currentSum, 
                     List<Integer> list, List<List<Integer>> result) {
        if (currentSum > target) {
            return;
        }
        
        if (currentSum == target) {
            result.add(new LinkedList<>(list));
        }
        
        for (int i = index; i < candidates.length; i++) {
            if (i > index && candidates[i] == candidates[i - 1]) {
                continue;
            }
            list.add(candidates[i]);
            DFS(candidates, i + 1, target, currentSum + candidates[i], list, result);
            list.remove(list.size() - 1);
        }
    }
}