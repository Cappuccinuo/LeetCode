class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        boolean visited[] = new boolean[n * n + 1];
        int[] move = changeToOneD(board, n);
        int result = 0;
        Queue<Integer> queue = new LinkedList<>();
        int start = (move[1] > -1 ? move[1] : 1);
        queue.offer(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int val = queue.poll();

                if (val == n * n) {
                    return result;
                }

                for (int z = val + 1; z <= Math.min(val + 6, n * n); z++) 
                {
                    int next = (move[z] > -1) ? move[z] : z;
                    if (!visited[next])
                    {
                        queue.offer(next);
                        visited[next] = true;
                    }
                }
            }
            result++;
        }

        return -1;
    }
    
    private int[] changeToOneD(int[][] board, int n) {
        int N = board.length;
        int[] move = new int[N * N + 1];
        
        int i = n - 1;
        int j = 0;
        boolean forward = true;
        int count = 1;
        while (count != n * n + 1) {
            move[count] = board[i][j];
            if (forward) {
                j++;
            }
            else {
                j--;
            }
            
            if (forward && j == n) {
                forward = false;
                i--;
                j = n - 1;
            }
            else if (!forward && j == -1) {
                forward = true;
                i--;
                j = 0;
            }
            count++;
        }
        return move;
    }
}