class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int N = difficulty.length;
        Combination[] set = new Combination[N];
        
        for (int i = 0; i < N; i++) {
            set[i] = new Combination(difficulty[i], profit[i]);
        }
        
        Arrays.sort(set, new Comparator<Combination>() {
            @Override
            public int compare(Combination c1, Combination c2) {
                return c1.difficulty - c2.difficulty;
            }
        });
        Arrays.sort(worker);
        
        int maxProfit = 0;
        int i = 0;
        int temp = 0;
        
        for (int skill : worker) {
            while (i < N && skill >= set[i].difficulty) {
                temp = Math.max(temp, set[i].profit);
                i++;
            }
            maxProfit += temp;
        }
        return maxProfit;
    }
}

class Combination {
    int difficulty;
    int profit;
    public Combination(int d, int p) {
        this.difficulty = d;
        this.profit = p;
    }
}