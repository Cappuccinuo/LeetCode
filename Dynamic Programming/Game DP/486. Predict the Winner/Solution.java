class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int n = nums.length;
        Pair[][] moves = new Pair[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                moves[i][j] = new Pair(-1, -1, -1);
            }
        }
        
        for (int i = 0; i < n; i++) {
            moves[i][i] = new Pair(nums[i], 0, i);
        }
        
        for (int len = 2; len <= n; len++) {
            for (int i = 0; i <= n - len; i++) {
                int j = i + len - 1;
                if (nums[i] + moves[i + 1][j].second > moves[i][j - 1].second + nums[j]) {
                    moves[i][j].first = nums[i] + moves[i + 1][j].second;
                    moves[i][j].second = moves[i + 1][j].first;
                    moves[i][j].pick = i;
                }
                else {
                    moves[i][j].first = moves[i][j - 1].second + nums[j];
                    moves[i][j].second = moves[i][j - 1].first;
                    moves[i][j].pick = j;
                }
            }
        }
        printSequence(nums, moves);
        return moves[0][n - 1].first >= moves[0][n - 1].second;
    }
    
    private void printSequence(int[] nums, Pair[][] moves) {
        int i = 0;
        int j = moves.length - 1;
        boolean first = true;
        
        for (int k = 0; k < moves.length; k++) {
            int choose = moves[i][j].pick;
            if (first) {
                System.out.println("First pick " + nums[choose]);
            }
            else {
                System.out.println("Second pick " + nums[choose]);
            }
            first = !first;
            
            if (choose <= i) {
                i++;
            }
            else {
                j--;
            }
        }
    }
    
    class Pair {
        int first;
        int second;
        int pick;
        Pair (int f, int s, int p) {
            this.first = f;
            this.second = s;
            this.pick = p;
        }
    }
}