class Solution {
    public int countCornerRectangles(int[][] grid) {
        int count = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int[] row : grid) {
            for (int i = 0; i < row.length - 1; i++) if (row[i] == 1) {
                for (int j = i + 1; j < row.length; j++) if (row[j] == 1) {
                    int hash = 200 * i + j;
                    int val = map.getOrDefault(hash, 0);
                    count += val;
                    map.put(hash, val + 1);
                }
            }
        }
        return count;
    }
}

class Solution {
    public int countCornerRectangles(int[][] grid) {
        int count = 0;
        List<List<Integer>> list = new ArrayList();
        for (int i = 0; i < grid.length; i++) {
            list.add(new ArrayList());
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    list.get(i).add(j);
                    count++;
                }
            }
        }
        
        int result = 0;
        int N = (int)Math.sqrt(count);
        Map<Integer, Integer> map = new HashMap();
        
        for (int i = 0; i < grid.length; i++) {
            List<Integer> row = list.get(i);
            if (row.size() >= N) {   
                Set<Integer> set = new HashSet(row);
                for (int j = 0; j < grid.length; j++) {
                    if (j <= i && list.get(j).size() >= N) {
                        continue;
                    }
                    int found = 0;
                    for (int index : list.get(j)) {
                        if (set.contains(index)) {
                            found++;
                        }
                    }
                    result += found * (found - 1) / 2;
                }
            }
            else {
                for (int k = 0; k < row.size(); k++) {
                    int first = row.get(k);
                    for (int m = k + 1; m < row.size(); m++) {
                        int second = row.get(m);
                        int hash = 200 * first + second;
                        result += map.getOrDefault(hash, 0);
                        map.put(hash, map.getOrDefault(hash, 0) + 1);
                    }
                }
            }
        }
        return result;
    }
}