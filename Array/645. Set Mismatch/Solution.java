// 9ms
class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] result = new int[2];
        int[] numsFlag = new int[nums.length + 1];
        for (int i = 0; i < nums.length; i++) {
            if (numsFlag[nums[i]] == -1) {
                result[0] = nums[i];
            }
            else {
                numsFlag[nums[i]] = -1;
            }
        }
        for (int i = 1; i <= numsFlag.length; i++) {
            if (numsFlag[i] == 0) {
                result[1] = i;
                break;
            }
        }
        return result;
    }
}

// 58ms
public class Solution {
    public int[] findErrorNums(int[] nums) {
    Map<Integer, Integer> map = new HashMap<Integer, Integer>();
    int n = nums.length;
    int duplicate = 0;
    long sum = (n * (n + 1)) / 2;  
    for (int i : nums) {
        map.put(i, map.getOrDefault(i, 0) + 1);
        if (map.get(i) == 2) {
            duplicate = i;
        }
        sum = sum - i;
    }
    return new int[]{duplicate, (int)sum + duplicate};
    }
}