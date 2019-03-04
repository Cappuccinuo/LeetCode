// 2019.3.4
class Solution {
    int N;
    
    public int snakesAndLadders(int[][] board) {
        N = board.length;
        int i, j;
        Queue<Integer> queue = new LinkedList<>();
        boolean[] visited = new boolean[N * N + 1];
        
        queue.offer(1);
        visited[1] = true;
        int step = 0;
        
        while (!queue.isEmpty()) {
            int size = queue.size();
            
            for (i = 0; i < size; i++) {
                int front = queue.poll();
                if (front == N * N) {
                    return step;
                }
                
                for (j = 1; j <= 6; j++) {
                    int new_index = front + j;
                    int[] ind = getIndex(new_index);
                    if (!inBound(ind[0], ind[1])) {
                        continue;
                    }
                    int val = board[ind[0]][ind[1]];
                    if (!visited[new_index]) {
                        if (val != -1) {
                            queue.offer(val);
                        }
                        else {
                            queue.offer(new_index);
                        }
                        
                        visited[new_index] = true;
                    }
                }
            }
            
            step++;
        }
        
        return -1;
    }
    
    private boolean inBound(int i, int j) {
        return i >= 0 && i < N && j >= 0 && j < N;
    }
    
    private int[] getIndex(int number) {
        if (number < 1 || number > N * N) {
            return new int[]{-1, -1};
        }
        int row = N - 1 - (number - 1) / N;
        int col = 0;
        if (N % 2 == 0) {
            if (row % 2 == 1) {
                col = (number - 1) % N;
            }
            else {
                col = N - 1 - (number - 1) % N;
            }
        }
        else {
            if (row % 2 == 0) {
                col = (number - 1) % N;
            }
            else {
                col = N - 1 - (number - 1) % N;
            }
        }
        return new int[]{row, col};
    }
}


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